package Experiment.Exp5_1;

public class TestUtil {
    public static void main(String[] args) {
        String bookInfo = "������Java������ƣ�����ʱ�䣺2011.10.01,"+ "�����磺�廪��ѧ�����磬�۸�29.8Ԫ��ҳ����389ҳ";
// ���԰���
        if (MyBookUtil.check(bookInfo, "����")) {
            System.out.println("ͼ����Ϣ�а����ؼ��֣�����");
        }
// ���Ի�ȡ����
        String bookName = MyBookUtil.getName(bookInfo);
        System.out.println("ͼ������Ϊ��" + bookName);
// ���Ի�ȡ�۸�
        double price = MyBookUtil.getPrice(bookInfo);
        System.out.println("ͼ��۸�Ϊ��" + price);
// ���Ի�ȡҳ��
        int page = MyBookUtil.getPage(bookInfo);
        System.out.println("ͼ�鹲��" + page + "ҳ");

    }
}
