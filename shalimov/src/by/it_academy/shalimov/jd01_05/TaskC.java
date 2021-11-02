package by.it_academy.shalimov.jd01_05;

import java.util.Arrays;
import static java.lang.Math.*;

public class TaskC {


    public static void main(String[] args) {
        step2();
        step1();
    }

    static void step1() {
        int size = 30;
        double d = 3.67D / (double) size;
        double[] array = new double[size];
        int i = 0;

        for (double x = 5.33D; x <= 9.0D; x += d) {
            array[i] = Math.pow(Math.pow(x, 2.0D) + 4.5D, 0.333333D);
            ++i;
        }
        System.out.println("Массив A[]");
        InOut.printArray(array, "A", 5);
        System.out.println("\n");

        int size1 = 0;

        for (int i1 = 0; i1 < array.length; ++i1) {
            if (array[i1] > 3.5D) {
                ++size1;
            }
        }

        double[] array1 = new double[size1];
        int n = 0;
        double prod = 1.0D;

        for (int i1 = 0; i1 < size; ++i1) {
            if (array[i1] > 3.5D) {
                array1[n] = array[i1];
                prod *= array[i1];
                ++n;
            }
        }
        System.out.println("Массив B[] из элементов массива A > 3.5");
        InOut.printArray(array1, "B", 5);
        double degree = 1.0D;
        degree /= (double) size1;
        double medium = Math.pow(prod, degree);
        System.out.println(medium);
    }

    private static void step2() {
        int n = 0;
        int[] A = new int[31];

        for (int i = 0; i < A.length; i++) {

            double num = round(Math.random() * (450 - 103) + 1) + 103;
            A[i] = (int) num;
            System.out.print("элемент" + i + " " + A[i] + " ");

            if (((A[i] * 10) / 100) > i) {
                n++;
            }
        }
        int[] B = new int[n];
        for (int j = 0; j < B.length; ) {
            for (int i = 0; i < A.length; i++) {
                if (((A[i] * 10) / 100) > i) {
                    B[j] = A[i];
                    System.out.println("элемент B" + j + " " + B[j] + " ");
                    j++;
                    continue;
                }
                continue;
            }
        }
        System.out.println("╔═══════════╦═══════════╦═══════════╦═══════════╦═══════════╗");
        for (int i = 0; i < A.length; i++) {
            {
                for (int j = 0; j < 5; j++) {
                    System.out.printf("║ A[%-2d]=%-4d", i, A[i]);

                }
                System.out.println("║");
                if (i != (A.length - 1))
                    System.out.println("╠═══════════╬═══════════╬═══════════╬═══════════╬═══════════╣");
            }
        }
        System.out.println("╚═══════════╩═══════════╩═══════════╩═══════════╩═══════════╝");

        System.out.println("╔═══════════╦═══════════╗");
        for (int i = 0; i < B.length; i++) {
            {
                for (int j = 0; j < 2; j++) {
                    System.out.printf("║ B[%-2d]=%-4d", i, B[i]);

                }
                System.out.println("║");
                if (i != (B.length - 1))
                    System.out.println("╠═══════════╬═══════════╣");
            }
        }
        System.out.print("╚═══════════╩═══════════╝");
    }
}