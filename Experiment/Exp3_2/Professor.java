package Experiment.Exp3_2;

public class Professor extends Teacher {
    // 无参构造
    public Professor() {
    }

    // 完成带参构造方法定义
    public Professor(String name, int age, String course) {
        super(name, age, course);
    }

    // 指导方法，不可修改
    public void guide() {
        System.out.println("教授需要承担指导研究生的工作");
    }

    public void showMsg() {
        System.out.println("教授姓名为" + this.getName() + ",年龄为" + this.getAge() + "岁");
    }
// 重写继承的showMsg方法
}

