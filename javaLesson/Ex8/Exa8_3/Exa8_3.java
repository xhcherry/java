package javaLesson.Ex8.Exa8_3;

import java.util.*;

public class Exa8_3 {
    public static void main(String[] args) {
        String[] a = {"melon", "apple", "pear", "banana"};
        String[] b = {"����", "ƻ��", "��", "�㽶"};
        System.out.print("ʹ��SortString��ķ������ֵ�����������a:");
        SortString.sort(a);
        for (String s : a) {
            System.out.print(" " + s);
        }
        System.out.println(" ");
        System.out.print("ʹ������е�Arrays�࣬���ֵ�����������b:");
        Arrays.sort(b);
        for (String s : b) {
            System.out.print(" " + s);
        }
    }
}
