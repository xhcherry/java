package javaLesson.Ex5.Exa5_4;

public class ImportantUniversity extends University {
    void enterRule(double math, double english, double chinese) {
        double total = math + english + chinese;
        if (total >= 220)
            System.out.println(total + "�ﵽ��ѧ¼ȡ��");
        else
            System.out.println(total + "δ�ﵽ¼ȡ��");
    }
}
