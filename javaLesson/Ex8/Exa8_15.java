package javaLesson.Ex8;

public class Exa8_15 {
    public static void main(String[] args) {
        StringBuffer str = new StringBuffer();
        System.out.println("capacity:" + str.capacity());
        str.append("��Һ�");
        System.out.println("str:" + str);
        System.out.println("length:" + str.length());
        System.out.println("capacity:" + str.capacity());
        str.setCharAt(0, 'w');
        str.setCharAt(1, 'e');
        System.out.println(str);
        str.insert(2, " are all");
        System.out.println(str);
        int index = str.indexOf("��");
        str.replace(index, str.length(), " right");
        System.out.println(str);
        str.append("���Ǵ�Ҷ��ܺ�.");
        System.out.println(str);
        System.out.println("capacity:" + str.capacity());
        str.delete(0, str.length());
        System.out.println(str);
        System.out.println("capacity:" + str.capacity());
    }
}
