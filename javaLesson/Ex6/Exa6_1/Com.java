package javaLesson.Ex6.Exa6_1;

public interface Com {
    public static final int MAX = 100;

    public abstract void on();

    public float sum(float x, float y);

    default int max(int a, int b) {
        outPutJava();
        return a > b ? a : b;
    }

    public static void f() {
        System.out.println("ע���Ǵ�java se 8��ʼ��");
    }

    private void outPutJava() {
        System.out.println("Java");
    }
}
