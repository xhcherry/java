package javaLesson.Ex6;

interface SpeakHello {
    void speakHello();
}

class Chinese implements SpeakHello {
    public void speakHello() {
        System.out.println("�й���ϰ���ʺ����ã��Է�����");
    }
}

class English implements SpeakHello {
    public void speakHello() {
        System.out.println("Ӣ����ϰ���ʺ���ã���������");
    }
}

class KindHello {
    public void lookHello(SpeakHello hello) {
        hello.speakHello();
    }
}

public class Exa6_6 {
    public static void main(String[] args) {
        KindHello a = new KindHello();
        Chinese ccc = new Chinese();
        a.lookHello(ccc);
        a.lookHello(new English());
        a.lookHello(() -> {
            System.out.println("��ũ�ʺ�no bug");
        });
    }
}
