package by.it_academy.shalimov.jd01_05;

import java.util.Arrays;

public class TaskC {
    public TaskC() {
    }

    public static void main(String[] args) {
        step2();
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

        InOut.printArray(array, "V", 5);
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

        double degree = 1.0D;
        degree /= (double) size1;
        double medium = Math.pow(prod, degree);
        System.out.println(medium);
    }

    static void step2() {
        int[] arrA = new int[31];

        for (int i = 0; i < arrA.length; ++i) {
            arrA[i] = (int) Math.round(Math.random() * 347.0D + 103.0D);
        }

        int[] sortArrA = Arrays.copyOf(arrA, arrA.length);
        Sort.mergeSort(sortArrA, 0, sortArrA.length - 1);
        int sizeB = 0;

        for (int i = 0; i < sortArrA.length; ++i) {
            if ((double) sortArrA[i] * 0.1D > (double) i) {
                ++sizeB;
            }
        }

        int[] arrB = new int[sizeB];
        int b = 0;

        for (int i = 0; i < sortArrA.length; ++i) {
            if ((double) sortArrA[i] * 0.1D > (double) i) {
                arrB[b] = sortArrA[i];
                ++b;
            }
        }

        int[] var11 = arrA;
        int var6 = arrA.length;

        int var7;
        int value;
        for (var7 = 0; var7 < var6; ++var7) {
            value = var11[var7];
            System.out.println(value);
        }

        System.out.println();
        var11 = arrB;
        var6 = arrB.length;

        for (var7 = 0; var7 < var6; ++var7) {
            value = var11[var7];
            System.out.println(value);
        }

    }
}