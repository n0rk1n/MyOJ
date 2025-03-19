package cn.oriki.hdu.pid2027;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        in.nextLine(); // ?
        while (n-- > 0) {
            String string = in.nextLine();
            int num1 = 0, num2 = 0, num3 = 0, num4 = 0, num5 = 0;
            for (char c : string.toCharArray()) {
                switch (c) {
                    case 'a':
                        num1++;
                        break;
                    case 'e':
                        num2++;
                        break;
                    case 'i':
                        num3++;
                        break;
                    case 'o':
                        num4++;
                        break;
                    case 'u':
                        num5++;
                        break;
                }
            }
            System.out.println("a:" + num1);
            System.out.println("e:" + num2);
            System.out.println("i:" + num3);
            System.out.println("o:" + num4);
            System.out.println("u:" + num5);
            if (n != 0) {
                System.out.println();
            }
        }
    }
}
