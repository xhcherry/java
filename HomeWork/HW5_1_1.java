package HomeWork;

import java.io.*;

public class HW5_1_1 {
    public static void main(String[] args) {
        File f = new File("hello.txt");
        byte[] a = "abcde".getBytes();
        try {
            FileOutputStream out = new FileOutputStream(f);
            out.write(a);
            out.close();
            FileInputStream in = new FileInputStream(f);
            byte[] tom = new byte[3];
            int m = in.read(tom, 0, 3);
            System.out.println(m);
            String s = new String(tom, 0, 3);
            System.out.println(s);
            m = in.read(tom, 0, 3);
            System.out.println(m);
            s = new String(tom, 0, 3);
            System.out.println(s);

        } catch (IOException e) {
        }
    }

}
