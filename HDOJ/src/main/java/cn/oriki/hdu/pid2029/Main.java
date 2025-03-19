package cn.oriki.hdu.pid2029;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        while (n-- > 0) {
            String string = in.next();
            StringBuilder sb = new StringBuilder(string);
            if (sb.reverse().toString().equals(string)) {
                System.out.println("yes");
            } else {
                System.out.println("no");
            }
        }
    }
}
