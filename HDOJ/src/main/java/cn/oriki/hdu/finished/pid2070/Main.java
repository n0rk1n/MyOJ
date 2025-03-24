package cn.oriki.hdu.finished.pid2070;

import java.util.Scanner;

public class Main {

    static long[] f = new long[51];

    static{
        fibbonacci();
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        while (in.hasNextInt()) {
            int n = in.nextInt();
            if (n == -1) {
                break;
            }
            System.out.println(f[n]);
        }
    }

    private static void fibbonacci() {
        f[0] = 0;
        f[1] = 1;
        for (int i = 2; i < 51; i++) {
            f[i] = f[i - 1] + f[i - 2];
        }
    }
}
