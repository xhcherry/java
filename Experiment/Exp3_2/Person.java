package Experiment.Exp3_2;

public abstract class Person {
    private String name; // ����
    private int age; // ����

    // �޲ι���
    public Person() {
    }

    // ��ɴ��ι��췽���Ķ���
    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    // ʵ��setXxx��getXxx����
    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return this.age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public abstract void showMsg();
// �������󷽷�
}

