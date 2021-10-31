package by.it_academy.shalimov.jd01_02;

import java.util.Scanner;

import static java.lang.Math.sqrt;

public class TaskB {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        step1();
        int month = sc.nextInt();
        step2(month);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        step3(a, b, c);
    }

    static void step1() {
        for (int i = 0; i <= 4; i++) {
            if (i > 0)
                System.out.println();
            for (int j = 1; j <= 5; j++) {
                System.out.print(j + (5 * i) + "\t");
            }
        }
    }

    static void step2(int month) {
        switch (month) {
            case 1:
                System.out.println("Январь");
                break;
            case 2:
                System.out.println("Февраль");
                break;
            case 3:
                System.out.println("Март");
                break;
            case 4:
                System.out.println("Апрель");
                break;
            case 5:
                System.out.println("Май");
                break;
            case 6:
                System.out.println("Июнь");
                break;
            case 7:
                System.out.println("Июль");
                break;
            case 8:
                System.out.println("Август");
                break;
            case 9:
                System.out.println("Сентябрь");
                break;
            case 10:
                System.out.println("Октябрь");
                break;
            case 11:
                System.out.println("Ноябрь");
                break;
            case 12:
                System.out.println("Декабрь");
                break;
            default:
                System.out.println("нет такого месяца");
        }
    }

    static void step3(int a, int b, int c) {
        if ((b * b - (4 * a * c)) == 0) {
            double x = (-b) / (2 * a);
            System.out.print(String.format("%.2f", x) + " ");
        } else {
            double x = (-b - sqrt(b * b - (4 * a * c))) / (2 * a);
            System.out.print(String.format("%.2f", x) + " ");
            x = (-b + sqrt(b * b - (4 * a * c))) / (2 * a);
            System.out.print(String.format("%.2f", x) + " ");
        }

    }
}