package javaLesson.Ex7;

public class Exa7_7 {
    public static void main(String[] args) {
        int[] score = {-120, 98, 89, 120, 99};
        int sum = 0;
        for (int number : score) {
            assert number >= 0 : "���������ǳɼ�";
            sum += number;
        }
        System.out.println(sum);
    }
}
