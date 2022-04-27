package Experiment.Exp1;

public class HandleLargeNumber {
    public static void add(int[] a, int[] b) {
        int[] c = null;
        c = new int[a.length];
        int temp = 0;
        for (int i = a.length - 1; i >= 0; i--) {
            c[i] = (a[i] + b[i] + temp) % 10;
            temp = (a[i] + b[i] + temp) / 10;
        }
        Jude_Print(a);
        System.out.print("+");
        Jude_Print(b);
        System.out.print("=");
        Jude_Print(c);
        System.out.println();
    }

    public static void Jude_Print(int[] d) {
        for (int i = 0; i < d.length; i++) {
            if (d[i] != 0) {
                for (; i < d.length; i++) {
                    System.out.print(d[i]);
                }
                break;
            }
        }

    }

    public static void main(String[] args) {
        int[] a = {1, 8, 9, 7, 0, 4, 3, 5, 8, 0, 4, 2, 7, 8, 5, 6, 8, 5, 8, 5, 9, 9};
        int[] b = {0, 2, 0, 0, 2, 8, 6, 8, 2, 1, 5, 3, 9, 6, 4, 0, 4, 2, 0, 1, 4, 9};
        add(a, b);
    }
}
