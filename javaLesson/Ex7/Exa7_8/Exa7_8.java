package javaLesson.Ex7.Exa7_8;

public class Exa7_8 {
    public static void main(String[] args) {
        CargoBoat ship = new CargoBoat();
        ship.setMaxContent(1000);
        int m = 0;
        try {
            m = 600;
            ship.loading(m);
            m = 400;
            ship.loading(m);
            m = 367;
            ship.loading(m);
            m = 555;
            ship.loading(m);
        } catch (DangerException e) {
            System.out.println(e.warnMess());
            System.out.println("�޷���װ�������� " + m + " �ֵļ�װ��");
            try {
                ship.loading(-m);
            } catch (DangerException exp) {
                System.exit(0);
            } finally {
                System.out.println("������������");
                System.out.println("Ŀǰװ���� " + ship.realContent + " �ֻ���");
            }
        }
    }
}
