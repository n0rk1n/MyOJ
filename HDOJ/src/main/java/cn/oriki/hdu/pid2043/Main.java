package cn.oriki.hdu.pid2043;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        while (n-- != 0) {
            String a = in.next();
            if (a.length() < 8 || a.length() > 16) { // 长度校验
                System.out.println("NO");
                continue;
            }

            int haveLowerCase = 0, haveDigit = 0, haveUpperCase = 0, haveSpecial = 0;
            for (char c : a.toCharArray()) {
                if (Character.isLowerCase(c)) {
                    haveLowerCase = 1;
                } else if (Character.isDigit(c)) {
                    haveDigit = 1;
                } else if (Character.isUpperCase(c)) {
                    haveUpperCase = 1;
                } else {
                    haveSpecial = 1;
                }
            }

            int count = haveLowerCase + haveDigit + haveUpperCase + haveSpecial;
            System.out.println(count >= 3 ? "YES" : "NO");
        }
    }
}
