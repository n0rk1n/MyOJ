package cn.oriki.hdu.finished.pid2024;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        in.nextLine();
        while (n-- > 0) {
            String s = in.nextLine();
            char[] chars = s.toCharArray();
            boolean flag = true;
            if (chars[0] == '_' || Character.isLetter(chars[0])) {
                for (int i = 1; i < chars.length; i++) {
                    if (Character.isLetterOrDigit(chars[i]) || chars[i] == '_') {
                        continue;
                    }
                    flag = false;
                    break;
                }
            } else {
                System.out.println("no");
                continue;
            }
            if (flag) {
                System.out.println("yes");
            } else {
                System.out.println("no");
            }
        }
    }
}
