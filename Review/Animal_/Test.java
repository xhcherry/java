package Review.Animal_;

interface Protected {
    void protect();
}

abstract class Animal implements Protected {
    String name;

    public Animal(String name) {
        this.name = name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void getName() {
    }

    public abstract void protect();
}

class Tiger extends Animal {
    public Tiger(String name) {
        super(name);
    }

    public void protect() {
        System.out.println(name);
    }
}

class Monkey extends Animal {
    public Monkey(String name) {
        super(name);
    }

    public void protect() {
        System.out.println(name);
    }
}

public class Test {
    public static void main(String[] args) {
        Protected T = new Tiger("hu");
        T.protect();
        T = new Monkey("hou");
        T.protect();
    }
}