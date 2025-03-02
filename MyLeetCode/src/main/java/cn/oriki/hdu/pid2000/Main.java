package cn.oriki.hdu.pid2000;

import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        while (in.hasNextLine()) {
            String string = in.nextLine();
            char[] chars = string.toCharArray();
            // 直接升序排序
            Arrays.sort(chars);
            for (int i = 0; i < chars.length; i++) {
                if (i == chars.length - 1) {
                    // 最后一个元素不输出空格
                    System.out.print(chars[i]);
                    continue;
                } else {
                    // 否则输出空格
                    System.out.print(chars[i] + " ");
                }
            }
            System.out.println();
        }
    }
}
