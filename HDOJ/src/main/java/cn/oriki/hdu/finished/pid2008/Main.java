package cn.oriki.hdu.finished.pid2008;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        while (in.hasNextInt()) {
            int n = in.nextInt();
            if (n == 0) { // 输入样本中的特殊情况
                break;
            }
            int a = 0, b = 0, c = 0;
            double x;
            for (int i = 0; i < n; i++) {
                x = in.nextDouble(); // 因为输入样本中出现了 0.5 这种情况，所以我们要用 double 接收
                if (x < 0) {
                    a++;
                } else if (x == 0) {
                    b++;
                } else {
                    c++;
                }
            }
            System.out.printf("%d %d %d\n", a, b, c);
        }

    }
}
