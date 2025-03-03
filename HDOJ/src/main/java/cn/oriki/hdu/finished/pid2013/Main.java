package cn.oriki.hdu.finished.pid2013;

import java.util.Scanner;

public class Main {

    /**
     * 核心公式：a(n) = (a(n-1) + 1) * 2
     *
     * @param args
     */
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        while (in.hasNextInt()) {
            int n = in.nextInt();
            int sum = 1;
            for (int i = n; i > 1; i--) {
                sum = (sum + 1) * 2;
            }
            System.out.println(sum);
        }
    }
}
