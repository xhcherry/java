package javaLesson;

public class Exa2_4 {
    public static void main(String args[]) {
        int[] a = {1, 2, 3, 4};
        int[] b = {100, 200, 300};
        System.out.println("����a��Ԫ�ظ���=" + a.length);
        System.out.println("����b��Ԫ�ظ���=" + a.length);
        System.out.println("����a�����ã���ǰ׺��Ϣ��" + a);
        System.out.println("����b�����ã���ǰ׺��Ϣ��" + b);
        System.out.println(a == b);
        int address = System.identityHashCode(a);
        System.out.printf("����a������%x\n", address);
        address = System.identityHashCode(b);
        System.out.printf("����b������%x\n", address);
        System.out.println("��b��ֵ��ֵ��a");
        a = b;
        address = System.identityHashCode(a);
        System.out.printf("����a������%x\n", address);
        address = System.identityHashCode(b);
        System.out.printf("����b������%x\n", address);
        System.out.println(a == b);
        System.out.println("����a��Ԫ�ظ���=" + a.length);
        System.out.println("����b��Ԫ�ظ���=" + a.length);
        System.out.println("a[0]=" + a[0] + ",a[1]=" + a[1] + ",a[2]=" + a[2]);
        System.out.print("b[0]=" + b[0] + ",b[1=]=" + b[1] + ",b[2]=" + b[2]);
    }
}
