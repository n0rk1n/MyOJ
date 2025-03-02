package cn.oriki.hdu.pid2006;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (scanner.hasNext()) {
            int n = scanner.nextInt(); // 第一个数代表本组有几个数
            int result = 1;
            for (int i = 0; i < n; i++) {
                int x = scanner.nextInt();
                if ((x % 2) != 0) {
                    result *= x;
                }
            }
            System.out.println(result);
        }
        scanner.close();
    }
}
