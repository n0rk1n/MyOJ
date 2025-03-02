package cn.oriki.hdu.finished.pid2001;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (scanner.hasNextDouble()) {
            double x1 = scanner.nextDouble();
            double y1 = scanner.nextDouble();
            double x2 = scanner.nextDouble();
            double y2 = scanner.nextDouble();

            double pow1 = Math.pow(x1 - x2, 2);
            double pow2 = Math.pow(y1 - y2, 2);
            double d = Math.sqrt(pow1 + pow2);
            System.out.printf("%.2f\n", d); // 保留两位小数
        }
    }
}
