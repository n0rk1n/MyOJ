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
            System.out.printf("%c %c %c\n", chars[0], chars[1], chars[2]);
        }
    }
}
