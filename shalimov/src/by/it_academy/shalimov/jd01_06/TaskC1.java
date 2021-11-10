package by.it_academy.shalimov.jd01_06;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class TaskC1 {
    public static void main(String[] args) {
        step1();
    }
    static int bigestString(String poem) {
        String[] lines = poem.split("\n");

        for (int i = lines.length - 1; i > 0; i--) {
            for (int j = 0; j < i; j++) {

                if (lines[j].length() > lines[j + 1].length()) {
                    String tmp = lines[j];
                    lines[j] = lines[j + 1];
                    lines[j + 1] = tmp;
                }
            }
        }
        return lines[lines.length - 1].length();
    }

    static void step1() {
        int length = bigestString(Poem.getText().trim());
        Pattern pattern = Pattern.compile("[ ]{1,}");
        Pattern pattern1 = Pattern.compile("[#]");
        String finalStr = new String();
        for (String line : Poem.getText().split("\n")) {
            StringBuffer sb = new StringBuffer(line);
            int currentLenght = sb.length();
            String insert = "#";
            Matcher matcher = pattern.matcher(sb);
            while (sb.length() < length) {
                while (matcher.find()) {
                    if (sb.length() < length)
                        sb.insert(matcher.end(), insert);
                    else
                        break;
                }
                matcher.reset();
            }
            matcher = pattern1.matcher(sb);
            while (matcher.find()) {
                int start = matcher.start();
                sb.setCharAt(start, ' ');
            }
            finalStr+=(sb);
            finalStr+=('\n');
        }
        System.out.println(finalStr);
    }
}
