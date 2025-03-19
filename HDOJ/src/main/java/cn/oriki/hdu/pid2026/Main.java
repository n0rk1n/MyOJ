package cn.oriki.hdu.pid2026;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        while (in.hasNext()) {
            String string = in.nextLine();
            char[] arrays = string.toCharArray();

            StringBuilder stringBuilder = new StringBuilder();
            boolean flag = true;

            for (char ch : arrays) {
                if (flag) {
                    char upperCase = Character.toUpperCase(ch);
                    stringBuilder.append(upperCase);
                    flag = false;
                    continue;
                }

                // 元素正常操作
                stringBuilder.append(ch);
                if (ch == ' ') {
                    flag = true;
                }
            }
            System.out.println(stringBuilder);
        }
    }
}
