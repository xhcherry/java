package javaLesson.Ex4;

import java.util.Date;
import java.util.Arrays;

public class Exa4_16 {
    public static void main(String[] args) {
        Date date = new Date();
        System.out.println("本机器的时间：");
        System.out.println(date);
        int[] a = {12, 34, -34, 2, 100};
        Arrays.sort(a);
        System.out.println(Arrays.toString(a));
    }
}
