package javaLesson.Ex4.Exa4_7;

public class Exa4_7 {
    public static void main(String[] args) {
        Battery nanfu = new Battery(100);
        System.out.println("���ڵ�صĴ������ǣ�" + nanfu.electricityAmount);
        Radio radio = new Radio();
        System.out.println("��������ʼʹ�����ڵ��");
        radio.openRadio(nanfu);
        System.out.println("���ڵ��Ŀǰ�Ĵ������ǣ�" + nanfu.electricityAmount);
    }
}
