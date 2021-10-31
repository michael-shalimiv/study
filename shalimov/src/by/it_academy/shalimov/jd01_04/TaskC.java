package by.it_academy.shalimov.jd01_04;



import java.util.Arrays;
import java.util.Scanner;

public class TaskC {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String line = sc.nextLine();
        buildOneDimArray(line);
    }

    static void buildOneDimArray(String line) {
        double[] array = InOut.getArray(line);
        double start = array[0];
        double stop = array[array.length - 1];
        InOut.printArray(array, "V", 5);
        mergeSort(array, 0, array.length - 1);
        InOut.printArray(array, "V", 4);

        System.out.println("Index of first element=" + binarySearch(array, start));
        System.out.println("Index of last element=" + binarySearch(array, stop));

    }


    private static void mergeSort(double[] array, int left, int right) {
        if (right <= left)
            return;
        int mid = left + (right - left) / 2;
        mergeSort(array, left, mid);
        mergeSort(array, mid + 1, right);

        double[] buf = Arrays.copyOf(array, array.length);

        for (int k = left; k <= right; k++)
            buf[k] = array[k];

        int i = left, j = mid + 1;
        for (int k = left; k <= right; k++) {

            if (i > mid) {
                array[k] = buf[j];
                j++;
            } else if (j > right) {
                array[k] = buf[i];
                i++;
            } else if (buf[j] < buf[i]) {
                array[k] = buf[j];
                j++;
            } else {
                array[k] = buf[i];
                i++;
            }
        }
    }

    static int binarySearch(double[] array, double value) {
        int lowIndex = 0;
        int highIndex = array.length - 1;
        while (true) {
            if (array[(lowIndex + highIndex) / 2] > value)
                highIndex = (lowIndex + highIndex) / 2 - 1;
            else if (array[(lowIndex + highIndex) / 2] < value)
                lowIndex = (lowIndex + highIndex) / 2 + 1;
            else
                return (lowIndex + highIndex) / 2;
        }
    }
}
