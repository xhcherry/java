package javaLesson.Ex3;

public class Exe3_5_3 {
    /*public static void main(String args[]) {
        int i, j;
        float s = 0;
        for (i = 1; i <= 20; i++) {
            float t = 1;
            for (j = 1; j <= i; j++) {
                t = t * j;
            }
            s += (float) (1 / t);
        }
        System.out.println(s);
    }*/
    public static void main(String args[]) {
        int i = 1, t = 1;
        float s = 0;
        do {
            t *= i;
            i++;
            s += 1 / (float) t;

        } while (i <= 20);
        System.out.println(s);
    }

}
