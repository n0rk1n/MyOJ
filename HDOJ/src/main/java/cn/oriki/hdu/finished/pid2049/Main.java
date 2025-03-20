package cn.oriki.hdu.finished.pid2049;

import java.util.Scanner;

public class Main {

    // 错排公式的数组保存
    static long[] es = new long[21];

    static {
        es[1] = 1;
        es[2] = 1;
        es[3] = 2;
        for (int i = 4; i <= 20; i++) {
            es[i] = (i - 1) * (es[i - 1] + es[i - 2]);
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int s = scanner.nextInt();

        while (s-- > 0) {
            int n = scanner.nextInt(); // n 对
            int m = scanner.nextInt(); // m 对排错
            System.out.println(foo(m, n) * es[m]);
        }

        scanner.close();
    }

    /**
     * 排列组合公式
     */
    public static long foo(int m, int n) {
        return fac(n) / fac(m) / fac(n - m); // n! / (m! * (n - m)!)
    }

    /**
     * 阶乘
     */
    public static long fac(int n) {
        long result = 1;
        while (n > 0) {
            result *= n;
            n--;
        }
        return result;
    }
}
