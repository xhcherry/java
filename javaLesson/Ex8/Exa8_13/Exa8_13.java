package javaLesson.Ex8.Exa8_13;

public class Exa8_13 {
    public static void main(String[] args) {
        String cost = "市话76.8r 长途167.38r 短信12.68r";
        double priceSum = GetPrice.givePriceSum(cost);
        System.out.printf("%s\n总价 %.2fr\n", cost, priceSum);
        cost = "牛奶8.5r 香蕉3.6r 酱油2.8r";
        priceSum = GetPrice.givePriceSum(cost);
        System.out.printf("%s\n总价 %.2fr\n", cost, priceSum);
    }
}
