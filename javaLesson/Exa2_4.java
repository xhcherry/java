package javaLesson;

public class Exa2_4 {
    public static void main(String args[]) {
        int[] a = {1, 2, 3, 4};
        int[] b = {100, 200, 300};
        System.out.println("数组a的元素个数=" + a.length);
        System.out.println("数组b的元素个数=" + a.length);
        System.out.println("数组a的引用（带前缀信息）" + a);
        System.out.println("数组b的引用（带前缀信息）" + b);
        System.out.println(a == b);
        int address = System.identityHashCode(a);
        System.out.printf("数组a的引用%x\n", address);
        address = System.identityHashCode(b);
        System.out.printf("数组b的引用%x\n", address);
        System.out.println("将b的值赋值给a");
        a = b;
        address = System.identityHashCode(a);
        System.out.printf("数组a的引用%x\n", address);
        address = System.identityHashCode(b);
        System.out.printf("数组b的引用%x\n", address);
        System.out.println(a == b);
        System.out.println("数组a的元素个数=" + a.length);
        System.out.println("数组b的元素个数=" + a.length);
        System.out.println("a[0]=" + a[0] + ",a[1]=" + a[1] + ",a[2]=" + a[2]);
        System.out.print("b[0]=" + b[0] + ",b[1=]=" + b[1] + ",b[2]=" + b[2]);
    }
}
