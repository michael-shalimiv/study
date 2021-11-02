package by.it_academy.shalimov.jd01_05;

public class TaskB {
    public static void main(String[] args) {
        step1();
        step2();
    }

    static void step1() {
double sum = 0;

        for (double a = 0.0D; a <= 2.0D; a += 0.2D) {
            sum=0;
            for (int x = 1; x < 7; ++x) {
                sum+= Math.pow(7.0D, a) - Math.cos((double) x);
            }
            System.out.printf("При a=%.2f Сумма y = %e%n", a, sum);
        }


    }

    static void step2() {
        for (double x = -5.5D; x < 2.0D; x += 0.5D) {
            if (x / 2.0D > -2.0D && x / 2.0D <= -1.0D) {
                System.out.printf("При x/2=%.2f a = %e%n",x/2,Math.log10(Math.abs(Math.sin(Math.pow(x, 2.0D))) + 2.74D));
            } else if (x / 2.0D > -1.0D && x / 2.0D < 0.2D) {
                System.out.printf("При x/2=%.2f a = %e%n",x/2,Math.log10(Math.abs(Math.cos(Math.pow(x, 2.0D))) + 2.74D));
            } else if (x / 2.0D == 0.2D) {
                System.out.printf("При x/2=%.2f a = %e%n",x/2,Math.log10(Math.abs(Math.pow(Math.tan(Math.pow(x, 2.0D)), -1.0D) + 2.74D)));
            } else {
                System.out.printf("При x/2=%.2f %s%n",x/2,"вычисления не определены");
            }
        }

    }
}
