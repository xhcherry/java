package Demo;

//引用传递 ：对象  本质还是值传递
public class Demo5 {
    public static void main(String[] args) {
        Person person = new Person();
        System.out.println(person.name);//null
        Demo5.change(person);
        System.out.println(person.name);//123
    }

    public static void change(Person person) {
        //person是一个对象：指向的->Person person = new Person();
        //这是一个具体的人 可以改变属性
        person.name = "123";
    }
}
//定义一个Person类 有一个属性：name
class Person{
    String name;//默认null
}