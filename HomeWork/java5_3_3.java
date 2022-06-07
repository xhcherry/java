package HomeWork;

public class java5_3_3 {
    public static void main(String[] args) {
        TeacherThread teacher = new TeacherThread("teacher");
        Stu1Thread stu1 = new Stu1Thread("stu1");
        Stu2Thread stu2 = new Stu2Thread("stu2");
        try {
            stu1.sleep(600000);
            stu2.sleep(3600000);
        } catch (InterruptedException e) {
            // TODO 自动生成的 catch 块
            e.printStackTrace();
        }
        teacher.start();
        stu1.start();
        stu2.start();
    }
}

class TeacherThread extends Thread {
    String threadName;

    public TeacherThread(String threadName) {
        this.threadName = threadName;
    }

    public void run() {
        for (int i = 0; i < 3; i++)
            System.out.println("上课!");
    }
}

class Stu1Thread extends Thread {
    String threadName;

    public Stu1Thread(String threadName) {
        System.out.println("本线程的名字(睡10分钟):" + threadName);
        this.threadName = threadName;
    }

    @Override
    public void run() {
        System.out.println(threadName + "被唤醒");
    }
}

class Stu2Thread extends Thread {
    String threadName;

    public Stu2Thread(String threadName) {
        System.out.println("本线程的名字(睡一小时):" + threadName);
        this.threadName = threadName;
    }

    @Override
    public void run() {
        System.out.println(threadName + "被唤醒");
    }
}