package javaLesson.Ex4;

class AAA {
    static {
        System.out.println("AAAµÄ¾²Ì¬¿é");
    }
}

public class Exe4_4_6 {
    static {
        System.out.println("×îÏÈÖ´ÐÐµÄ¾²Ì¬¿é");
    }

    public static void main(String[] args) {
        AAA a = new AAA();
        System.out.println("¾²Ì¬¿éing");
    }
}

