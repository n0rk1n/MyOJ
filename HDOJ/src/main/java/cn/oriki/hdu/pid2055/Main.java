package cn.oriki.hdu.pid2055;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        while (t-- > 0) {
            String next = in.next();
            int y = in.nextInt();
            if (Character.isUpperCase(next.charAt(0))) {
                System.out.println(next.charAt(0) - 64 + y);
            } else {
                System.out.println(96 - next.charAt(0) + y);
            }
        }
    }
}
