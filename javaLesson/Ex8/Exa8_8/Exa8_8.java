package javaLesson.Ex8.Exa8_8;

import java.util.Scanner;

public class Exa8_8 {
    public static void main(String[] args) {
        String sourceString = "����ʮ�����";
        EncryptAndDecrypt person = new EncryptAndDecrypt();
        System.out.println("����������� " + sourceString);
        Scanner scanner = new Scanner(System.in);
        String password = scanner.nextLine();
        String secret = person.encrypt(sourceString, password);
        System.out.println("���� " + secret);
        System.out.println("��������");
        password = scanner.nextLine();
        String source = person.decrypt(secret, password);
        System.out.println("���� " + source);
    }
}