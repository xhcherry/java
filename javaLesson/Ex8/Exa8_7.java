package javaLesson.Ex8;

public class Exa8_7 {
    public static void main(String[] args) {
        byte[] d = "Java���".getBytes();
        System.out.println("d���� " + d.length);
        String hao = new String(d, 6, 2);
        System.out.println(hao);
        String javaNi = new String(d, 0, 8);
        System.out.println(javaNi);
        String highByte = Integer.toBinaryString(d[7]);
        highByte = highByte.substring(highByte.length() - 8);
        String lowByte = Integer.toBinaryString(d[6]);
        lowByte = lowByte.substring(lowByte.length() - 8);
        System.out.println(hao + "�ı���");
        System.out.println(highByte + "" + lowByte);
    }
}
