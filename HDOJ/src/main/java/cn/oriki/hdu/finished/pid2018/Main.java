package cn.oriki.hdu.finished.pid2018;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (scanner.hasNext()) {
            int n = scanner.nextInt();
            if (n != 0) {
                List<Integer> list = new ArrayList<>(8);
                list.add(0, 0);
                list.add(1, 1);
                list.add(2, 2);
                list.add(3, 3);
                list.add(4, 4);
                for (int i = 5; i <= n; i++) {
                    list.add(i, list.get(i - 1) + list.get(i - 3));
                }
                System.out.println(list.get(n));
            } else {
                break;
            }
        }
        scanner.close();
    }
}