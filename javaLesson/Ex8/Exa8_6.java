package javaLesson.Ex8;

public class Exa8_6 {
    public static void main(String[] args) {
        char[] a, c;
        String s = "135790一个简单的String字符数组";
        a = new char[4];
        s.getChars(11, 15, a, 0);
        System.out.println(a);
        c = "第二个简单的，还有小假期".toCharArray();
        for (int i = 0; i < c.length; i++) {
            System.out.print(c[i]);
        }
    }
}
