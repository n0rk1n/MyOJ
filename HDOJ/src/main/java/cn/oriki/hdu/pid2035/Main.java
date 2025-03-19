package cn.oriki.hdu.pid2035;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        while (in.hasNextInt()) {
            int a = in.nextInt(); // 第一个数
            int b = in.nextInt(); // 第二个数
            if (a == 0 || b == 0) {
                break;
            }
            int sum = 1;
            while (b-- > 0) {
                sum = (sum * a) % 1000; // 取后三位
            }
            System.out.println(sum);
        }
    }
}
