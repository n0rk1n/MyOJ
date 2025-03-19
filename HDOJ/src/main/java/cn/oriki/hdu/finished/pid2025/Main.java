package cn.oriki.hdu.finished.pid2025;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        while (in.hasNext()) {
            String string = in.nextLine();
            // 字母全部为小写
            char[] s = string.toCharArray();
            char min = 'a';
            for (char c : s) {
                if (c > min) {
                    min = c;
                }
            }
            StringBuilder stringBuilder = new StringBuilder();
            for (char c : s) {
                if (c == min) {
                    stringBuilder.append(c).append("(max)");
                } else {
                    stringBuilder.append(c);
                }
            }
            System.out.println(stringBuilder);
        }
    }
}
