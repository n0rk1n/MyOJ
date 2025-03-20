package cn.oriki.hdu.finished.pid2044;

import java.util.Scanner;

public class Main {

    static long[] x = new long[51];

    static {
        x[1] = 1;
        x[2] = 2;
        for (int i = 3; i < 51; i++) {
            x[i] = x[i - 1] + x[i - 2];
        }
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt(); // 获取循环次数
        while (n-- > 0) {
            int a = in.nextInt(); // 第一个数
            int b = in.nextInt(); // 第二个数
            System.out.println(x[b - a]);
        }
    }
}
