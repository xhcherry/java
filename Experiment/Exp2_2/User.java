package Experiment.Exp2_2;

import java.util.Arrays;

public class User {
    public static void main(String[] args) {
        CD dataCD = new CD(); // ����һ�����̶���
        int[] b = {1, 2, 3, 4, 5, 6, 7, 8}; // Ĭ������
        dataCD.setContent(b); // ���ù��̵�Ĭ������
        int[] a = dataCD.getContent(); // ��ȡ�����е����ݽ������
        System.out.println("dataCD�ϵ����ݣ�");
        System.out.println(Arrays.toString(a));
        Computer computerIMB = new Computer(); // ����һ�����Զ���
        computerIMB.putCD(dataCD); // �������
        System.out.println("\n��dataCD�����ݸ��Ƶ��������computerIMB.");
        System.out.println("computerIMB�ϵ����ݣ�");
        System.out.println(Arrays.toString(computerIMB.getData()));
        int m = 12;
        System.out.println("\ncomputerIMB��ÿ����������" + m);
        computerIMB.addData(m); // ��������
        System.out.println("computerIMB������ֵ������ݸ��Ƶ�CD:dataCD");
        computerIMB.copyToCD(); // ��¼����
        System.out.println("dataCD�ϵ����ݣ�");
        a = dataCD.getContent(); // ��ȡ���̵�ǰ�������
        System.out.println(Arrays.toString(a));
    }
}

