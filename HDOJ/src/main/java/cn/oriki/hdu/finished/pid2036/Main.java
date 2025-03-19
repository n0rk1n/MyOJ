package cn.oriki.hdu.finished.pid2036;

import java.util.Scanner;

public class Main {

    /**
     * 使用鞋带公式计算多边形面积：A = 1/2 * |∑(x_i * y_(i+1) - x_(i+1) * y_i)|
     * 代码中通过循环累加（p[i].x * p[i+1].y - p[i+1].x * p[i].y）来实现
     * 最后将结果除以 2 得到面积
     */
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        while (in.hasNextInt()) {
            int n = in.nextInt(); // 多边形的边数
            if (n == 0) {
                break;
            }
            double sum = 0;
            Point[] p = new Point[n + 1];
            for (int i = 0; i < n; i++) {
                p[i] = new Point(in.nextInt(), in.nextInt());
            }
            p[n] = p[0]; // 多边形的最后一个顶点设置为第一个顶点，使得多边形闭合。
            for (int i = 0; i < n; i++) {
                sum += (p[i].x * p[i + 1].y - p[i + 1].x * p[i].y); // 使用了鞋带公式（也称为测量公式或高斯面积公式）。
            }
            System.out.printf("%.1f\n", sum / 2);
        }
    }

    private static class Point {
        int x;
        int y;

        public Point(int x, int y) {
            this.x = x;
            this.y = y;
        }
    }
}
