package javaLesson.Ex10.Exa10_2;

import java.io.File;

public class Exa10_2 {
    public static void main(String[] args) {
        File javaDir = new File("java1");
        System.out.println(javaDir.isDirectory());
        boolean boo = javaDir.mkdir();
        if (boo)
            System.out.println("新建子目录：" + javaDir.getName());
        File dirFile = new File(".");
        System.out.println("全部文件");
        String[] fileName = dirFile.list();
        if (fileName == null)
            System.out.println("没有文件");
        else
            for (String name : fileName)
                System.out.println(name);
        FileAccept fileAccept = new FileAccept();
        fileAccept.setExtendName("java2");
        System.out.println("仅列出java源文件 ");
        File[] file = dirFile.listFiles(fileAccept);
        if (file == null)
            System.out.println("没有java源文件");
        else
            for (File f : file) {
                System.out.println(f.getName());
            }
    }
}
