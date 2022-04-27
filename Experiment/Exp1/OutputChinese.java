package Experiment.Exp1;

public class OutputChinese {
    public static void getChineseString(char ch, int code) {
        int chnum = (int) ch;
        for (int i = 0; i <= 5; i++)
            System.out.print((char) chnum++ + "(" + (chnum - 1) + ")");
        System.out.println();
        for (int i = 0; i <= 5; i++)
            System.out.print((char) code++ + "(" + (code - 1) + ")");
    }

    public static void main(String[] args) {
        char ch = 'жа';
        int code = 22269;
        getChineseString(ch, code);
    }
}






