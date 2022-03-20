package javaLesson.Ex3;

public class Exa3_8 {
    public static void main(String[] args) {
        int[] a = {1, 2, 3, 4};
        char[] b = {'a', 'b', 'c', 'd'};
        for (int n = 0; n < a.length; n++) {
            System.out.println(a[n]);
        }
        for (int n = 0; n < b.length; n++) {
            System.out.println(b[n]);
        }
        for (int i : a) {
            System.out.println(i);
        }
        for (char ch : b) {
            System.out.println(ch);
        }
    }
}
