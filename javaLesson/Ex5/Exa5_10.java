package javaLesson.Ex5;

class ����Գ {
    void crySpeak(String s) {
        System.out.println(s);
    }
}

class people1 extends ����Գ {
    void computer(int a, int b) {
        int c = a * b;
        System.out.println(c);
    }

    void crySpeak(String s) {
        System.out.println("***" + s + "***");
    }
}

public class Exa5_10 {
    public static void main(String[] args) {
        ����Գ monkey;
        people1 gengG = new people1();
        System.out.println(gengG instanceof people1);
        monkey = gengG;
        System.out.println(monkey instanceof people1);
        monkey.crySpeak("love");
        people1 peo = (people1) monkey;
        peo.computer(10, 10);
    }
}
