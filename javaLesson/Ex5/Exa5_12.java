package javaLesson.Ex5;

abstract class GirlFriend {
    abstract void speak();

    abstract void cooking();
}

class ChinaGirlFriend extends GirlFriend {
    void speak() {
        System.out.println("���");
    }

    void cooking() {
        System.out.println("ˮ����");
    }
}

class AmericanGirlFriend extends GirlFriend {
    void speak() {
        System.out.println("hello");
    }

    void cooking() {
        System.out.println("roast beef");
    }
}

class Boy {
    GirlFriend friend;

    void setGirlfriend(GirlFriend f) {
        friend = f;
    }

    void showGirlFriend() {
        friend.speak();
        friend.cooking();
    }
}

public class Exa5_12 {
    public static void main(String[] args) {
        GirlFriend girl = new ChinaGirlFriend();
        Boy boy = new Boy();
        boy.setGirlfriend(girl);
        boy.showGirlFriend();
        girl = new AmericanGirlFriend();
        boy.setGirlfriend(girl);
        boy.showGirlFriend();
    }
}
