package Experiment.Exp4;

import java.util.*;

public class Station {
    private List<Goods> goodsList;
    private Machine machine = new Machine();

    public List<Goods> getGoodsList() {
        return goodsList;
    }

    public void setGoodsList(List<Goods> goodsList) {
        this.goodsList = goodsList;
    }

    // 检测所有货物
    public void checkAll() {
// 在此完成方法的定义
        Iterator<Goods> iter = goodsList.iterator();
        for (Goods temp : goodsList) {
            try {
                machine.checkBag(temp);
                System.out.println(temp.getName() + "检测通过");
            } catch (DangerException e) {
                e.show();
                System.out.println(temp.getName() + "禁止通行");
            }
        }
    }
}


