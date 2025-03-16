package cn.oriki.hdu.pid2022;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        while (in.hasNextInt()) {
            int m = in.nextInt(); // 读入行号
            int n = in.nextInt(); // 读入列号
            int i, j;
            int score, max = 0;
            int xpos = 0, ypos = 0;

            for (i = 1; i <= m; i++) {
                for (j = 1; j <= n; j++) {
                    score = in.nextInt();
                    if (Math.abs(score) > Math.abs(max)) {
                        max = score;
                        xpos = i;
                        ypos = j;
                    }
                }
            }
            System.out.println(xpos + " " + ypos + " " + max);
        }
    }
}
