package javaLesson.Ex4.Exa4_5;

public class Exa4_5 {
    public static void main(String[] args) {
        Rect ractangle = new Rect();
        ractangle.width = 109.87;
        ractangle.height = 25.18;
        double area = ractangle.getArea();
        System.out.println("矩形的面积:" + area);
        Ladder ladder = new Ladder();
        ladder.above = 10.798;
        ladder.bottom = 156.65;
        ladder.height = 18.12;
        area = ladder.getArea();
        System.out.println("梯形的面积：" + area);
    }
}
