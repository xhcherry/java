package javaLesson.Ex3;

public class Exe3_4_2 {
    public static void main(String[] args) {
        char c = '\0';
        for (int i = 1; i <= 4; i++) {
            switch (i) {
                case 1:
                    c = 'J';
                    System.out.println(c);
                case 2:
                    c = 'e';
                    System.out.println(c);
                    break;
                case 3:
                    c = 'p';
                    System.out.println(c);
                default:
                    System.out.println("��");
            }
        }
    }
}
