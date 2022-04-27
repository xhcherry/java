package javaLesson.Ex7.Exa7_1;

public class RedCowFarm {
    static String farmName;
    RedCow cow;

    RedCowFarm() {
    }

    RedCowFarm(String s) {
        cow = new RedCow(150, 112, 5000);
        farmName = s;
    }

    public void showCowMess() {
        cow.speak();
    }

    class RedCow {
        String cowName = "牛";
        int height, weight, price;

        RedCow(int h, int w, int p) {
            height = h;
            weight = w;
            price = p;
        }

        void speak() {
            System.out.println("我是:" + cowName + " 身高:" + height + "cm 体重:" + weight + "kg 生活在:" + farmName);
        }
    }
}
