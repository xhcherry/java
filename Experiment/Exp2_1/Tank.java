package Experiment.Exp2_1;

public class Tank {
    // �ڴ˶����ٶȺ��ڵ���������
    int speed = 0, BulletAmount = 0;

    // ���ٷ���
    public void speedUp(int s) {
        speed += s;
    }

    // ���ٷ���
    public void speedDown(int d) {
        speed -= d;
    }

    // �����ڵ�����
    public void setBulletAmount(int m) {
        BulletAmount = m;
    }

    // ��ȡ�ڵ�����
    public int getBulletAmount() {
        return BulletAmount;
    }

    // ��ȡ�ٶ�
    public int getSpeed() {
        return speed;
    }

    // ����
    public void fire() {
        if (BulletAmount == 0) {
            System.out.println("�ڵ�������");
        } else
            BulletAmount--;
        System.out.println("���һ���ڵ�");
    }
}
