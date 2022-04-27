package javaLesson.Ex5.Exa5_4;

public class Exa5_4 {
    public static void main(String[] args) {
        double math = 62, english = 76.5, chinese = 67;
        ImportantUniversity univer = new ImportantUniversity();
        univer.enterRule(math, english, chinese);
        math = 91;
        english = 82;
        chinese = 86;
        univer.enterRule(math, english, chinese);
    }
}
