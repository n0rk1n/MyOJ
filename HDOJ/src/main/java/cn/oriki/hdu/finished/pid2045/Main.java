package cn.oriki.hdu.finished.pid2045;

import java.util.Scanner;

public class Main {

    static long[] x = new long[55];

    static {
        x[0] = 3;
        x[1] = 6;
        x[2] = 6;
        for (int i = 3; i < 50; i++) {
            x[i] = x[i - 1] + x[i - 2] * 2;
        }
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        while (in.hasNextInt()) {
            int n = in.nextInt();
            System.out.println(x[n - 1]);
        }
    }
}
