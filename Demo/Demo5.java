package Demo;

//���ô��� ������  ���ʻ���ֵ����
public class Demo5 {
    public static void main(String[] args) {
        Person person = new Person();
        System.out.println(person.name);//null
        Demo5.change(person);
        System.out.println(person.name);//123
    }

    public static void change(Person person) {
        //person��һ������ָ���->Person person = new Person();
        //����һ��������� ���Ըı�����
        person.name = "123";
    }
}
//����һ��Person�� ��һ�����ԣ�name
class Person{
    String name;//Ĭ��null
}