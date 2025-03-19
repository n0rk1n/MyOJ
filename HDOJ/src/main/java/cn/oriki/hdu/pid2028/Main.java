package cn.oriki.hdu.pid2028;

import java.util.Scanner;

public class Main {

    /**
     * 在数学上，我们求几个数的最小公倍数的方法是对他们分解质因数，然后将他们的质因数相乘，如果有相同的质因数则乘的时候乘该共有质因数的最高次幂项，这种方法显然不适合写程序解题，我们考虑另一种方法。
     * <p>
     * 公式法，有这样一个公式：x * y = gcd * lcm，x、y 为要求最小公倍数的两个数，lcm 代表最小公倍数，gcd 代表最大公约数。将公式变形可得 lcm = x * y / gcd，我们就可以利用这个公式求 lcm。
     * <p>
     * 求 gcd 的方法很多，可以手写一个函数 gcd() 利用辗转相除法求。
     * <p>
     * 首先我们要用一个数组储存要求的几个数，然后写个函数循环求 gcd，假如传进来 n 个数 a b c d e ...，我们应该先对 a b 求 lcm 然后求 a b 的 gcd，再用这个结果（a b 的 gcd）和 c 一起求 gcd，再用结果和 d 一起求 gcd，以此类推。如果担心溢出问题可以将公式调整一下求值顺序，lcm = x / gcd * y，对这题而言多此一举，题目已经说明结果为 32 位整数。
     */
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        while (in.hasNextInt()) {
            int n = in.nextInt();
            long x = 1; // 填充一个数字简化运算
            for (int i = 0; i < n; i++) {
                long k = in.nextInt();
                x = lcm(x, k);
            }
            System.out.println(x);
        }

    }

    /**
     * 最大公约数
     */
    public static long gcd(long x, long y) {
        if (x % y == 0)
            return y;
        return gcd(y, x % y);
    }

    /**
     * 最小公倍数
     */
    public static long lcm(long x, long y) {
        return x / gcd(x, y) * y;
    }
}
