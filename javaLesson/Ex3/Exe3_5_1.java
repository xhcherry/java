package javaLesson.Ex3;

public class Exe3_5_1 {
    public static void main(String[] args) {
        long sum = 0, fact = 1;
        for (int i = 1; i <= 10; i++) {
            fact *= i;
            sum = +fact;
        }
        System.out.println(sum);
    }

}
