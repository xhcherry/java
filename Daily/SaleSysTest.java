package Daily;

/*Runnable
public class SaleSysTest {
    public static void main(String[] args) {
        SaleSys ss = new SaleSys();
        for (int i = 1; i < 6; i++) {
            new Thread(ss,"��Ʊ��ʽ������" + i).start();
        }
    }
}

class SaleSys implements Runnable {
    private static int ticket = 50;
    private Object obj = new Object();
    @Override
    public void run() {
        while (true) {
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            synchronized (obj) {
                if (ticket > 0) {
                    System.out.println(Thread.currentThread().getName() + "��Ʊ�ţ�"
                            + ticket + "��ʣ�ࣺ" + (ticket - 1));
                    ticket--;
                } else {
                    System.out.println("��Ʊ������");
                    System.exit(0);
                }
            }
        }
    }
}*/
//Thread
public class SaleSysTest {
    public static void main(String[] args) {
        for (int i = 1; i < 6; i++) {
            new SaleThread("��Ʊ��ʽ������" + i).start();
        }
    }
}

class SaleThread extends Thread {
    private static int ticket = 50;
    private static final Object obj = new Object();

    public SaleThread(String name) {
        super(name);
    }

    @Override
    public void run() {
        while (true) {
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            synchronized (obj) {
                if (ticket > 0) {
                    System.out.println(Thread.currentThread().getName() + "��Ʊ�ţ�"
                            + ticket + "��ʣ�ࣺ" + (ticket - 1));
                    ticket--;
                } else {
                    System.out.println("��Ʊ������");
                    System.exit(0);
                }
            }
        }
    }
}