package javaLesson.Ex7;

import java.util.Scanner;

public class Exe7_5_5 {
    public static void main(String[] args) {
        System.out.println("�������������Է����ֽ������룩");
        Scanner reader = new Scanner(System.in);
        double sum = 0;
        int m = 0;
        while (reader.hasNextDouble()) {
            double x = reader.nextDouble();
            assert (x >= 0 && x <= 100) : "�Ƿ��ĳɼ�����";
            m++;
            sum += x;
        }
        System.out.printf("%d�����ĺ�Ϊ%f\n", m, sum);
        System.out.printf("%d������ƽ����Ϊ%f\n", m, sum / m);
    }
}
