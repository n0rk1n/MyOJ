package cn.oriki.hdu.pid2003;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (scanner.hasNextDouble()) {
            double n = scanner.nextDouble();
            System.out.printf("%.2f\n", Math.abs(n)); // 结果保留两位小数
        }
    }
}
