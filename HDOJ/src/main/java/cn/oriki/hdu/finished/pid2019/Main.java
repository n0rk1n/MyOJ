package cn.oriki.hdu.finished.pid2019;

import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (scanner.hasNextInt()) {
            int n = scanner.nextInt();
            int m = scanner.nextInt();
            if (n == 0 && m == 0) {
                break;
            }
            int[] x = new int[n + 1];
            for (int i = 0; i < n; i++) {
                x[i] = scanner.nextInt();
            }
            x[n] = m;
            Arrays.sort(x); // 这个方法有点作弊了
            for (int i = 0; i < n; i++) {
                System.out.print(x[i] + " ");
            }
            System.out.println(x[n]);
        }
        scanner.close();
    }
}
