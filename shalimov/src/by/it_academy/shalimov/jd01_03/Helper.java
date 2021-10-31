package by.it_academy.shalimov.jd01_03;


public class Helper {
    static double findMin(double[] arr) {
        double min = arr[0];
        for (double value : arr) {
            if (value < min)
                min = value;
        }
        return min;
    }

    static double findMax(double[] arr) {
        double max = arr[0];
        for (double value : arr) {
            if (value > max)
                max = value;
        }
        return max;
    }

    static void sort(double[] arr) {
        for (int i = 0; i < arr.length; i++) {

            double min = arr[i];
            int min_i = i;

            for (int j = i + 1; j < arr.length; j++) {
                if (arr[j] < min) {
                    min = arr[j];
                    min_i = j;
                }
            }
            if (i != min_i) {
                double tmp = arr[i];
                arr[i] = arr[min_i];
                arr[min_i] = tmp;
            }
        }
    }

    static double[] mul(double[][] matrix, double[] vector) {
        double[] newVector = new double[matrix.length];
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < vector.length; j++) {
                newVector[i] = newVector[i] + matrix[i][j] * vector[j];
            }
        }
        return newVector;

    }

    static double[][] mul(double[][] matrixLeft, double[][] matrixRight) {
        double[][] newMatrix = new double[matrixLeft.length][matrixRight[0].length];
        for (int i = 0; i < matrixLeft.length; i++) {
            for (int j = 0; j < matrixRight[0].length; j++) {
                for (int k = 0; k < matrixRight.length; k++) {
                    newMatrix[i][j] = newMatrix[i][j] + matrixLeft[i][k] * matrixRight[k][j];
                }
            }
        }
        return newMatrix;
    }

}
