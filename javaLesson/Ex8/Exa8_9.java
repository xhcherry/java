package javaLesson.Ex8;

import java.util.Scanner;

public class Exa8_9 {
    public static void main(String[] args) {
        String regex = "[a-zA-Z|0-9|_]+";
        String regexDigit = "-?[1-9]\\d*";
        Scanner scanner = new Scanner(System.in);
        String str = scanner.nextLine();
        if (str.matches(regex)) {
            System.out.println(str + "��Ӣ����ĸ�����֡����»������");
            if (str.matches(regexDigit))
                System.out.println(str + "�������");
        } else {
            System.out.println(str + "���зǷ��ַ�");
        }
    }
}
