package by.it_academy.shalimov.jd01_06;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class TaskB2 {
    public static void main(String[] args) {
        step2();
    }

    static void step2() {
       String[] lines = Poem.getText().split("[.!]{1,}");
        Pattern pattern = Pattern.compile("[\\p{Punct}]{1,}");
        Pattern pattern1 = Pattern.compile("[\n]{1,}");
        Pattern pattern2 = Pattern.compile("[' ']{1,}");

        for (int i = 0; i < lines.length; i++) {
            StringBuilder sb = new StringBuilder(lines[i]);
            Matcher matcher = pattern.matcher(sb);
            while (matcher.find()) {
                int start = matcher.start();
                int finish = matcher.end();
                sb.delete(start, finish);
                matcher.reset();
            }
            matcher.reset();
            matcher = pattern1.matcher(sb);
            while(matcher.find()){
                int start = matcher.start();
                if(start!=0){
                sb.setCharAt(start, ' ');
                matcher.reset();}
                else{
                    sb.deleteCharAt(start);
                matcher.reset();}
            }
            matcher.reset();

            lines[i] = sb.toString();
        }

        for (int i = lines.length - 1; i > 0; i--) {
            for (int j = 0; j < i; j++) {

                if (lines[j].length() > lines[j + 1].length()) {
                    String tmp = lines[j];
                    lines[j] = lines[j + 1];
                    lines[j + 1] = tmp;
                }
            }
        }
        for (String line : lines)
            System.out.println(line);
    }
}
