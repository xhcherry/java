package javaLesson.Ex5;

class Student {
    int number;
    String name;

    Student() {
    }

    Student(int number, String name) {
        this.number = number;
        this.name = name;
        System.out.println("�ҵ������ǣ�" + name + "ѧ���ǣ�" + number);
    }
}

class UniverStudent extends Student {
    boolean ���;

    UniverStudent(int number, String name, boolean b) {
        super(number, name);
        ��� = b;
        System.out.println("���=" + ���);
    }
}

public class Exa5_8 {
    public static void main(String[] args) {
        UniverStudent zhang = new UniverStudent(9901, "��С��", false);
    }
}