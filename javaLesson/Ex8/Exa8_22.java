package javaLesson.Ex8;

import java.util.Arrays;
import java.util.Random;

public class Exa8_22 {
    public static void main(String[] args) {
        int number = 7;
        int[] saveNumber = new int[number];
        for (int i = 0; i < saveNumber.length; i++)
            saveNumber[i] = i + 1;
        int[] frequency = new int[number];
        Random random = new Random();
        int counts = 10000;
        int i = 1;
        while (i <= counts) {
            int m = random.nextInt(number) + 1;
            int index = Arrays.binarySearch(saveNumber, m);
            if (index >= 0)
                frequency[index]++;
            i++;
        }
        System.out.println("循环" + counts + "次");
        System.out.println(Arrays.toString(saveNumber));
        System.out.println("各个数字出现的次数：");
        System.out.println(Arrays.toString(frequency));
        int sum = 0;
        for (int item : frequency)
            sum += item;
        System.out.println("sum=" + sum);
    }
}
