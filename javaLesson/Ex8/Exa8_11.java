package javaLesson.Ex8;

import java.util.Scanner;

public class Exa8_11 {
    public static void main(String[] args) {
        System.out.println("һ���ı�:");
        Scanner reader = new Scanner(System.in);
        String str = reader.nextLine();
        String regex = "[\\s\\d\\p{Punct}]+";
        String[] words = str.split(regex);
        for (int i = 0; i < words.length; i++) {
            int m = i + 1;
            System.out.println("����" + m + ":" + words[i]);
        }
    }
}