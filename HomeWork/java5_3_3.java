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
            // TODO �Զ����ɵ� catch ��
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
            System.out.println("�Ͽ�!");
    }
}

class Stu1Thread extends Thread {
    String threadName;

    public Stu1Thread(String threadName) {
        System.out.println("���̵߳�����(˯10����):" + threadName);
        this.threadName = threadName;
    }

    @Override
    public void run() {
        System.out.println(threadName + "������");
    }
}

class Stu2Thread extends Thread {
    String threadName;

    public Stu2Thread(String threadName) {
        System.out.println("���̵߳�����(˯һСʱ):" + threadName);
        this.threadName = threadName;
    }

    @Override
    public void run() {
        System.out.println(threadName + "������");
    }
}