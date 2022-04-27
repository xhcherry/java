package javaLesson.Ex5;

class E {
    final double PI = 3.1415926;

    public double getArea(final double r) {
        return PI * r * r;
    }

    public final void speak() {
        System.out.println("ÄãºÃ£¬how is ¡£¡£¡£¡£");
    }
}

public class Exa5_9 {
    public static void main(String[] args) {
        E e = new E();
        System.out.println("Ãæ»ý£º" + e.getArea(100));
        e.speak();
    }
}
