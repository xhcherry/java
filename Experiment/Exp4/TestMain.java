package Experiment.Exp4;

import java.util.ArrayList;
import java.util.List;

public class TestMain {
    public static void main(String[] args) {
        Station station = new Station();
// ģ������б�
        String[] names = {"ƻ��", "ըҩ", "����", "����", "�ֱ�", "���"};
        List<Goods> list = new ArrayList<>();
        for (int i = 0; i < names.length; i++) {
            Goods g = new Goods();
            g.setName(names[i]);
            g.setDangerous(i % 2 != 0); // �±�Ϊ��������Σ��Ʒ
            list.add(g);
        }
        station.setGoodsList(list);
// ģ����
        station.checkAll();
/*
�������������
ƻ�����ͨ��
Σ��Ʒ����
ըҩ��ֹͨ��
�������ͨ��
Σ��Ʒ����
�����ֹͨ��
�ֱ���ͨ��
Σ��Ʒ����
��ǽ�ֹͨ��*/
    }
}
