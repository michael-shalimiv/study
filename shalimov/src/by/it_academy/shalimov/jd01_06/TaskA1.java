package by.it_academy.shalimov.jd01_06;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class TaskA1 {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder(Poem.getText());
        Pattern pattern = Pattern.compile("[а-яА-ЯЁё]{4,}");
        Matcher matcher = pattern.matcher(Poem.getText());

        while (matcher.find()) {
            int start = matcher.start();
            sb.setCharAt(start + 3, '#');
            if (matcher.group().length() >= 7) {
                sb.setCharAt(start + 6, '#');
            }
        }
        System.out.println(sb);
    }
}
