package cn.oriki.hdu.finished.pid2096;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        while (t-- > 0) {
            int a = in.nextInt();
            int b = in.nextInt();

            int c = ((a % 100) + (b % 100)) % 100;
            System.out.println(c);
        }
    }
}
