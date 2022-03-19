package javaLesson;

import java.sql.SQLOutput;
import java.util.Scanner;

public class Exa3_4 {
    public static void main(String[] args) {
        int number = 0;
        System.out.println("输入正整数（回车）");
        Scanner reader = new Scanner(System.in);
        number = reader.nextInt();
        switch (number) {
            case 9:
            case 131:
            case 12:
                System.out.println(number + "三等奖");
                break;
            case 209:
            case 596:
            case 27:
                System.out.println(number + "二等奖");
                break;
            case 875:
            case 316:
            case 59:
                System.out.println(number + "一等奖");
                break;
            default:
                System.out.println(number + "未中奖");
        }
    }

}
