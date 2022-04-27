package Experiment.Exp2_2;

import java.util.Arrays;

public class User {
    public static void main(String[] args) {
        CD dataCD = new CD(); // 创建一个光盘对象
        int[] b = {1, 2, 3, 4, 5, 6, 7, 8}; // 默认数据
        dataCD.setContent(b); // 设置光盘的默认数据
        int[] a = dataCD.getContent(); // 获取光盘中的数据进行输出
        System.out.println("dataCD上的内容：");
        System.out.println(Arrays.toString(a));
        Computer computerIMB = new Computer(); // 创建一个电脑对象
        computerIMB.putCD(dataCD); // 放入光盘
        System.out.println("\n将dataCD的数据复制到计算机：computerIMB.");
        System.out.println("computerIMB上的内容：");
        System.out.println(Arrays.toString(computerIMB.getData()));
        int m = 12;
        System.out.println("\ncomputerIMB将每个数据增加" + m);
        computerIMB.addData(m); // 处理数据
        System.out.println("computerIMB将增加值后的数据复制到CD:dataCD");
        computerIMB.copyToCD(); // 刻录光盘
        System.out.println("dataCD上的内容：");
        a = dataCD.getContent(); // 获取光盘当前内容输出
        System.out.println(Arrays.toString(a));
    }
}

