package javaLesson.Ex6;

interface ShowMessage1 {
    void 显示商标(String s);
}

public class Exa6_3 {
    public static void main(String[] args) {
        ShowMessage1 sm1;
        sm1 = (s) -> {
            System.out.println("tvtvtvtv");
            System.out.println(s);
            System.out.println("tvtvtvtv");
        };
        sm1.显示商标("ROG");
        sm1 = (s) -> {
            System.out.println("pcpcpcpc");
            System.out.println(s);
            System.out.println("pcpcpcpc");
        };
        sm1.显示商标("ROG个人");
    }
}
