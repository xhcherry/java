package javaLesson.Ex10;

import java.io.File;
import java.io.IOException;

public class Exa10_1 {
    public static void main(String[] args) {
        File f = new File("javaLesson\\Ex10\\Exa10_1.java");
        System.out.println(f.getName() + "是可读的吗 " + f.canRead());
        System.out.println(f.getName() + "的长度 " + f.length());
        System.out.println(f.getName() + "的绝对路径 " + f.getAbsolutePath());
        File file = new File("new.txt");
        if (!file.exists()) {
            try {
                file.createNewFile();
                System.out.println("在当前目录下创建了新文件：\n" + file.getName());
            } catch (IOException exp) {
            }
        }
    }
}
