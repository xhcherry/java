package Experiment.Exp3_2;

public class Student extends Person {
    private int score; // ����

    // �޲ι���
    public Student() {
    }

    // ��ɴ��ι��췽������
    public Student(String name, int age, int score) {
        super(name, age);
        this.score = score;
    }

    // ʵ��setXxx��getXxx����
    public int getScore() {
        return this.score;
    }

    public void setScore(int score) {
        this.score = score;
    }

    // exam���Է����������޸�
    public void exam() {
        System.out.println("ѧ��" + getName() + "����" + score + "��");
    }

    public void showMsg() {
        System.out.println("ѧ������Ϊ" + this.getName() + ",����Ϊ" + this.getAge() + "��");
    }
// ʵ�ֳ��󷽷�
}