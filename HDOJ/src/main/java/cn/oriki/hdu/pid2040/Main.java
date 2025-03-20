package cn.oriki.hdu.pid2040;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt(); // 循环几次
        while (n-- > 0) {
            int a = in.nextInt(); // 第一个数字
            int b = in.nextInt(); // 第二个数字
            System.out.println(AffinityNum(a, b) ? "YES" : "NO");
        }
    }

    public static boolean AffinityNum(int a, int b) {
        return a == Divisors(b) && (b == Divisors(a));
    }

    public static int Divisors(int a) {
        int sum = 0;
        for (int i = 1; i <= Math.sqrt(a); i++) {
            if (a % i == 0) {
                if (i != 1) {
                    sum = sum + i + (a / i);
                } else {
                    sum += i;
                }
            }
        }
        return sum;
    }
}
