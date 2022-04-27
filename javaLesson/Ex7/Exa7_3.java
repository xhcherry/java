package javaLesson.Ex7;

interface SpeakHello {
    void speak();
}

class HelloMachine {
    public void turnOn(SpeakHello hello) {
        hello.speak();
    }
}

public class Exa7_3 {
    public static void main(String[] args) {
        HelloMachine machine = new HelloMachine();
        machine.turnOn(new SpeakHello() {
            @Override
            public void speak() {
                System.out.println("hello");
            }
        });
        machine.turnOn(new SpeakHello() {
            @Override
            public void speak() {
                System.out.println("ÄãºÃ");
            }
        });
    }
}
