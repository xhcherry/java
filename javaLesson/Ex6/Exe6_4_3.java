package javaLesson.Ex6;

interface Coma {
    int add(int a, int b);

    public static int get(int n) {
        return n;
    }

    public default int see(int n) {
        return n;
    }

    public default int look(int n) {
        return n;
    }
}

class A1 implements Coma {
    public int add(int a, int b) {
        return a + b;
    }

    public int see(int n) {
        return n + 1;
    }
}

public class Exe6_4_3 {
    public static void main(String[] args) {
        A1 a = new A1();
        int m = a.add(12, 6);
        int n = Coma.get(12);
        int t = a.see(6);
        int q = a.look(6);
        System.out.printf("%d %d %d %d ", m, n, t, q);
    }
}
