package Experiment.Exp3_2;

public class Professor extends Teacher {
    // �޲ι���
    public Professor() {
    }

    // ��ɴ��ι��췽������
    public Professor(String name, int age, String course) {
        super(name, age, course);
    }

    // ָ�������������޸�
    public void guide() {
        System.out.println("������Ҫ�е�ָ���о����Ĺ���");
    }

    public void showMsg() {
        System.out.println("��������Ϊ" + this.getName() + ",����Ϊ" + this.getAge() + "��");
    }
// ��д�̳е�showMsg����
}

