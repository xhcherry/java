package javaLesson.Ex6;

interface AA {
    double f(double x, double y);
}

class BB implements AA {
    public double f(double x, double y) {
        return x * y;
    }

    int g(int a, int b) {
        return a + b;
    }
}

public class Exe6_4_1 {
    public static void main(String[] args) {
        AA a = new BB();
        System.out.println(a.f(3, 5));
        BB b = (BB) a;
        System.out.println(b.g(3, 5));
    }
}
