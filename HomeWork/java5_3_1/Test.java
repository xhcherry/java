package HomeWork.java5_3_1;

import java.io.*;
import java.util.*;

public class Test {
    public static void main(String[] args) {
        File file = new File("HomeWork\\java5_3_1\\input.txt");
        Scanner scan;
        int sum = 0;
        int count = 0;
        try {
            scan = new Scanner(file);
            scan.useDelimiter("[^0123456789.]+");
            BufferedWriter bs = new BufferedWriter(new FileWriter("HomeWork\\java5_3_1\\output.txt"));
            while (scan.hasNext()) {
                try {
                    int price = scan.nextInt();
                    count++;
                    sum = sum + price;
                } catch (InputMismatchException exp) {
                }
            }
            bs.write("所有商品的平均价格为" + sum / count + "元");
            bs.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}