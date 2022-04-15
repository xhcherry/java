package javaLesson.Ex4.Exa4_13;

public class Circle {
    double radius, area;

    void setRadius(double r) {
        radius = r;
    }

    double getArea() {
        area = 3.14 * radius * radius;
        return area;
    }
}
