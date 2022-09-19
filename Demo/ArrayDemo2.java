package Demo;

import java.sql.SQLOutput;

public class ArrayDemo2 {
    public static void main(String[] args) {
        //静态初始化:创建＋赋值
        int[] a = {1,2,34,5,6,7,8};
        System.out.println(a[0]);
        //动态初始化：包含默认初始化
        int[] b = new int[10];
        b[0] = 10;
        System.out.println(b[0]);
    }
}
