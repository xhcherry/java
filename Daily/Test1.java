package Daily;

public class Test1 {
    public static void main(String args[]) {
        TicketHouse officer = new TicketHouse();
        Thread zhangfei, likui;
        zhangfei = new Thread(officer);
        zhangfei.setName("张飞");
        likui = new Thread(officer);
        likui.setName("李逵");
        zhangfei.start();//开启张飞线程
        try {
            Thread.sleep(1000);
        } catch (Exception exp) {
        }
        likui.start();
    }
}

class TicketHouse implements Runnable {
    int fiveAmount = 2, tenAmount = 0, twentyAmount = 0;

    public void run() {
        if (Thread.currentThread().getName().equals("张飞")) {
            saleTicket(20);
        } else if (Thread.currentThread().getName().equals("李逵")) {
            saleTicket(5);
        }
    }

    private synchronized void saleTicket(int money) {
        String name = Thread.currentThread().getName();
        if (money == 5) {  //如果使用该方法的线程传递的参数是5,就不用等待
            fiveAmount = fiveAmount + 1;
            System.out.println("给" + name + "入场卷," + name + "的钱正好");
        } else if (money == 20) {
            while (fiveAmount < 3) {
                try {
                    System.out.println("\n" + name + "靠边等...");
                    wait();       //如果使用该方法的线程传递的参数是20须等待
                    System.out.println("\n" + name + "继续买票");
                } catch (InterruptedException e) {
                }
            }
            fiveAmount = fiveAmount - 3;
            twentyAmount = twentyAmount + 1;
            System.out.println("给" + name + "入场卷," + name + "给20，找赎15元");
        }
        notifyAll();//唤醒等待中的线程
    }
}