package Experiment.Exp3_2;

public class Teacher extends Person {
    private String course; // ���̵Ŀγ�

    // �޲ι���
    public Teacher() {
    }

    // ��ɴ��ι��췽������
    public Teacher(String name, int age, String course) {
        super(name, age);
        this.course = course;
    }

    // ʵ��setXxx��getXxx����
    public String getCourse() {
        return course;
    }

    public void setCourse(String course) {
        this.course = course;
    }

    // teach��ѧ�����������޸�
    public void teach() {
        System.out.println("��ʦ" + getName() + "����" + course + "�γ�");
    }

    public void showMsg() {
        System.out.println("��ʦ����Ϊ" + this.getName() + ",����Ϊ" + this.getAge() + "��");
    }
// ʵ�ֳ��󷽷�
}

