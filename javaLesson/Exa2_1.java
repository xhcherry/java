package javaLesson;

public class Exa2_1 {
    public static void main(String args[]) {
        char chinaWord = '好', japanWord = 'の';
        char you = '\u4F60';
        int position = 20320;
        System.out.println("汉字:" + chinaWord + "的位置" + (int) chinaWord);
        System.out.println("日文:" + chinaWord + "的位置" + (int) chinaWord);
        System.out.println(position + "位置上的字符是:" + (char) position);
        position = 21319;
        System.out.println(position + "位置上的字符是:" + (char) position);
        System.out.println("you:" + you);
    }
}

