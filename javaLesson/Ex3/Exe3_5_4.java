package javaLesson.Ex3;

public class Exe3_5_4 {
    public static void main(String[] args) {
        for (int i = 2; i < 1000; i++) {
            int num = 0;
            for (int j = 1; j <= i / 2; j++) {
                if (i % j == 0) {
                    num += j;
                }
            }
            if (i == num) {
                System.out.println(i);
            }
        }
    }
}
