package javaLesson.Ex5;

class J {
    double f(double x, double y) {
        return x + y;
    }

    static int g(int n) {
        return n * n;
    }
}

class K extends J {
    double f(double x, double y) {
        double m = super.f(x, y);
        return m + x * y;
    }

    static int g(int n) {
        int m = J.g(n);
        return m + n;
    }
}

public class Exe5_4_3 {
    public static void main(String[] args) {
        K k = new K();
        System.out.println(k.f(10.0, 8.0));
        System.out.println(k.g(3));
        J j = new K();
        System.out.println(j.f(10.8, 8.0));
        System.out.println(j.g(3));
    }
}
