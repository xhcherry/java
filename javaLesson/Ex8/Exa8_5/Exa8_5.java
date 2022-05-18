package javaLesson.Ex8.Exa8_5;

import java.util.Date;

public class Exa8_5 {
    public static void main(String[] args) {
        Date date = new Date();
        System.out.println(date);
        int address = System.identityHashCode(date);
        System.out.printf("date对象的引用：%x\n", address);
        TV tv = new TV();
        tv.setPrice(645.34);
        System.out.println(tv);
        address = System.identityHashCode(tv);
        System.out.printf("tv对象的引用:%x\n", address);
    }
}
