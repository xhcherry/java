package javaLesson.Ex8.Exa8_5;

public class TV {
    double price;

    public void setPrice(double m) {
        price = m;
    }

    public String toString() {
        String oldStr = super.toString();
        return oldStr + "\n���ǵ��ӻ����۸��� " + price;
    }
}