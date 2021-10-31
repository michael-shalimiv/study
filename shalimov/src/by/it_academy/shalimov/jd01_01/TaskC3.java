package by.it_academy.shalimov.jd01_01;

import java.util.Scanner;

public class TaskC3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите вес человека на земле");
        int weight = sc.nextInt();
        System.out.println("Вес этого человека на марсе будет: " + String.format("%.2f", getWeight(weight)));
    }

    public static double getWeight(int weight) {
        double mars = 3.86;
        double earth = 9.81;
        return (weight / earth * mars);

    }
}
