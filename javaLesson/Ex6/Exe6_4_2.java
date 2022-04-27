package javaLesson.Ex6;

interface Com {
    int add(int a, int b);
}

abstract class AAA {
    abstract int add(int a, int b);
}

class BBB extends AAA implements Com {
    public int add(int a, int b) {
        return a + b;
    }
}

public class Exe6_4_2 {
    public static void main(String[] args) {
        BBB bbb = new BBB();
        Com com = bbb;
        System.out.println(com.add(12, 6));
        AAA aaa = bbb;
        System.out.println(aaa.add(10, 5));
    }
}
