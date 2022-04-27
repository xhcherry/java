package javaLesson.Ex5;

class C {
    Object get() {
        return null;
    }
}

class D extends C {
    Integer get() {
        return new Integer(100);
    }
}

public class Exa5_6 {
    public static void main(String[] args) {
        D d = new D();
        Integer t = d.get();
        System.out.println(t.intValue());
    }
}
