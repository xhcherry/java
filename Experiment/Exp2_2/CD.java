package Experiment.Exp2_2;

public class CD {
    public int[] content; // ����������������

    CD() {
        content = new int[8];
    }

    // ��ȡ��������
    public int[] getContent() {
// �ڴ���ɷ����Ķ���
        return content;
    }

    // ���ù��̵��������ݣ����и��ݲ�����������������´��������������
    public void setContent(int[] b) {
// �ڴ���ɷ����Ķ���
        content = b;
    }
}
