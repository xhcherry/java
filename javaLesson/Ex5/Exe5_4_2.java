package javaLesson.Ex5;

class H {
    public int getNumber(int a) {
        return a + 1;
    }
}

class I extends H {
    public int getNumber(int a) {
        return a + 100;
    }
}

public class Exe5_4_2 {
    public static void main(String[] args) {
        H h = new H();
        System.out.println(h.getNumber(10));
        h = new I();
        System.out.println(h.getNumber(10));
    }
}
