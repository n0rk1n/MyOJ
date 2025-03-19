package cn.oriki.hdu.finished.pid2034;

import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

public class Main {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        while (in.hasNextInt()) {
            int n = in.nextInt(); // 第一个数字
            int m = in.nextInt(); // 第二个数字
            if (n == 0 && m == 0) {
                break;
            }

            Set<Integer> s = new TreeSet<>();

            // 将第一个数组的元素加入 Set
            for (int i = 0; i < n; i++) {
                s.add(in.nextInt());
            }

            // 从 Set 中删除第二个数组的元素
            for (int i = 0; i < m; i++) {
                s.remove(in.nextInt()); // 如果存在会移走，否则不会变化
            }

            // 为空的情况
            if (s.isEmpty()) {
                System.out.println("NULL");
                continue;
            }

            // 输出元素，因为用的是 TreeSet
            for (Integer i : s) {
                System.out.printf("%d ", i);
            }

            System.out.println();
        }
    }
}
