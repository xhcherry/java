package HomeWork;

import java.util.Scanner;

class NotsanjiaoException extends Exception {
    public NotsanjiaoException() {
    }
}

class Sanj {
    double x, y, z;

    public Sanj(double a, double b, double c) throws NotsanjiaoException {
        x = a;
        y = b;
        z = c;
        try {
            if ((x >= y + z) || (x <= Math.abs(y - z)) || (y >= x + z) || (y <= Math.abs(x - z)) || (z >= y + x) || (z <= Math.abs(y - x)) ||
                    x == 0 || y == 0 || z == 0) throw new Exception("不是三角");
        } catch (Exception e) {
            throw new NotsanjiaoException();
        }
    }

    public double getArea() {
        double p;
        p = (x + y + z) / 2.0;
        double s = p * (p - x) * (p - y) * (p - z);
        s = Math.sqrt(s);
        return s;
    }

    public void showInfo() {
        System.out.println(x + " " + y + " " + z);
    }
}

public class HW3_3_3 {
    public static void main(String[] args) {
        int a1, a2, a3;
        Scanner sc = new Scanner(System.in);
        a1 = sc.nextInt();
        a2 = sc.nextInt();
        a3 = sc.nextInt();
        try {
            Sanj s = new Sanj(a1, a2, a3);
            double x = s.getArea();
            System.out.println(x);
            s.showInfo();
        } catch (Exception e) {
            System.out.println("不是三角");
        }
    }
}
