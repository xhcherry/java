package javaLesson.Ex3;

public class Exe3_5_2 {
    public static void main(String[] args) {
        int i, j;
        for (j = 2; j < 100; j++) {
            for (i = 2; i <= j / 2; i++) {
                if (j % i == 0)
                    break;
            }
            if (i > j / 2) {
                System.out.print(j+" ");
            }
        }
    }
}
