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

    // ������л���
    public void checkAll() {
// �ڴ���ɷ����Ķ���
        Iterator<Goods> iter = goodsList.iterator();
        for (Goods temp : goodsList) {
            try {
                machine.checkBag(temp);
                System.out.println(temp.getName() + "���ͨ��");
            } catch (DangerException e) {
                e.show();
                System.out.println(temp.getName() + "��ֹͨ��");
            }
        }
    }
}


