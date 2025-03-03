package cn.oriki.hdu.finished.pid2012;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        while (in.hasNextInt()) {
            int start = in.nextInt();
            int end = in.nextInt();
            if (start == 0 && end == 0) {
                break;
            }

            boolean flag = true;
            for (int i = start; i <= end; i++) {
                if (!isPrime(f(i))) {
                    flag = false;
                    break;
                }
            }

            System.out.println(flag ? "OK" : "Sorry");
        }
    }

    public static int f(int n) {
        return (n * n) + n + 41;
    }

    /**
     * 判定素数的高效方法
     *
     * @param n 待判定数据
     * @return 是否为素数 true 为素数、false 不是素数
     */
    public static boolean isPrime(int n) {
        // 从 2 开始判定即可
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) { // 这里是取余
                return false;
            }
        }
        return true;
    }
}
