package cn.oriki.hdu.pid2007;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        while (in.hasNextInt()) {
            int a = in.nextInt();
            int b = in.nextInt();
            if (a > b) {
                int temp = b;
                b = a;
                a = temp;
            }
            int c = 0, d = 0;
            for (int i = a; i <= b; i++) {
                if (i % 2 == 0) {
                    c += i * i; // 这里不能使用 i ^ 2
                } else {
                    d += i * i * i; // 这里不能使用 i ^ 3
                }
            }
            System.out.printf("%d %d\n", c, d);
        }
    }
}
