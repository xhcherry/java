package javaLesson.Ex7;

interface SpeakHelloa {
    void speak1();
}

class HelloMachine1 {
    public void turnOn(SpeakHelloa hello) {
        hello.speak1();
    }
}

public class Exa7_4 {
    public static void main(String[] args) {
        HelloMachine1 machine = new HelloMachine1();
        machine.turnOn(() -> System.out.println("hello"));
        machine.turnOn(() -> System.out.println("ÄãºÃ"));
    }
}
