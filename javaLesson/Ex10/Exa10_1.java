package javaLesson.Ex10;

import java.io.File;
import java.io.IOException;

public class Exa10_1 {
    public static void main(String[] args) {
        File f = new File("javaLesson\\Ex10\\Exa10_1.java");
        System.out.println(f.getName() + "�ǿɶ����� " + f.canRead());
        System.out.println(f.getName() + "�ĳ��� " + f.length());
        System.out.println(f.getName() + "�ľ���·�� " + f.getAbsolutePath());
        File file = new File("new.txt");
        if (!file.exists()) {
            try {
                file.createNewFile();
                System.out.println("�ڵ�ǰĿ¼�´��������ļ���\n" + file.getName());
            } catch (IOException exp) {
            }
        }
    }
}
