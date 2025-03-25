package cn.oriki.hdu.pid2057;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        while (in.hasNext()) {
            String a = in.next();
            String b = in.next();
            long A = Long.valueOf(a, 16);
            long B = Long.valueOf(b, 16);
            long C = A + B;
            if (C >= 0) {
                String c = Long.toHexString(C);
                System.out.println(c.toUpperCase());
            } else {
                String c = Long.toHexString(-C);
                System.out.println("-" + c.toUpperCase());
            }
        }
    }
}
