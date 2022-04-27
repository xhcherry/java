package Experiment.Exp2_1;

public class Tank {
    // 在此定义速度和炮弹数量属性
    int speed = 0, BulletAmount = 0;

    // 加速方法
    public void speedUp(int s) {
        speed += s;
    }

    // 减速方法
    public void speedDown(int d) {
        speed -= d;
    }

    // 设置炮弹数量
    public void setBulletAmount(int m) {
        BulletAmount = m;
    }

    // 获取炮弹数量
    public int getBulletAmount() {
        return BulletAmount;
    }

    // 获取速度
    public int getSpeed() {
        return speed;
    }

    // 开火
    public void fire() {
        if (BulletAmount == 0) {
            System.out.println("炮弹打完了");
        } else
            BulletAmount--;
        System.out.println("打出一发炮弹");
    }
}
