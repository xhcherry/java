package javaLesson.Ex4.Exa4_13;

public class Exa4_13 {
    public static void main(String[] args) {
        Circle circle = new Circle();
        circle.setRadius(196.87);
        Tixing ladder = new Tixing(3, 21, 9);
        Student zhang = new Student();
        System.out.println("zhang����Բ�������");
        double result = zhang.computerArea(circle);
        System.out.println(result);
        System.out.println("zhang�������ε������");
        result = zhang.computerArea(ladder);
        System.out.println(result);
    }
}
