package javaLesson.Ex7;

public class Exa7_5 {
    public static void main(String[] args) {
        int n = 0, m = 0, t = 100;
        try {
            m = Integer.parseInt("8888");
            n = Integer.parseInt("ab89");
            t = 7777;
        } catch (NumberFormatException e) {
            System.out.println("�����쳣��" + e.getMessage());
        }
        System.out.println("n=" + n + " m=" + m + " t=" + t);
        try {
            System.out.println("�����׳�I/O�쳣");
            throw new java.io.IOException("�����");
            //System.out.println("�޷�ִ�У���ע�͵������");
        } catch (java.io.IOException e) {
            System.out.println("�����쳣��" + e.getMessage());
        }
    }
}
