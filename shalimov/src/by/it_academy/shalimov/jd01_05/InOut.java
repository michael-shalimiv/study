package by.it_academy.shalimov.jd01_05;

public class InOut {
    public InOut() {
    }

    static double[] getArray(String line) {
        int i = 0;
        String[] var2 = line.split(" ");
        int var3 = var2.length;

        int var4;
        for (var4 = 0; var4 < var3; ++var4) {
            String var10000 = var2[var4];
            ++i;
        }

        double[] array = new double[i];
        i = 0;
        String[] var8 = line.split(" ");
        var4 = var8.length;

        for (int var5 = 0; var5 < var4; ++var5) {
            String retval = var8[var5];
            array[i] = Double.parseDouble(retval);
            ++i;
        }

        return array;
    }

    static void printArray(double[] arr) {
        double[] var1 = arr;
        int var2 = arr.length;

        for (int var3 = 0; var3 < var2; ++var3) {
            double value = var1[var3];
            System.out.println(String.format("%.3f", value));
        }

    }

    static void printArray(double[] array, String name, int columnCount) {
        for (int i = 0; i < array.length; ++i) {
            System.out.printf("%s[% -3d]=%-10.5f ", name, i, array[i]);
            if ((i + 1) % columnCount == 0 || i == array.length - 1) {
                System.out.println();
            }
        }

    }
}