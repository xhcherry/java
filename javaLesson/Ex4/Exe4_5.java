package javaLesson.Ex4;

public class Exe4_5 {
    public static void main(String[] args) {
        f(1, 2);
        f(-1, -2, -3, -4);
        f(9, 7, 6);
    }

    public static void f(int... x) {
        for (int i = 0; i < x.length; i++)
            System.out.println(x[i]);
    }
}

