package HomeWork;

import java.util.Random;

public class HW4_2_1 {
    public static void main(String[] args) {
        Random rd = new Random();
        for (int i = 0; i < 10; i++) {
            int x = rd.nextInt(77) + 20;
            System.out.print(x + " ");
        }
    }
}
