package javaLesson.Ex4;

class Point2 {
    int x, y;

    void setXY(int m, int n) {
        x = m;
        y = n;
    }
}

public class Exa4_4 {
    public static void main(String[] args) {
        Point2 p1 = null, p2 = null;
        p1 = new Point2();
        p2 = new Point2();
        System.out.println("p1�����ã�" + p1);
        System.out.println("p2�����ã�" + p2);
        p1.setXY(1111, 2222);
        p2.setXY(-100, -200);
        System.out.println("p1��x,y����" + p1.x + "," + p1.y);
        System.out.println("p2��x,y����" + p2.x + "," + p2.y);
        p1 = p2;
        System.out.println("��p2�����ø���p1��");
        int address = System.identityHashCode(p1);
        System.out.printf("p1������:%x\n", address);
        address = System.identityHashCode(p2);
        System.out.printf("p2������:%x\n", address);
        System.out.println("p1��x,y����" + p1.x + "," + p1.y);
        System.out.println("p2��x,y����" + p2.x + "," + p2.y);
    }
}
