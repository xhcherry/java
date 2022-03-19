package javaLesson;

import java.util.Scanner;

public class Exa2_3 {
    public static void main(String args[]) {
        System.out.println("用空格或回车做分隔，输入若干数\n" + "0回车结束");
        Scanner reader = new Scanner(System.in);
        double sum = 0;
        double x = reader.nextDouble();
        while (x != 0) {
            sum = sum + x;
            x = reader.nextDouble();
        }
        System.out.printf("sum=%10.5f\n", sum);
    }
}

