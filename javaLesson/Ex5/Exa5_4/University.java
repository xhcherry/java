package javaLesson.Ex5.Exa5_4;

public class University {
    void enterRule(double math, double english, double chinese) {
        double total = math + english + chinese;
        if (total >= 180)
            System.out.println(total + "�ﵽ��ѧ¼ȡ��");
        else
            System.out.println(total + "δ�ﵽ¼ȡ��");
    }
}
