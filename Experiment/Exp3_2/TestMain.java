package Experiment.Exp3_2;

public class TestMain {
    public static void main(String[] args) {
// ���Խ�ʦ��
        Person t = new Teacher("����", 35, "���ݿ�");
        t.showMsg(); // �����ʦ��Ϣ
        ((Teacher) t).teach(); // ��ʦ���н�ѧ
// ���Խ�����
        Person p = new Professor("����", 45, "�˹�����");
        p.showMsg(); // ���������Ϣ
        ((Professor) p).teach(); // ������Ϊ��ʦ���н�ѧ
        ((Professor) p).guide(); // ����ָ���о���
// ����ѧ����
        Person s = new Student("����", 20, 95);
        s.showMsg(); // ���ѧ����Ϣ
        ((Student) s).exam(); // ѧ�����в���
    }
}

