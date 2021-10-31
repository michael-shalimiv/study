package by.it_academy.shalimov.jd01_02;

import java.util.Scanner;

public class TaskC2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[][] = step1(n);
        for (int i = 0; i < n; i++) {
            if (i > 0)
                System.out.println();
            for (int j = 0; j < n; j++) {
                System.out.print(arr[i][j] + "\t");
            }
        }
        System.out.println();
        // System.out.println(step2(arr));
        // System.out.println(arr.length);
        System.out.println(step3(arr).length);
        for (int i = 0; i < step3(arr).length; i++) {
            if (i > 0)
                System.out.println();
            for (int j = 0; j < step3(arr).length; j++) {
                System.out.print(step3(arr)[i][j] + "\t");
            }
        }


    }


    static int[][] step1(int n) {
        int[][] arr = new int[n][n];
        while (true) {
            for (int i = 0; i < arr.length; i++) {
                for (int j = 0; j < arr.length; j++) {
                    arr[i][j] = (int) Math.round(Math.random() * 2 * n - n);
                }
            }
            for (int i = 0; i < arr.length; i++) {
                for (int j = 0; j < arr.length; j++) {
                    if (arr[i][j] == n) {
                        for (int l = 0; l < arr.length; l++) {
                            for (int k = 0; k < arr.length; k++) {
                                if (arr[l][k] == (-n)) {
                                    return arr;
                                }
                            }
                        }
                    }
                }
            }
        }
    }

   /* static int step2(int[][] arr) {
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < (arr.length - 1); j++) {
                int sumN = 0;
                if (arr[i][j] > 0 && (arr[i][j + 1] <= 0)) {
                    j++;
                    while (arr[i][j] < 0 && j < arr.length) {
                        sumN += arr[i][j];
                        j++;
                    }
                    j--;
                    if (j == (arr.length - 1) && arr[i][j] <= 0) {
                        sumN = 0;
                    }
                    sum += sumN;
                    System.out.print(sumN + " ");
                    break;
                }

            }
        }
        return sum;
    }*/

    static int[][] step3(int[][] arr) {
        int indexI[] = new int[(arr.length * arr.length)];
        int indexJ[] = new int[(arr.length * arr.length)];

        int k = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                if (arr[i][j] == arr.length) {
                    indexI[k] = i + 1;
                    indexJ[k] = j + 1;
                    k++;
                }
            }
        }

        int i2 = 0;
        while (indexJ[i2] != 0) {
            i2++;
        }
        int newArr[][] = new int[i2][i2];
        int n = 0;
        while (indexJ[n] != 0) {
            for (int i = 0; i < arr.length; i++) {
                for (int j = 0; j < arr.length; j++) {
                    if ((indexI[n] - 1) == i || (indexJ[n] - 1) == j) {
                        continue;
                    } else {
                        for (int newI = 0; newI < newArr.length; newI++) {
                            for (int newJ = 0; newJ < newArr.length; newJ++) {
                                newArr[newI][newJ] = arr[i][j];
                            }
                        }
                    }


                }
            }
        }
        return newArr;
    }
}


