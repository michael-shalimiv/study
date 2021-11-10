package by.it_academy.shalimov.jd01_06;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class TaskB1 {
    public static void main(String[] args) {
        step1();
    }
    static void step1() {
        StringBuilder sb = new StringBuilder(Poem.getText());
        Pattern pattern = Pattern.compile("[а-яА-ЯЁё]{2,}");
        Matcher matcher = pattern.matcher(Poem.getText());
        Pattern pattern1 = Pattern.compile("[йцкнгшщзхфвпрлджчсмтбЙЦКНГШЩЗХФВПРЛДЖЧСМТБ]+");
        Pattern pattern2 = Pattern.compile("[уеыаоэяиюУЕЁёАОЭЯИЮ]+");

        while (matcher.find()) {
            Matcher matcher1 = pattern1.matcher(matcher.group());
            Matcher matcher2 = pattern2.matcher(matcher.group());
            int m1Final = 0;
            int m2Final = 0;
            while (matcher1.find()) {
                if (matcher1.start() == 0) {
                    while (matcher2.find()) {
                        m2Final = matcher2.end();
                    }
                    while (matcher1.find()) {
                        m1Final = matcher1.end();
                    }
                } else
                    break;
            }

            if (m2Final > m1Final)
                System.out.println(matcher.group());
        }

    }
}
