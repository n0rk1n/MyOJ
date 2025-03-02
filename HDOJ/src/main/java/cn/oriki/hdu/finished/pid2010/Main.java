package cn.oriki.hdu.finished.pid2010;

import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        while (in.hasNextInt()) {
            int start = in.nextInt();
            int end = in.nextInt();

            List<Integer> s = new ArrayList<>();
            int x, y, z;
            for (int i = start; i <= end; i++) {
                x = i / 100;
                y = i / 10 - x * 10;
                z = i - y * 10 - x * 100;
                if (x * x * x + y * y * y + z * z * z == i) {
                    s.add(i);
                }
            }

            if (s.isEmpty()) {
                System.out.println("no");
            } else {
                for (int i = 0; i < s.size(); i++) {
                    System.out.print(s.get(i));
                    if (i != s.size() - 1) {
                        System.out.print(" ");
                    }
                }
            }
        }
    }
}
