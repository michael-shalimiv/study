package by.it_academy.shalimov.jd01_05;

public class TaskB {
    public TaskB() {
    }

    static double step1() {
        double sum = 0.0D;

        for (double a = 0.0D; a <= 2.0D; a += 0.2D) {
            for (int x = 1; x < 7; ++x) {
                sum += Math.pow(7.0D, a) - Math.cos((double) x);
            }
        }

        return sum;
    }

    static void step2() {
        for (double x = -6.0D; x < 2.0D; x += 0.5D) {
            if (x / 2.0D > -2.0D && x / 2.0D <= -1.0D) {
                System.out.println(x + " " + Math.log10(Math.abs(Math.sin(Math.pow(x, 2.0D))) + 2.74D));
            } else if (x / 2.0D > -1.0D && x / 2.0D < 0.2D) {
                System.out.println(x + " " + Math.log10(Math.abs(Math.cos(Math.pow(x, 2.0D))) + 2.74D));
            } else if (x / 2.0D == 0.2D) {
                System.out.println(x + " " + Math.log10(Math.abs(Math.pow(Math.tan(Math.pow(x, 2.0D)), -1.0D) + 2.74D)));
            } else {
                System.out.println("Вычисления при данном x невозможны");
            }
        }

    }
}
