package cn.oriki.hdu.finished.pid2015;

import java.util.Scanner;

public class Main2 {

    private static final int[] array;

    static {
        array = new int[100];
        int m = 2;
        for (int i = 0; i < 100; i++) {
            array[i] = m;
            m += 2;
        }
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        while (in.hasNextInt()) {
            int n = in.nextInt(); // 总长度
            int m = in.nextInt(); // 每 m 个数字

            int sum = 0;
            int x = m;
            for (int i = 0; i < n; i++) {
                sum += array[i];
                x--;
                if (x == 0 || (i + 1) == n) { // 要么循环满了，要么是到最后一轮了
                    System.out.print(sum / (m - x) + " ");
                    x = m;
                    sum = 0;
                }
            }
            System.out.println();
        }
        in.close();
    }
}
