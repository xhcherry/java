package Demo;

public class Pet {
    String name;
    int age;
    //无需构造
    public void shout(){
        System.out.println("jiao   sheng");
    }

    public static void main(String[] args) {
        Pet dog = new Pet();
        dog.name = "1";
        dog.age = 3;
        dog.shout();
        System.out.println(dog.name);
        System.out.println(dog.age);
    }
}

