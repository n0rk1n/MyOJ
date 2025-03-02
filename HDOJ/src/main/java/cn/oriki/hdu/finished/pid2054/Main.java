package cn.oriki.hdu.finished.pid2054;

import java.math.BigDecimal;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        while (in.hasNext()) {
            // input 中会有小数（或其他）存在
            // 用 String 或 double 也不能完全接受
            // 这里用的 Github 上某位的 BigDecimal 才能解决
            BigDecimal a = in.nextBigDecimal();
            BigDecimal b = in.nextBigDecimal();
            System.out.println(a.compareTo(b) == 0 ? "YES" : "NO");
        }
    }
}