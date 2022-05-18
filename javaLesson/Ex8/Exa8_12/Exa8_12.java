package javaLesson.Ex8.Exa8_12;

public class Exa8_12 {
    public static void main(String[] args) {
        String shoppingReceipt = "牛奶8.5r 香蕉3.6r 酱油2.8r";
        PriceToken lookPriceMess = new PriceToken();
        System.out.println(shoppingReceipt);
        double sum = lookPriceMess.getPriceSum(shoppingReceipt);
        System.out.printf("购物总价%-7.2f ", sum);
        int amount = lookPriceMess.getGoodsAmount(shoppingReceipt);
        double aver = lookPriceMess.getAverPrice(shoppingReceipt);
        System.out.printf("\n商品数目%d 平均价格%-7.2f", amount, aver);
    }
}
