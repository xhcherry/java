package javaLesson.Ex4.Exa4_15;

public class Student {
    int number;

    Student(int n) {
        number = n;

    }

    void speak() {
        System.out.println("Student类的包名是Ex4  我的学号：" + number);
    }
}
