package cn.oriki.hdu.finished.pid2046;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        while (in.hasNextInt()) {
            int t = in.nextInt();
            long[] x = new long[51];
            x[0] = 1; // 2 * (0 + 1) = 2 的格子，2 个盒子有两种放法
            x[1] = 2; // 2 * (1 + 1) = 4 的格子，4 个盒子有两种放法
            x[2] = 3; // 2 * (2 + 1) = 6 的格子，6 个格子有三种放法
            for (int i = 3; i < 51; i++) {
                x[i] = x[i - 2] + x[i - 1];
            }
            System.out.println(x[t - 1]);
        }
    }
}
