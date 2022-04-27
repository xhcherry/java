package Experiment.Exp5_2;

import java.math.BigInteger;

public class TestMain {
    public static void main(String[] args) {
        BigCalc bc = new BigCalc("987654321987654321987654321", "123456789123456789123456789");
        BigInteger result = null;
// 测试加法运算
        result = bc.doAdd();
        System.out.println("和值：" + result.toString());
// 测试减法运算
        result = bc.doSub();
        System.out.println("差值：" + result.toString());
// 测试乘法运算
        result = bc.doMult();
        System.out.println("乘积：" + result.toString());
// 测试除法运算
        result = bc.doDiv();
        System.out.println("商：" + result.toString());
// 测试计算因子
        BigInteger m = new BigInteger("17637");
        BigInteger count = BigCalc.getFactorCount(m);
        System.out.println(m.toString() + "一共有" + count.toString() + "个因子");
    }
}
