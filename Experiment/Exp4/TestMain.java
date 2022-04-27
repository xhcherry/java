package Experiment.Exp4;

import java.util.ArrayList;
import java.util.List;

public class TestMain {
    public static void main(String[] args) {
        Station station = new Station();
// 模拟货物列表
        String[] names = {"苹果", "炸药", "西服", "硫酸", "手表", "硫磺"};
        List<Goods> list = new ArrayList<>();
        for (int i = 0; i < names.length; i++) {
            Goods g = new Goods();
            g.setName(names[i]);
            g.setDangerous(i % 2 != 0); // 下标为奇数的是危险品
            list.add(g);
        }
        station.setGoodsList(list);
// 模拟检查
        station.checkAll();
/*
本例将会输出：
苹果检测通过
危险品警告
炸药禁止通行
西服检测通过
危险品警告
硫酸禁止通行
手表检测通过
危险品警告
硫磺禁止通行*/
    }
}
