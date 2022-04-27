package javaLesson.Ex4.Exa4_12;

public class Exa4_12 {
    public static void main(String[] args) {
        People tom = new People();
        System.out.println(tom.hello(10, 20));
        System.out.println(tom.hello(10L, 20));
        System.out.println(tom.hello(10.0, 20));
    }
}
