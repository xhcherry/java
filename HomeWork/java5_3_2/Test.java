package HomeWork.java5_3_2;

import java.io.*;
import java.util.regex.*;

public class Test {
    public static void main(String[] args) {
        BufferedReader br;
        try {
            br = new BufferedReader(new FileReader("HomeWork\\java5_3_2\\a.txt"));
            StringBuffer sb = new StringBuffer();
            String str;
            while ((str = br.readLine()) != null) {
                sb.append(str);
            }
            String regex = "百年风华";
            Pattern pattern = Pattern.compile(regex);
            Matcher matcher = pattern.matcher(sb);
            int num = 0;
            while (matcher.find()) {
                num++;
            }
            System.out.println("出现" + num + "次");
        } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }
}