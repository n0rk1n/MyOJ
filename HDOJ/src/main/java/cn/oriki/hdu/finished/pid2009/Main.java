package cn.oriki.hdu.finished.pid2009;

import java.util.Scanner;

public class Main {

    /**
     * Sample Input:
     * 81 4
     * <p>
     * 意思是第一个数是 81，第二项是 9，第三项是 3，第四项是 根 3
     * 那么和为 81 + 9 + 3 + 根 3 = 94.x
     */
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        while (in.hasNextInt()) {
            int n = in.nextInt();
            int m = in.nextInt();
            double sum = 0;
            double x = n;
            for (int i = 0; i < m; i++) {
                sum += x;
                x = Math.sqrt(x);
            }
            System.out.printf("%.2f\n", sum);
        }
    }
}
