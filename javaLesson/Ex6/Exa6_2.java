package javaLesson.Ex6;

interface ShowMessage {
    void ��ʾ�̱�(String s);

    default void outPutStart() {
        System.out.println("********");
    }
}

class TV implements ShowMessage {
    public void ��ʾ�̱�(String s) {
        System.out.println("tvtvtvtv");
        System.out.println(s);
        System.out.println("tvtvtvtv");
    }
}

class PC implements ShowMessage {
    public void ��ʾ�̱�(String s) {
        System.out.println("pcpcpcpc");
        System.out.println(s);
        System.out.println("pcpcpcpc");
    }
}

public class Exa6_2 {
    public static void main(String[] args) {
        ShowMessage sm;
        sm = new TV();
        sm.��ʾ�̱�("ROG");
        sm = new PC();
        sm.outPutStart();
        sm.��ʾ�̱�("ROG����");
        sm.outPutStart();
    }
}
