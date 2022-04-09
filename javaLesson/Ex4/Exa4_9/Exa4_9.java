package javaLesson.Ex4.Exa4_9;

public class Exa4_9 {
    public static void main(String[] args) {
        SIM simOne = new SIM(12345678902L);
        MobileTelephone mobile = new MobileTelephone();
        mobile.setSIM(simOne);
        System.out.println("手机号码：" + mobile.lookNumber());
        SIM simTwo = new SIM(43028753494L);
        mobile.setSIM(simTwo);
        System.out.println("手机号码：" + mobile.lookNumber());
    }
}
