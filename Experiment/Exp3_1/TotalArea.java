package Experiment.Exp3_1;

public class TotalArea {
    private Geometry[] tuxing; // ͼ������
    double zongmianji = 0;

    // ����ͼ������
    public void setTuxing(Geometry[] t) {
        tuxing = t;
    }

    // ����ͼ������������ͼ�ε����֮�Ͳ�����
    public double calculateTotalarea() {
// �ڴ���ɷ����Ķ���
        for (int i = 0; i < tuxing.length; i++) {
            zongmianji += tuxing[i].getArea();
        }
        return zongmianji;
    }
}
