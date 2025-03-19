package cn.oriki.hdu.finished.pid2020;

import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (scanner.hasNextInt()) {
            int n = scanner.nextInt();
            if (n == 0) {
                break;
            }
            Number[] x = new Number[n];
            for (int i = 0; i < n; i++) {
                x[i] = new Number(scanner.nextInt());
            }
            Arrays.sort(x);
            for (int i = 0; i < n - 1; i++) {
                System.out.print(x[i].a + " ");
            }
            System.out.println(x[n - 1].a);
        }
        scanner.close();
    }
}

class Number implements Comparable<Number> {

    int a;

    public Number(int a) {
        this.a = a;
    }

    @Override
    public int compareTo(Number A) {
        return Integer.compare(Math.abs(A.a), Math.abs(a));
    }
}

