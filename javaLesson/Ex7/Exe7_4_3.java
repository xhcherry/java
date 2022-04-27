package javaLesson.Ex7;

import java.io.IOException;

public class Exe7_4_3 {
    public static void main(String[] args) {
        try {
            methodA();
        } catch (IOException e) {
            System.out.println("hello");
        } finally {
            System.out.println("thanks");
        }
    }

    public static void methodA() throws IOException {
        throw new IOException();
    }
}
