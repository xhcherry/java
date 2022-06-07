package HomeWork;

interface interfaceA {
}

class ClassA implements interfaceA {
    public void method(int n) {
        int sum = 0;
        for (int i = 0; i <= n; i++) {
            sum += i;
        }
        System.out.println(sum);
    }
}

class ClassB implements interfaceA {
    public void method(int n) {
        int sum = 1;
        for (int i = 1; i <= n; i++) {
            sum = i * sum;
        }
        System.out.println(sum);
    }
}

public class HW3_3_1 {
    public static void main(String[] args) {
        ClassA a = new ClassA();
        ClassB b = new ClassB();
        a.method(5);
        b.method(5);
    }
}
