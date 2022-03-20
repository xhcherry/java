package javaLesson.Ex3;

import java.util.Scanner;

public class Exa3_9 {
    public static void main(String[] args) {
        System.out.println("输入若干数（以非数字结束输入）");
        Scanner reader = new Scanner(System.in);
        double sum = 0;
        int m = 0;
        while (reader.hasNextDouble()) {
            double x = reader.nextDouble();
            m++;
            sum += x;
        }
        System.out.printf("%d个数的和为%f\n", m, sum);
        System.out.printf("%d个数的平均数为%f\n", m, sum / m);
    }
}
