package Experiment.Exp3_1;

public class Circle extends Geometry {
    private double r; // �뾶

    public Circle(double r) {
        this.r = r;
    }

    public double getArea() {
        return 3.14 * r * r;
    }
// �ڴ���дgetArea����������Բ�����
}

