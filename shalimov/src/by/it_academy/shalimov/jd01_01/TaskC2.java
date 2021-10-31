package by.it_academy.shalimov.jd01_01;

import java.math.BigInteger;
import java.util.Scanner;

public class TaskC2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int y = sc.nextInt();
        System.out.println("DEC: " + x + " + " + y + " = " + (x + y));
        System.out.println("BIN: " + convert(x, y, 2));
        System.out.println("OCT: " + convert(x, y, 8));
        System.out.println("HEX: " + convert(x, y, 16));
    }

    public static String convert(int x, int y, int sys) {
        BigInteger a = new BigInteger(String.valueOf(x));
        String s = a.toString(sys);
        String full = (s + " + ");
        a = new BigInteger(String.valueOf(y));
        s = a.toString(sys);
        full += (s + " = ");
        a = new BigInteger(String.valueOf(x + y));
        s = a.toString(sys);
        full += s;
        return full;
    }
}