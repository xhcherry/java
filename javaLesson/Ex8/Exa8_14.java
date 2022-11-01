package javaLesson.Ex8;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Exa8_14 {
    public static void main(String[] args) {
        String dataSource = "�л�76.8����;168.2������12.1������20.5";
        String regex = "-?[1-9][0-9]*[.]?[0-9]*";
        Pattern p = Pattern.compile(regex);
        Matcher m = p.matcher(dataSource);
        double sum = 0;
        while (m.find()) {
            String item = m.group();
            System.out.println(item);
            sum = sum + Double.parseDouble(item);
        }
        System.out.println("�˵��ܼ� " + sum);
    }
}