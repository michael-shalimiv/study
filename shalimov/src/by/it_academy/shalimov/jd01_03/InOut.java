package by.it_academy.shalimov.jd01_03;


public class InOut {

    public static double[] getArray(String line) {
        int i = 0;
        for (String retval : line.split(" ")) {
            i++;
        }
        double array[] = new double[i];
        i = 0;
        for (String retval : line.split(" ")) {
            array[i] = Double.parseDouble(retval);
            i++;
        }
        return array;
    }

    static void printArray(double[] arr) {
        for (double value : arr) {
            System.out.println(String.format("%.3f", value));
        }
    }

    public static void printArray(double[] array, String name, int columnCount) {
        for (int i = 0; i < array.length; i++) {
            System.out.printf("%s[% -3d]=%-10.4f ", name, i, array[i]);
            if ((i + 1) % columnCount == 0 || i == array.length - 1) {
                System.out.println();
            }
        }
    }
}
