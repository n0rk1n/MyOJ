package cn.oriki.hdu.pid2021;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        while (in.hasNext()) {
            int n = in.nextInt();
            if (n == 0) {
                break;
            }
            int sum = 0;
            while (n-- > 0) {
                int a = in.nextInt();
                sum += a / 100; // 这位老师要几张 100 块
                a %= 100;
                sum += a / 50; // 这位老师要几张 50 块
                a %= 50;
                sum += a / 10; // 这位老师要几张 10 块
                a %= 10;
                sum += a / 5; // 这位老师要几张 5 块
                a %= 5;
                sum += a / 2; // 这位老师要几张 2 块
                sum += a % 2; // 这位老师要几张 1 块
            }
            System.out.println(sum);
        }
    }
}
