package javaLesson.Ex4;

class Xiyouji {
    float height, weight;
    String head, ear;

    void speak(String s) {
        head = "歪着头";
        System.out.println(s);
    }
}

public class Exa4_3 {
    public static void main(String[] args) {
        Xiyouji zhubajie, sunwukong;
        zhubajie = new Xiyouji();
        sunwukong = new Xiyouji();
        zhubajie.height = 1.80f;
        zhubajie.head = "大头";
        zhubajie.ear = "一双大耳朵";
        sunwukong.height = 1.62f;
        sunwukong.weight = 1000f;
        sunwukong.head = "秀发飘飘";
        System.out.println("zhubajie身高：" + zhubajie.height);
        System.out.println("zhubajie的头：" + zhubajie.head);
        System.out.println("sunwukong的重量：" + sunwukong.weight);
        System.out.println("sunwukong的头：" + sunwukong.head);
        zhubajie.speak("老猪要娶媳妇");
        System.out.println("zhubajie现在的头：" + zhubajie.head);
        sunwukong.speak("我1000斤，骗八戒背我");
        System.out.println("sunwukong现在的头：" + sunwukong.head);
    }
}
