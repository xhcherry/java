public class Main {
    public int value = 10;

    public int getValue() {
        int value = 300;
        System.out.println(value);
        return this.value + new InnerClass().getValue() + value;
    }

    public static class InnerClass {
        public int value = 20;

        public int getValue() {
            return value * 100;
        }
    }
//666
    public static void main(String[] args) {
        System.out.println(new Main().value);
        System.out.println(new InnerClass().value);
        System.out.println(new InnerClass().getValue());
        System.out.println(new Main().getValue());
    }
}
