package cn.oriki.hdu.pid2005;

import java.time.LocalDate;
import java.util.Scanner;

public class Main {

    private static final int[] months = new int[]{31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (scanner.hasNext()) {
            // 以下注释内容在 HDOJ 中无法使用，比如 1985/1/20 是一个非标准日期格式
            // 只能按照分隔符 / 解析后处理
            /*String s = scanner.nextLine();
            DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy/MM/dd");
            LocalDate parse = LocalDate.parse(s, formatter);
            System.out.println(parse.getDayOfYear());*/

            // 解析做法
            String s = scanner.nextLine();
            int ans = getDaysOfYears(s);
            System.out.println(ans);
        }
    }

    private static int getDaysOfYears(String s) {
        String[] str = s.split("/");
        int year = Integer.parseInt(str[0]);
        int mon = Integer.parseInt(str[1]);
        int day = Integer.parseInt(str[2]);

        LocalDate localDate = LocalDate.of(year, 1, 1);
        boolean flag = localDate.isLeapYear();
        int daysOfYears = 0;
        for (int i = 0; i < mon - 1; i++) {
            daysOfYears += months[i];
        }
        daysOfYears += day;
        if (flag && mon > 2) {
            daysOfYears++;
        }
        return daysOfYears;
    }
}
