package javaLesson.Ex4;

class Student {
    int number;
}

public class Exa4_22 {
    public static void main(String[] args) {
        Student[] stu = new Student[10];
        for (int i = 0; i < stu.length; i++) {
            stu[i] = new Student();
            stu[i].number = 101 + i;
        }
        for (Student student : stu) System.out.println(student.number);
    }
}
