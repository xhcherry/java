package javaLesson.Ex5.Exa5_13;

public class Application {
    public static void main(String[] args) {
        MobileTelephone telephone = new MobileTelephone();
        SIM sim = new SIMOFChinaMobile();
        sim.setNumber("12345678901");
        telephone.useSIM(sim);
        telephone.showMess();
        sim = new SIMOFChinaUnicom();
        sim.setNumber("98579827892");
        telephone.useSIM(sim);
        telephone.showMess();
    }
}
