package javaLesson.Ex4;

public class Exa4_14 {
    int leg, hand;
    String name;

    Exa4_14(String s) {
        name = s;
        this.init();
    }

    void init() {
        leg = 2;
        hand = 2;
        System.out.println(name + "”–" + hand + " ÷" + leg + "Õ»");
    }

    public static void main(String[] args) {
        Exa4_14 bush = new Exa4_14("≤ª §");
    }
}
