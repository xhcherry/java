package javaLesson.Ex4.Exa4_7;

public class Exa4_7 {
    public static void main(String[] args) {
        Battery nanfu = new Battery(100);
        System.out.println("南孚电池的储电量是：" + nanfu.electricityAmount);
        Radio radio = new Radio();
        System.out.println("收音机开始使用南孚电池");
        radio.openRadio(nanfu);
        System.out.println("南孚电池目前的储电量是：" + nanfu.electricityAmount);
    }
}
