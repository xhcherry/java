package javaLesson;

public class Exe2_4_4 {
    public static void main(String[] args) {
        long[] a = {1,2,3,4};
        long[] b = {100,200,300,400,500};
        b = a;
        System.out.println("����b�ĳ��ȣ�" + b.length);
        System.out.println("b[0] = " + b[0]);
    }
}
