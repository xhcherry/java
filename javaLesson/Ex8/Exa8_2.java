package javaLesson.Ex8;

public class Exa8_2 {
    public static void main(String[] args) {
        String s1, s2;
        s1 = new String("�������");
        s2 = new String("�������");
        System.out.println(s1);
        System.out.println(s2);
        System.out.println("���ߵ�ʵ����ͬ��" + s1.equals(s2));
        int addressS1 = System.identityHashCode(s1);
        int addressS2 = System.identityHashCode(s2);
        System.out.printf("String����s1��s2�����÷ֱ���%x,%x\n", addressS1, addressS2);
        System.out.println("���ߵ�������ͬ��" + s1 == s2);
        String s3, s4;
        s3 = "we are students";
        s4 = new String("we are students");
        System.out.println(s3);
        System.out.println(s4);
        System.out.println("���ߵ�ʵ����ͬ��" + s3.equals(s4));
        int addressS3 = System.identityHashCode(s3);
        int addressS4 = System.identityHashCode(s4);
        System.out.printf("String����s3��s4�����÷ֱ���%x,%x\n", addressS3, addressS4);
        System.out.println("���ߵ�������ͬ��" + s3 == s4);
        String s5, s6;
        s5 = "we are students";
        s6 = new String("we are students");
        System.out.println(s5);
        System.out.println(s6);
        System.out.println("���ߵ�ʵ����ͬ��" + s5.equals(s6));
        int addressS5 = System.identityHashCode(s5);
        int addressS6 = System.identityHashCode(s6);
        System.out.printf("String����s3��s4�����÷ֱ���%x,%x\n", addressS5, addressS6);
        System.out.println("���ߵ�������ͬ��" + s5 == s6);
    }
}
