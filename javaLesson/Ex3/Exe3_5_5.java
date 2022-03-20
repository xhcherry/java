package javaLesson.Ex3;

public class Exe3_5_5 {
    public static void main(String[] args) {
        long sum = 0, j = 0;
        for (int i = 1; i <= 10; i++) {
            j = j * 10 + 8;
            sum = sum + j;
        }
        System.out.println(sum);
    }
}
