package javaLesson.Ex6;

interface SpeakHello {
    void speakHello();
}

class Chinese implements SpeakHello {
    public void speakHello() {
        System.out.println("中国人习惯问候语：你好，吃饭了吗");
    }
}

class English implements SpeakHello {
    public void speakHello() {
        System.out.println("英国人习惯问候：你好，天气不错");
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
            System.out.println("码农问候：no bug");
        });
    }
}
