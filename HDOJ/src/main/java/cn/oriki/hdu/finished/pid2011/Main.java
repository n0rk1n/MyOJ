package cn.oriki.hdu.finished.pid2011;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int fistLine = in.nextInt(); // 获取第一行数据，也就是一共要执行几次多项式求和方法
        while (fistLine-- > 0) {
            int n = in.nextInt();
            double sum = 0;
            for (int i = 1; i <= n; i++) {
                sum += Math.pow(-1, i - 1) / i;
            }
            System.out.printf("%.2f\n", sum);
        }
    }
}
