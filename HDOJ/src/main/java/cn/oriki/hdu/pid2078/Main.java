package cn.oriki.hdu.pid2078;

import java.util.Arrays;
import java.util.Scanner;

public class Main {

    /**
     * 为了能过个好年，xhd 开始复习了，于是每天晚上背着书往教室跑。
     * xhd 复习有个习惯，在复习完一门课后，他总是挑一门更简单的课进行复习，而他复习这门课的效率为两门课的难度差的平方，而复习第一门课的效率为 100 和这门课的难度差的平方。
     * xhd 这学期选了 n 门课，但是一晚上他最多只能复习 m 门课，请问他一晚上复习的最高效率值是多少？
     * <p>
     * Input:
     * 输入数据的第一行是一个数据 T，表示有 T 组数据。
     * 每组数据的第一行是两个整数 n（1 <= n <= 40），m（1 <= m <= n）。
     * 接着有 n 行，每行有一个正整数 a（1 <= a <= 100），表示这门课的难度值。
     * <p>
     * InputSample:
     * <p>
     * 2（2 组数据）
     * 2 2（第一组数据的 n = 2, m = 2）
     * 52
     * 25
     * 12 5
     * 89
     * 64
     * 6
     * 43
     * 56
     * 72
     * 92
     * 23
     * 20
     * 22
     * 37
     * 31
     */
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        for (int t = in.nextInt(); t > 0; t--) { // 读取一个整数 t，表示接下来要处理的数据组数。
            int n = in.nextInt();
            int m = in.nextInt();

            int pre = 100;
            double max = 0;

            // 对给定的难度进行升序排序
            int[] a = new int[n];
            for (int i = 0; i < n; i++) {
                a[i] = in.nextInt();
            }
            Arrays.sort(a);

            int j = 0, k = m - 1;
            for (int i = 0; i < m; i++) {
                if (i % 2 == 0) {
                    double pow = Math.pow((pre - a[j]), 2);
                    max = Math.max(max, pow);
                    pre = a[j++];
                } else {
                    double pow = Math.pow((pre - a[k]), 2);
                    max = Math.max(max, pow);
                    pre = a[k--];
                }
            }
            System.out.println((int) max);
        }
    }
}
