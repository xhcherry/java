package javaLesson.Ex8.Exa8_13;

import java.util.InputMismatchException;
import java.util.Scanner;

public class GetPrice {
    public static double givePriceSum(String cost) {
        Scanner scanner = new Scanner(cost);
        scanner.useDelimiter("[^0123456789.]+");
        double sum = 0;
        while (scanner.hasNext()) {
            try {
                double price = scanner.nextDouble();
                sum += price;
            } catch (InputMismatchException exp) {
                scanner.next();
            }
        }
        return sum;
    }
}
