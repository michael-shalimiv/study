package by.it_academy.shalimov.jd01_03;

import java.util.Scanner;


public class Runner {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String line = sc.nextLine();
        Helper helper = new Helper();
        InOut inOut = new InOut();

        InOut.printArray(InOut.getArray(line), "bebra", 3);
        System.out.println(Helper.findMax(InOut.getArray(line)));
    }
}
