package by.it_academy.shalimov.jd01_06;

import java.util.Arrays;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class TaskA2 {
    public static void main(String[] args) {
        step2();
    }

    private static String[] w = {};
    private static int[] count = {};

    private static int pos(String word) {
        for (int i = 0; i < w.length; i++) {
            if (w[i].equals(word))
                return i;
        }
        return -1;
    }


    static void step2() {
        Pattern pattern = Pattern.compile("[а-яА-ЯЁё]{1,}");
        Matcher matcher = pattern.matcher(Poem.getText());
        while (matcher.find()) {
            String word = matcher.group();
            int pos = pos(word);
            if (pos >= 0) {
                count[pos]++;
            } else {
                int last = w.length;
                w= Arrays.copyOf(w, last+1);
                w[last]=word;
                count=Arrays.copyOf(count, last+1);
                count[last]=1;
            }
        }
        for (int i = 0; i < w.length; i++) {
            System.out.println(w[i]+"="+count[i]);
        }
    }
}
