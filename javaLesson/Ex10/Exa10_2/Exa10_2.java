package javaLesson.Ex10.Exa10_2;

import java.io.File;

public class Exa10_2 {
    public static void main(String[] args) {
        File javaDir = new File("java1");
        System.out.println(javaDir.isDirectory());
        boolean boo = javaDir.mkdir();
        if (boo)
            System.out.println("�½���Ŀ¼��" + javaDir.getName());
        File dirFile = new File(".");
        System.out.println("ȫ���ļ�");
        String[] fileName = dirFile.list();
        if (fileName == null)
            System.out.println("û���ļ�");
        else
            for (String name : fileName)
                System.out.println(name);
        FileAccept fileAccept = new FileAccept();
        fileAccept.setExtendName("java2");
        System.out.println("���г�javaԴ�ļ� ");
        File[] file = dirFile.listFiles(fileAccept);
        if (file == null)
            System.out.println("û��javaԴ�ļ�");
        else
            for (File f : file) {
                System.out.println(f.getName());
            }
    }
}
