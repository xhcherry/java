package Experiment.Exp3_2;

public class TestMain {
    public static void main(String[] args) {
// 测试教师类
        Person t = new Teacher("张三", 35, "数据库");
        t.showMsg(); // 输出教师信息
        ((Teacher) t).teach(); // 教师进行教学
// 测试教授类
        Person p = new Professor("李四", 45, "人工智能");
        p.showMsg(); // 输出教授信息
        ((Professor) p).teach(); // 教授作为老师进行教学
        ((Professor) p).guide(); // 教授指导研究生
// 测试学生类
        Person s = new Student("王五", 20, 95);
        s.showMsg(); // 输出学生信息
        ((Student) s).exam(); // 学生进行测验
    }
}

