package javaLesson.Ex8;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Exa8_14 {
    public static void main(String[] args) {
        String dataSource = "市话76.8，长途168.2，短信12.1，其他20.5";
        String regex = "-?[1-9][0-9]*[.]?[0-9]*";
        Pattern p = Pattern.compile(regex);
        Matcher m = p.matcher(dataSource);
        double sum = 0;
        while (m.find()) {
            String item = m.group();
            System.out.println(item);
            sum = sum + Double.parseDouble(item);
        }
        System.out.println("账单总价 " + sum);
    }
}