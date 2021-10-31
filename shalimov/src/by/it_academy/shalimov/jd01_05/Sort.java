package by.it_academy.shalimov.jd01_05;

import java.util.Arrays;

public class Sort {
    public Sort() {
    }

    static void mergeSort(int[] array, int left, int right) {
        if (right > left) {
            int mid = left + (right - left) / 2;
            mergeSort(array, left, mid);
            mergeSort(array, mid + 1, right);
            int[] buf = Arrays.copyOf(array, array.length);

            int i;
            for (i = left; i <= right; ++i) {
                buf[i] = array[i];
            }

            i = left;
            int j = mid + 1;

            for (int k = left; k <= right; ++k) {
                if (i > mid) {
                    array[k] = buf[j];
                    ++j;
                } else if (j > right) {
                    array[k] = buf[i];
                    ++i;
                } else if (buf[j] < buf[i]) {
                    array[k] = buf[j];
                    ++j;
                } else {
                    array[k] = buf[i];
                    ++i;
                }
            }

        }
    }
}