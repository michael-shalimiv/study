package by.it_academy.shalimov.jd01_06;

import java.util.Random;
import java.util.Vector;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class TaskC2 {
    public static void main(String[] args) {
        long startTime = System.nanoTime();
        System.out.println(slow(Poem.getText()));
        long finishTime = System.nanoTime();
        long slow = finishTime - startTime;
        System.out.println(slow);
        startTime = System.nanoTime();
        System.out.println(fast(Poem.getText()));
        finishTime = System.nanoTime();
        System.out.println(finishTime - startTime);
    }

    final static int OUTPUT_TEXT_MIN_LENGTH = 100000;

    static Vector getWords(String text) {

        Pattern pattern = Pattern.compile("[а-яА-ЯЁё]{1,}");
        Matcher matcher = pattern.matcher(text);
        Vector words = new Vector();
        while (matcher.find()) {
            words.add(matcher.group());
        }
        return words;
    }

    public static String slow(String text) {
        Random random = new Random(123);
        String randomText = "";
        String randomWord;
        Vector<String> words = getWords(text);
        while (randomText.length() < OUTPUT_TEXT_MIN_LENGTH) {
            randomWord = words.elementAt(random.nextInt(words.size()));
//noinspection StringConcatenationInLoop
            randomText += randomWord + " ";
        }
        return randomText;
    }

    static StringBuffer fast(String text) {
        StringBuffer randomText = new StringBuffer(100000);
        Random random = new Random(123);
        String randomWord;
        Vector<String> words = getWords(text);
        while (randomText.length() < OUTPUT_TEXT_MIN_LENGTH) {
            randomWord = words.elementAt(random.nextInt(words.size()));
//noinspection StringConcatenationInLoop
            randomText.append(randomWord);
            randomText.append(' ');
        }
        return randomText;
    }
}
