package Experiment.Exp7;

import java.util.List;
import java.util.StringTokenizer;

public class Util {
    public static int getTotalScore(String s) {
        String regex = "[^0123456789]"; // ƥ������ֵ�������ʽ
        String digitMess = s.replaceAll(regex, "*"); // ʹ��*�滻���з�����
        StringTokenizer tokenizer = new StringTokenizer(digitMess, "*");
        int totalScore = 0;
        while (tokenizer.hasMoreTokens()) {
            int score = Integer.parseInt(tokenizer.nextToken());
            totalScore = totalScore + score;
        }
        return totalScore;
    }

    public static String listToString(List<String> stringList) {
        if (stringList == null) {
            return null;
        }
        StringBuilder result = new StringBuilder();
        boolean flag = false;
        for (String string : stringList) {
            if (flag) {
                result.append(" ");
            } else {
                flag = true;
            }
            result.append(string);
        }
        return result.toString();
    }
}
