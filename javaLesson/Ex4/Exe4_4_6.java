package javaLesson.Ex4;

class AAA {
    static {
        System.out.println("AAA�ľ�̬��");
    }
}

public class Exe4_4_6 {
    static {
        System.out.println("����ִ�еľ�̬��");
    }

    public static void main(String[] args) {
        AAA a = new AAA();
        System.out.println("��̬��ing");
    }
}

