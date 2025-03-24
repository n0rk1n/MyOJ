package cn.oriki.hdu.pid2050;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int c = in.nextInt();
        while (c-- > 0) {
            int n = in.nextInt();
            System.out.println(2 * n * n - n + 1);
        }
        in.close();
    }
}
