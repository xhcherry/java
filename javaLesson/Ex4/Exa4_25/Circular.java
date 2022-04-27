package javaLesson.Ex4.Exa4_25;

public class Circular {
    Circle bottom;
    double height;

    public Circular(Circle c, double h) {
        bottom = c;
        height = h;
    }

    public double getVolme() {
        return bottom.getArea() * height / 3.0;
    }
}
