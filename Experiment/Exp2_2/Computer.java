package Experiment.Exp2_2;

import java.util.Arrays;

public class Computer {
    private int[] data; // �����е�����
    private CD includeCD; // �����з���Ĺ���

    Computer() {
        data = new int[8];
    }

    // ��ȡ����
    public int[] getData() {
// �ڴ���ɷ����Ķ���
        return data;
    }// ������̷��������ж�ȡ�������ݣ������ݹ��̵�������������������

    public void putCD(CD cd) {
// �ڴ���ɷ����Ķ���
        includeCD = cd;
        for (int i = 0; i < includeCD.content.length; i++) {
            data[i] = includeCD.content[i];
        }
    }

    // ���ݴ����˴���data�����е�ÿһ��Ԫ�ؼ��ϲ���m��ֵ
    public void addData(int m) {
// �ڴ���ɷ����Ķ���
        for (int i = 0; i < data.length; i++) {
            data[i] += m;
        }
    }// ��¼���ݵ�������

    public void copyToCD() {
// �ڴ���ɷ����Ķ���
        for (int i = 0; i < data.length; i++) {
            includeCD.content[i] = data[i];
        }
    }
}
