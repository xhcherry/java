package javaLesson.Ex8.Exa8_13;

public class Exa8_13 {
    public static void main(String[] args) {
        String cost = "�л�76.8r ��;167.38r ����12.68r";
        double priceSum = GetPrice.givePriceSum(cost);
        System.out.printf("%s\n�ܼ� %.2fr\n", cost, priceSum);
        cost = "ţ��8.5r �㽶3.6r ����2.8r";
        priceSum = GetPrice.givePriceSum(cost);
        System.out.printf("%s\n�ܼ� %.2fr\n", cost, priceSum);
    }
}
