package javaLesson;

public class Exa3_1 {
    public static void main(String[] args) {
        char a1 = 'ʮ',a2 = '��',a3 = '��',a4 = '��';
        char secret = 'A';
        a1 = (char)(a1^secret);
        a2 = (char)(a2^secret);
        a3 = (char)(a3^secret);
        a4 = (char)(a4^secret);
        System.out.println("���ģ�" + a1 + a2 + a3 + a4);
        a1 = (char)(a1^secret);
        a2 = (char)(a2^secret);
        a3 = (char)(a3^secret);
        a4 = (char)(a4^secret);
        System.out.println("ԭ�ģ�" + a1 + a2 + a3 + a4);
    }
}
