package Demo;

public class Demo2 {
    public static void main(String[] args) {
        //实际参数和形式参数的类型要对应
        int add = Demo2.add(1,2);
        System.out.println(add);
    }
    public static int add(int a,int b){
        return a + b;
    }
}
