package cn.oriki.hdu.finished.pid2030;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        in.nextLine();
        while (n-- > 0) {
            String s = in.nextLine();
            byte[] bytes = s.getBytes();
            int count = 0;
            for (byte b : bytes) {
                if (b < 0)
                    count++;
            }
            System.out.println(count / 2);
        }
    }
}
