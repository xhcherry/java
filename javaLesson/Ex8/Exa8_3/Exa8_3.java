package javaLesson.Ex8.Exa8_3;

import java.util.*;

public class Exa8_3 {
    public static void main(String[] args) {
        String[] a = {"melon", "apple", "pear", "banana"};
        String[] b = {"西瓜", "苹果", "梨", "香蕉"};
        System.out.print("使用SortString类的方法按字典序排列数组a:");
        SortString.sort(a);
        for (String s : a) {
            System.out.print(" " + s);
        }
        System.out.println(" ");
        System.out.print("使用类库中的Arrays类，按字典序排列数组b:");
        Arrays.sort(b);
        for (String s : b) {
            System.out.print(" " + s);
        }
    }
}
