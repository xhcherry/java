package Experiment.Exp3_1;

public class Rect extends Geometry {
    private double length; // ��
    private double width; // ��

    public Rect(double length, double width) {
        this.length = length;
        this.width = width;
    }

    public double getArea() {
        return length * width;
    }
// �ڴ���дgetArea����������������
}
