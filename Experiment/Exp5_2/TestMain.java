package Experiment.Exp5_2;

import java.math.BigInteger;

public class TestMain {
    public static void main(String[] args) {
        BigCalc bc = new BigCalc("987654321987654321987654321", "123456789123456789123456789");
        BigInteger result = null;
// ���Լӷ�����
        result = bc.doAdd();
        System.out.println("��ֵ��" + result.toString());
// ���Լ�������
        result = bc.doSub();
        System.out.println("��ֵ��" + result.toString());
// ���Գ˷�����
        result = bc.doMult();
        System.out.println("�˻���" + result.toString());
// ���Գ�������
        result = bc.doDiv();
        System.out.println("�̣�" + result.toString());
// ���Լ�������
        BigInteger m = new BigInteger("17637");
        BigInteger count = BigCalc.getFactorCount(m);
        System.out.println(m.toString() + "һ����" + count.toString() + "������");
    }
}
