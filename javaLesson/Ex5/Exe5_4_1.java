package javaLesson.Ex5;

class F {
    double f(double x, double y) {
        return x + y;
    }
}

class G extends F {
    double f(int x, int y) {
        return x * y;
    }
}

public class Exe5_4_1 {
    public static void main(String[] args) {
        G g = new G();
        System.out.println(g.f(3, 5));
        System.out.println(g.f(3.0, 5.0));
    }
}
