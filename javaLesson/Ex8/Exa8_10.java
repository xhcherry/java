package javaLesson.Ex8;

public class Exa8_10 {
    public static void main(String[] args) {
        String str = "��ѵѧУ��E-mail��qinghua@sina.com.cn��zhang@163.com";
        String regex = "\\w+@\\w+\\.[a-z]+(\\.[a-z]+)?";
        System.out.println("���\n" + str + "\n�е�email��ַ");
        str = str.replaceAll(regex, "");
        System.out.println(str);
        String money = "89,234,423��";
        System.out.println(money + "ת����");
        String s = money.replaceAll("[,\\p{Sc}]", "");
        long number = Long.parseLong(s);
        System.out.println(number);
    }
}
