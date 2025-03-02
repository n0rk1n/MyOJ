package cn.oriki.hdu.finished.pid2002;

import java.util.Scanner;

public class Main {

    private static final double PI = 3.1415927;

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        while (in.hasNextDouble()) {
            double r = in.nextDouble();
            // double S = 4 * PI * r * r * r / 3;
            double S = 4 * PI * Math.pow(r, 3) / 3;
            System.out.printf("%.3f\n", S);
        }
    }
}
