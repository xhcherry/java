package javaLesson.Ex7;

class Cry {
    public void cry() {
        System.out.println("hello");
    }
}

public class Exe7_4_1 {
    public static void main(String[] args) {
        Cry hello = new Cry() {
            public void cry() {
                System.out.println("hello~");
            }
        };
        hello.cry();
    }
}
