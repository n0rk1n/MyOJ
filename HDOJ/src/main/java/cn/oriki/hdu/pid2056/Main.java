package cn.oriki.hdu.pid2056;

import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        while (in.hasNextDouble()) {
            double[] x = new double[4];
            double[] y = new double[4];

            for (int i = 0; i < 4; i++) {
                x[i] = in.nextDouble();
                y[i] = in.nextDouble();
            }

            // 如果一个矩形的最小 x 值大于等于另一个矩形的最大 x 值，或者反之，则它们在 x 轴上不重叠
            // 同理判断 y 轴上是否重叠
            if (Math.min(x[0], x[1]) >= Math.max(x[2], x[3]) || Math.min(x[2], x[3]) >= Math.max(x[1], x[0])) {
                System.out.println("0.00");
            } else if (Math.min(y[0], y[1]) >= Math.max(y[2], y[3]) || Math.min(y[2], y[3]) >= Math.max(y[1], y[0])) {
                System.out.println("0.00");
            } else {
                // 如果两个矩形重叠，程序将所有 x 坐标和 y 坐标分别排序
                // 重叠区域的宽度是第二小的 x 坐标减去第三小的 x 坐标：(x[1] - x[2])
                // 重叠区域的高度是第二小的 y 坐标减去第三小的 y 坐标：(y[1] - y[2])
                // 重叠面积 = 宽度 × 高度
                Arrays.sort(x);
                Arrays.sort(y);
                System.out.printf("%.2f", (x[1] - x[2]) * (y[1] - y[2]));
                System.out.println();
            }
        }
    }
}
