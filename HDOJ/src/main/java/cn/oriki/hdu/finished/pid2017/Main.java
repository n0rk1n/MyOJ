package cn.oriki.hdu.finished.pid2017;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        while (n-- != 0) {
            char[] chars = in.next().toCharArray();
            int sum = 0;
            for (char c : chars) {
                if (Character.isDigit(c)) {
                    sum++;
                }
            }
            System.out.println(sum);
        }
    }
}
