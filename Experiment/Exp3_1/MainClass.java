package Experiment.Exp3_1;

public class MainClass {
    public static void main(String[] args) {
// ģ�ⴴ�����ͼ�ζ���
        Geometry[] tuxing = new Geometry[29];//��29��Geometry����
        for (int i = 0; i < tuxing.length; i++) {//29��Geometry����ֳ�����
            if (i % 2 == 0) {
                tuxing[i] = new Rect(16 + i, 68);
            } else {
                tuxing[i] = new Circle(10 + i);
            }
        }
// ����ͼ�����֮��
        TotalArea computer = new TotalArea();
        computer.setTuxing(tuxing);
        double area = computer.calculateTotalarea();
        System.out.println("����ͼ�ε����֮�ͣ�" + area);
    }
}
