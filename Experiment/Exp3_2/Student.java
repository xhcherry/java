package Experiment.Exp3_2;

public class Student extends Person {
    private int score; // 分数

    // 无参构造
    public Student() {
    }

    // 完成带参构造方法定义
    public Student(String name, int age, int score) {
        super(name, age);
        this.score = score;
    }

    // 实现setXxx和getXxx方法
    public int getScore() {
        return this.score;
    }

    public void setScore(int score) {
        this.score = score;
    }

    // exam考试方法，不可修改
    public void exam() {
        System.out.println("学生" + getName() + "考了" + score + "分");
    }

    public void showMsg() {
        System.out.println("学生姓名为" + this.getName() + ",年龄为" + this.getAge() + "岁");
    }
// 实现抽象方法
}