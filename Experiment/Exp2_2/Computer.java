package Experiment.Exp2_2;

import java.util.Arrays;

public class Computer {
    private int[] data; // 电脑中的数据
    private CD includeCD; // 电脑中放入的光盘

    Computer() {
        data = new int[8];
    }

    // 获取数据
    public int[] getData() {
// 在此完成方法的定义
        return data;
    }// 放入光盘方法，其中读取光盘内容，将根据光盘的内容来创建数据数组

    public void putCD(CD cd) {
// 在此完成方法的定义
        includeCD = cd;
        for (int i = 0; i < includeCD.content.length; i++) {
            data[i] = includeCD.content[i];
        }
    }

    // 数据处理，此处对data数组中的每一个元素加上参数m的值
    public void addData(int m) {
// 在此完成方法的定义
        for (int i = 0; i < data.length; i++) {
            data[i] += m;
        }
    }// 刻录数据到光盘中

    public void copyToCD() {
// 在此完成方法的定义
        for (int i = 0; i < data.length; i++) {
            includeCD.content[i] = data[i];
        }
    }
}
