package cn.oriki.hdu.pid2033;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        while (n-- > 0) {
            int hour1 = in.nextInt();
            int minute1 = in.nextInt();
            int second1 = in.nextInt();
            int hour2 = in.nextInt();
            int minute2 = in.nextInt();
            int second2 = in.nextInt();

            if ((second1 + second2) > 59) {
                minute1 += 1;
            }
            second1 = (second1 + second2) % 60;

            if ((minute1 + minute2) > 59) {
                hour1 += 1;
            }
            minute1 = (minute1 + minute2) % 60;

            hour1 += hour2;

            System.out.println(hour1 + " " + minute1 + " " + second1);
        }
    }
}
