package javaLesson.Ex5;

class People {
    private int averHeight = 166;

    public int getAverHeight() {
        return averHeight;
    }
}

class ChinaPeople extends People {
    int height;

    public void setHeight(int h) {
        height = h;
    }

    public int getHeight() {
        return height;
    }
}

public class Exa5_2 {
    public static void main(String[] args) {
        ChinaPeople zhangSan = new ChinaPeople();
        System.out.println("子类对象未继承的averageHeight的值是：" + zhangSan.getHeight());
        zhangSan.setHeight(178);
        System.out.println("子类对象的实例变量height的值是：" + zhangSan.getHeight());
    }
}
