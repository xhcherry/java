package javaLesson.Ex5.Exa5_4;

public class University {
    void enterRule(double math, double english, double chinese) {
        double total = math + english + chinese;
        if (total >= 180)
            System.out.println(total + "达到大学录取线");
        else
            System.out.println(total + "未达到录取线");
    }
}
