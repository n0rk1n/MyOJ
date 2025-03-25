package cn.oriki.hdu.pid2059;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        while (in.hasNextInt()) {
            double distance = in.nextInt(); // 跑道总长度
            int n = in.nextInt(); // 充电站个数
            double c = in.nextInt(); // 充满后行驶距离
            double t = in.nextDouble(); // 每次充电所需要的时间
            double vr = in.nextInt(); // 兔子的跑步速度
            double vt1 = in.nextInt(); // 乌龟开电动车的速度
            double vt2 = in.nextInt(); // 乌龟脚蹬电动车
            double[] s = new double[n + 2];
            double[] dp = new double[n + 2];
            double time, len;
            int i, j;
            s[0] = 0;
            s[n + 1] = distance;
            dp[0] = 0;
            for (i = 1; i <= n; i++) {
                s[i] = in.nextInt();
            }

            for (i = 1; i <= n + 1; i++) {
                dp[i] = Integer.MAX_VALUE;
                for (j = 0; j < i; j++) {
                    len = s[i] - s[j];
                    if (len > c) {
                        time = c / vt1 + (len - c) / vt2;
                    } else {
                        time = len / vt1;
                    }
                    time += dp[j];
                    if (j > 0) {
                        time += t;
                    }
                    dp[i] = Math.min(dp[i], time);
                }
            }

            double t2 = (distance / vr);
            if (dp[n + 1] < t2) {
                System.out.println("What a pity rabbit!");
            } else {
                System.out.println("Good job,rabbit!");
            }
        }
    }
}
