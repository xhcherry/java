package Review.FileRW;

import java.io.*;

public class Test1 {
    public static void main(String[] args) {
        int count = 0;
        File fRead = new File("Review\\FileRW\\a.txt");
        File fWrite = new File("Review\\FileRW\\b.txt");
        try {
            Writer out = new FileWriter(fWrite);
            BufferedWriter BW = new BufferedWriter(out);
            Reader in = new FileReader(fRead);
            BufferedReader BR = new BufferedReader(in);
            String str;
            while ((str = BR.readLine()) != null) {
                //int len1 = str.length();
                //int len2 = str.replaceAll("百年风华", "").length();
                //count += (len1 - len2) / 4;
                int i = 0;
                while (str.indexOf("百年风华", i) != -1) {
                    count++;
                    i = str.indexOf("百年风华", i) + 4;
                }
            }
            BW.write("a.txt文件中百年风华出现的次数：" + count);
            BW.close();
            BW.newLine();
            out.close();
            in = new FileReader(fWrite);
            BR = new BufferedReader(in);
            /*String s;
            System.out.println(fWrite.getName() + "内容：");
            while ((s = BR.readLine()) != null)
                System.out.println(s);*/
            BR.close();
            in.close();
        } catch (IOException e) {
        }
    }
}