package Experiment.Exp3_1;

public class TotalArea {
    private Geometry[] tuxing; // 图形数组
    double zongmianji = 0;

    // 设置图形数组
    public void setTuxing(Geometry[] t) {
        tuxing = t;
    }

    // 计算图形数组中所有图形的面积之和并返回
    public double calculateTotalarea() {
// 在此完成方法的定义
        for (int i = 0; i < tuxing.length; i++) {
            zongmianji += tuxing[i].getArea();
        }
        return zongmianji;
    }
}
