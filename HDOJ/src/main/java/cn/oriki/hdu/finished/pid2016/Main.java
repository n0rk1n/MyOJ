package cn.oriki.hdu.finished.pid2016;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        while (in.hasNextInt()) {
            int m = in.nextInt();
            if (m == 0) {
                break;
            }
            int[] x = new int[m];
            int min = Integer.MAX_VALUE;
            int p = 0;
            for (int i = 0; i < m; i++) {
                x[i] = in.nextInt();
                if (x[i] < min) {
                    min = x[i];
                    p = i;
                }
            }
            int temp = x[0];
            x[0] = x[p];
            x[p] = temp;
            for (int i = 0; i < m - 1; i++) {
                System.out.print(x[i] + " ");
            }
            System.out.println(x[m - 1]);
        }
    }
}
