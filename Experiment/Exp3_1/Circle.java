package Experiment.Exp3_1;

public class Circle extends Geometry {
    private double r; // 半径

    public Circle(double r) {
        this.r = r;
    }

    public double getArea() {
        return 3.14 * r * r;
    }
// 在此重写getArea方法，计算圆形面积
}

