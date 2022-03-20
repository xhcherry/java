package javaLesson.Ex3;

public class Exe3_5_6 {
    public static void main(String[] args) {
        int sum = 0, i = 1;
        while (sum < 8888) {
            i++;
            sum += i;
        }
        i = i - 1;
        System.out.println(i);
    }
}
