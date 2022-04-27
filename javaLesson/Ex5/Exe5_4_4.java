package javaLesson.Ex5;

class L {
    int m;

    int getM() {
        return m;
    }

    int seeM() {
        return m;
    }
}

class M extends L {
    int m;

    int getM() {
        return m + 100;
    }
}

public class Exe5_4_4 {
    public static void main(String[] args) {
        M m1 = new M();
        m1.m = 20;
        System.out.println(m1.getM());
        L l = m1;
        l.m = -100;
        System.out.println(l.getM());
        System.out.println(m1.seeM());
    }
}
