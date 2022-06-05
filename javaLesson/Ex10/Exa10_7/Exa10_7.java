package javaLesson.Ex10.Exa10_7;

import java.io.*;
import java.util.*;

public class Exa10_7 {
    public static void main(String[] args) {
        File fRead = new File("javaLesson\\Ex10\\Exa10_7\\eng.txt");
        File fWrite = new File("javaLesson\\Ex10\\Exa10_7\\engCount.txt");
        try {
            Writer out = new FileWriter(fWrite);
            BufferedWriter bufferedWrite = new BufferedWriter(out);
            Reader in = new FileReader(fRead);
            BufferedReader bufferedRead = new BufferedReader(in);
            String str;
            while ((str = bufferedRead.readLine()) != null) {
                StringTokenizer fenxi = new StringTokenizer(str);
                int count = fenxi.countTokens();
                str = str + "单词个数:" + count;
                bufferedWrite.write(str);
                bufferedWrite.newLine();
            }
            bufferedWrite.close();
            out.close();
            in = new FileReader(fWrite);
            bufferedRead = new BufferedReader(in);
            String s = null;
            System.out.println(fWrite.getName() + "内容:");
            while (bufferedRead.readLine() != null) {
                System.out.println(s);
            }
            bufferedRead.close();
            in.close();
        } catch (IOException e) {
            System.out.println(e);
        }
    }
}
