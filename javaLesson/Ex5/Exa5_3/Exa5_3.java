package javaLesson.Ex5.Exa5_3;

public class Exa5_3 {
    public static void main(String[] args) {
        CheapGoods cheapGoods = new CheapGoods();
        cheapGoods.newSetWeight(198);
        System.out.println("����cheapGoods��weight��ֵ�ǣ�" + cheapGoods.weight);
        System.out.println("cheapGoods�������������Żݷ�ʽ����۸�" + cheapGoods.newGetPrice());
        cheapGoods.oldSetWeight(198.987);
        System.out.println("cheapGoodsʹ�ü̳еķ��������Żݣ�����۸�" + cheapGoods.oldGetPrice());
    }
}
