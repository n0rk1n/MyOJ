package cn.oriki.hdu.pid2047;

import java.util.Scanner;

public class Main {

    public static long[] x = new long[40];

    static {
        x[1] = 3;
        x[2] = 8;
        for (int i = 3; i < 40; i++) {
            x[i] = 2 * (x[i - 1] + x[i - 2]);
        }
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        while (in.hasNextInt()) {
            int n = in.nextInt();
            System.out.println(x[n]);
        }
    }
}
