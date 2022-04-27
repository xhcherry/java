package Experiment.Exp5_2;

import java.math.BigInteger;

public class BigCalc {
    private BigInteger num1;
    private BigInteger num2;

    public BigCalc(String str1, String str2) {
        num1 = new BigInteger(str1);
        num2 = new BigInteger(str2);
    }

    // �ӷ�����
    public BigInteger doAdd() {
        return num1.add(num2);
    }

    // ��������
    public BigInteger doSub() {
        return num1.subtract(num2);
    }

    // �˷�����
    public BigInteger doMult() {
        return num1.multiply(num2);
    }

    // ��������
    public BigInteger doDiv() {
        return num1.divide(num2);
    }

    // ��ȡ���Ӹ���
    public static BigInteger getFactorCount(BigInteger num) {
        BigInteger count = new BigInteger("0"); // �������
        BigInteger zero = BigInteger.ZERO; // BigInteger�����ֶ�
        BigInteger one = BigInteger.ONE; // BigInteger�����ֶΣ�
// �ڴ���ɷ����Ķ��壬��ȡ����num�����ӵĸ���
        for (BigInteger i = one; i.compareTo(num) < 0; i = i.add(one)) {
            BigInteger re = num.remainder(i);
            int res = re.compareTo(zero);
            if (res == 0) {
                count = count.add(one);
            }
        }
        return count;
    }
}
