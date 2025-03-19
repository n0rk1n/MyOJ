package cn.oriki.hdu.pid2037;

import java.util.Arrays;
import java.util.Scanner;

/**
 * 题目地址：<a href="https://acm.hdu.edu.cn/showproblem.php?pid=2037">今年暑假不 AC</a>
 */
public class Main {

    /**
     * <a href="http://blog.csdn.net/why_still_confused/article/details/51199493">csdn 内容</a>
     */
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        while (in.hasNextInt()) {
            int n = in.nextInt();
            if (n == 0) {
                break;
            }
            TV[] tvs = new TV[n];
            for (int i = 0; i < n; i++) {
                tvs[i] = new TV(in.nextInt(), in.nextInt());
            }
            Arrays.sort(tvs);

            // 当下一个节目开始时间大于当前节目的结束时间时，加入观看的队列
            int endMax = 0;
            int count = 0;
            for (int i = 0; i < n; i++) {
                if (tvs[i].start >= endMax) {
                    count++;
                    endMax = tvs[i].end;
                }
            }
            System.out.println(count);
        }
    }
}

class TV implements Comparable<TV> {

    int start;
    int end;

    public TV(int start, int end) {
        this.start = start;
        this.end = end;
    }

    @Override
    public int compareTo(TV tv) {
        return Integer.compare(end, tv.end);
    }
}
