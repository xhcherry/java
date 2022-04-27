package Experiment.Exp3_1;

public class MainClass {
    public static void main(String[] args) {
// 模拟创建多个图形对象
        Geometry[] tuxing = new Geometry[29];//有29个Geometry对象
        for (int i = 0; i < tuxing.length; i++) {//29个Geometry对象分成两类
            if (i % 2 == 0) {
                tuxing[i] = new Rect(16 + i, 68);
            } else {
                tuxing[i] = new Circle(10 + i);
            }
        }
// 计算图形面积之和
        TotalArea computer = new TotalArea();
        computer.setTuxing(tuxing);
        double area = computer.calculateTotalarea();
        System.out.println("各种图形的面积之和：" + area);
    }
}
