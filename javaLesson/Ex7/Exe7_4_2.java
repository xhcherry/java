package javaLesson.Ex7;

interface Com {
    public void speak();
}

public class Exe7_4_2 {
    public static void main(String[] args) {
        Com p = () -> {
            System.out.println("p是接口变量");
        };
        p.speak();
    }
}
