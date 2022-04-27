package Experiment.Exp3_2;

public abstract class Person {
    private String name; // 姓名
    private int age; // 年龄

    // 无参构造
    public Person() {
    }

    // 完成带参构造方法的定义
    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    // 实现setXxx和getXxx方法
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
// 声明抽象方法
}

