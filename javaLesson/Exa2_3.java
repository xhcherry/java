package javaLesson;

import java.util.Scanner;

public class Exa2_3 {
    public static void main(String args[]) {
        System.out.println("�ÿո��س����ָ�������������\n" + "0�س�����");
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

