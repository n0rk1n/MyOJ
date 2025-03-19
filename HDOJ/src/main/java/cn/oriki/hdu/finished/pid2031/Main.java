package cn.oriki.hdu.finished.pid2031;

import java.util.Scanner;

public class Main {

    static char[] c = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'A', 'B', 'C', 'D', 'E', 'F'};

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        while (in.hasNextInt()) {
            int n = in.nextInt(); // 取第一个数
            int r = in.nextInt(); // 取第二个数
            int b;
            int flag = 0; // 用于判定正负
            if (n < 0) {
                // 为负数
                flag = 1;
                n = Math.abs(n);
            }
            StringBuilder sb = new StringBuilder();
            while ((n) != 0) {
                b = n % r;
                sb.insert(0, c[b]);
                n /= r;
            }
            if (flag == 1) {
                System.out.println("-" + sb);
            } else {
                System.out.println(sb);
            }
        }
    }
}
