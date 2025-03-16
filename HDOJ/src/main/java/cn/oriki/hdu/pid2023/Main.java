package cn.oriki.hdu.pid2023;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        while (in.hasNextInt()) {
            int n = in.nextInt(); // n 行数据
            int m = in.nextInt(); // m 行整数

            Student[] stu = new Student[n];
            double[] avg = new double[m]; // 各个科目的平均成绩
            int num = 0;

            for (int i = 0; i < n; i++) {
                double sum = 0;
                stu[i] = new Student(m);
                for (int j = 0; j < m; j++) {
                    stu[i].grade[j] = in.nextInt(); // 第 i + 1 个学生的第 j + 1 科成绩
                    sum += stu[i].grade[j];
                    avg[j] += stu[i].grade[j];
                }
                stu[i].setAvg(sum / m);
            }
            for (int j = 0; j < m; j++) {
                avg[j] /= n;
            }

            boolean flag;
            for (int i = 0; i < n; i++) {
                flag = true;
                for (int j = 0; j < m; j++) {
                    if (stu[i].grade[j] < avg[j]) {
                        flag = false;
                        break;
                    }
                }
                if (flag) {
                    num++;
                }
            }

            for (int i = 0; i < n - 1; i++) {
                System.out.printf("%.2f ", stu[i].avg);
            }
            System.out.printf("%.2f", stu[n - 1].avg);
            System.out.println();
            for (int i = 0; i < m - 1; i++) {
                System.out.printf("%.2f ", avg[i]);
            }
            System.out.printf("%.2f\n", avg[m - 1]);
            System.out.println(num + "\n");
        }

    }

     static class Student {

        double avg;
        double[] grade;

        public Student(int m) {
            grade = new double[m];
        }

        public void setAvg(double avg) {
            this.avg = avg;
        }
    }
}
