package javaLesson.Ex6.Exa6_1;

public class Exa6_1 {
    public static void main(String[] args) {
        AAA a = new AAA();
        System.out.println("�ӿ��еĳ���" + AAA.MAX);
        System.out.println("����on��������д�ģ���");
        a.on();
        System.out.println("����sum��������д�ģ���" + a.sum(12, 18));
        System.out.println("���ýӿ��ṩ��default����" + a.max(12, 78));
        Com.f();
    }
}
