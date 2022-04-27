package Experiment.Exp5_2;

import java.math.BigInteger;

public class BigCalc {
    private BigInteger num1;
    private BigInteger num2;

    public BigCalc(String str1, String str2) {
        num1 = new BigInteger(str1);
        num2 = new BigInteger(str2);
    }

    // 加法运算
    public BigInteger doAdd() {
        return num1.add(num2);
    }

    // 减法运算
    public BigInteger doSub() {
        return num1.subtract(num2);
    }

    // 乘法运算
    public BigInteger doMult() {
        return num1.multiply(num2);
    }

    // 除法运算
    public BigInteger doDiv() {
        return num1.divide(num2);
    }

    // 获取因子个数
    public static BigInteger getFactorCount(BigInteger num) {
        BigInteger count = new BigInteger("0"); // 计数结果
        BigInteger zero = BigInteger.ZERO; // BigInteger内置字段
        BigInteger one = BigInteger.ONE; // BigInteger内置字段，
// 在此完成方法的定义，获取参数num的因子的个数
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
