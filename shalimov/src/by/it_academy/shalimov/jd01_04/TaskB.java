package shalimov.tasks.task4;

import java.util.Scanner;

public class TaskB {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String[] lastNames = new String[n];

        for (int i = 0; i < n; i++) {
            lastNames[i] = sc.next();
        }
        int[][] sallarys = new int[n][4];
        for (int i = 0; i < sallarys.length; i++) {
            System.out.println("Введите зарплату для " + lastNames[i]);
            for (int i1 = 0; i1 < 4; i1++) {
                sallarys[i][i1] = sc.nextInt();
            }
        }
        int sallarysSum = 0;
        int allSallarys = 0;
        System.out.println("----------------------------------------------------------");
        System.out.format("%8s%10s%10s%10s%10s%8s", "Фамилия", "Квартал1", "Квартал2", "Квартал3", "Квартал4", "Итого");
        System.out.println();
        System.out.println("----------------------------------------------------------");
        for (int i = 0; i < lastNames.length; i++) {
            sallarysSum = 0;
            for (int value : sallarys[i]) {
                sallarysSum += value;
            }
            System.out.format("%7s:%8d%10d%10d%10d%8d", lastNames[i], sallarys[i][0], sallarys[i][1], sallarys[i][2], sallarys[i][3], sallarysSum);
            System.out.println();
            allSallarys += sallarysSum;
        }
        System.out.println("----------------------------------------------------------");
        System.out.format("%s%10d\n", "Итого", allSallarys);
        double d = allSallarys;
        System.out.printf("%s%14f\n", "Средняя", d / n / 4);
    }
}
