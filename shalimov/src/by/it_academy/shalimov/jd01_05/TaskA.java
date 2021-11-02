package by.it_academy.shalimov.jd01_05;

import static java.lang.Math.*;

public class TaskA {


    public static void main(String[] args) {


        System.out.println(primer1());
        System.out.println(primer2());
        primer3();
    }

    static double primer1() {
        double a = 756.13D;
        double x = 0.3D;
        double z = Math.cos(Math.pow(Math.pow(x, 2.0D) + (PI/6.0D), 5.0D)) - Math.sqrt(x * Math.pow(a, 3.0D)) - Math.log((a - 1.12D * x) / 4.0D);
        return z;
    }

    static double primer2() {
        double a = 1.21;
        double b = 0.371;
        double y = Math.tan(Math.pow(a + b, 2.0D)) - Math.cbrt(a + 1.5D) + (a * Math.pow(b, 5.0D)) - (b / Math.log(Math.pow(a, 2.0D)));
        return y;
    }

    static void primer3() {
        double x = 12.1D;

        for (double a = -5.0D; a <= 12.0D; a += 3.75D) {
            System.out.printf("При a=%6.2f f=%g \n", a, Math.pow(2.718281828459045D, a * x) - 3.45D * a);
        }

    }
}