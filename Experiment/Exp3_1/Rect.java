package Experiment.Exp3_1;

public class Rect extends Geometry {
    private double length; // 长
    private double width; // 宽

    public Rect(double length, double width) {
        this.length = length;
        this.width = width;
    }

    public double getArea() {
        return length * width;
    }
// 在此重写getArea方法，计算矩形面积
}
