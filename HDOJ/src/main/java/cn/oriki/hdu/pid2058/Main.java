package cn.oriki.hdu.pid2058;

import java.util.Scanner;

public class Main {

    /**
     * 对于每组输入，程序尝试找出所有形如 [a, b] 的整数区间，使得：
     * 区间内的所有整数之和等于 m
     * 区间是连续的整数（即等差数列，公差为 1）
     */
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        while (in.hasNextInt()) {
            int n = in.nextInt();
            int m = in.nextInt();
            if (n == 0 && m == 0) {
                break;
            }
            /*
              如果区间 [a, b] 包含 i 个连续整数，那么它们的和可以表示为：(a + b) * i / 2 = m
              程序从可能的最大区间长度 i 开始向下尝试
              对于每个长度 i，计算可能的起始值 a = m / i - (i - 1)/2
              然后验证 (a + b) * i = 2 * m 是否成立
             */
            for (int i = (int) Math.sqrt(2 * m); i > 0; i--) {
                int a = m / i - (i - 1) / 2;
                int b = a + i - 1;
                if ((a + b) * i == 2 * m) {
                    System.out.printf("[%d,%d]", a, b);
                }
            }
            System.out.println();
        }
    }
}
