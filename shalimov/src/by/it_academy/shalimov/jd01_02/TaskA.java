package by.it_academy.shalimov.jd01_02;

import java.util.Scanner;

public class TaskA {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[10];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        step1(arr);
        step2(arr);
        step3(arr);
    }

    public static void step1(int[] arr) {
        int max = arr[0];
        int min = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > max)
                max = arr[i];
            if (arr[i] < min)
                min = arr[i];
        }
        System.out.println(min + " " + max);
    }

    public static void step2(int[] arr) {
        double medium = 0;
        for (int i = 0; i < arr.length; i++) {
            medium += arr[i];
        }
        medium /= arr.length;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < medium)
                System.out.println(arr[i]);
        }
    }

    public static void step3(int[] arr) {
        int min = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < min)
                min = arr[i];
        }
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == min)
                System.out.print(i + " ");
        }
    }
}
