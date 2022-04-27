package Experiment.Exp3_2;

public class Teacher extends Person {
    private String course; // 所教的课程

    // 无参构造
    public Teacher() {
    }

    // 完成带参构造方法定义
    public Teacher(String name, int age, String course) {
        super(name, age);
        this.course = course;
    }

    // 实现setXxx和getXxx方法
    public String getCourse() {
        return course;
    }

    public void setCourse(String course) {
        this.course = course;
    }

    // teach教学方法，不可修改
    public void teach() {
        System.out.println("老师" + getName() + "讲授" + course + "课程");
    }

    public void showMsg() {
        System.out.println("老师姓名为" + this.getName() + ",年龄为" + this.getAge() + "岁");
    }
// 实现抽象方法
}

