package Demo;

public class private1 {
    private int id;
    private char sex;
    private String name;
    private int age;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if (age > 120 || age < 0){
            this.age = 3;
    }else {
            this.age = age;
        }
    }

    public char getSex() {
        return sex;
    }

    public void setSex(char sex) {
        this.sex = sex;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public static void main(String[] args) {
        private1 p1 = new private1();
        p1.setName("chen");
        System.out.println(p1.getName());
        p1.setAge(-1);
        System.out.println(p1.getAge());
    }
}
/*
提高程序的安全性 保护数据
隐藏代码的实现细节
统一接口
系统可维护增加了
 */
