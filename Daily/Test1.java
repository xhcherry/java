package Daily;

public class Test1 {
    public static void main(String args[]) {
        TicketHouse officer = new TicketHouse();
        Thread zhangfei, likui;
        zhangfei = new Thread(officer);
        zhangfei.setName("�ŷ�");
        likui = new Thread(officer);
        likui.setName("����");
        zhangfei.start();//�����ŷ��߳�
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
        if (Thread.currentThread().getName().equals("�ŷ�")) {
            saleTicket(20);
        } else if (Thread.currentThread().getName().equals("����")) {
            saleTicket(5);
        }
    }

    private synchronized void saleTicket(int money) {
        String name = Thread.currentThread().getName();
        if (money == 5) {  //���ʹ�ø÷������̴߳��ݵĲ�����5,�Ͳ��õȴ�
            fiveAmount = fiveAmount + 1;
            System.out.println("��" + name + "�볡��," + name + "��Ǯ����");
        } else if (money == 20) {
            while (fiveAmount < 3) {
                try {
                    System.out.println("\n" + name + "���ߵ�...");
                    wait();       //���ʹ�ø÷������̴߳��ݵĲ�����20��ȴ�
                    System.out.println("\n" + name + "������Ʊ");
                } catch (InterruptedException e) {
                }
            }
            fiveAmount = fiveAmount - 3;
            twentyAmount = twentyAmount + 1;
            System.out.println("��" + name + "�볡��," + name + "��20������15Ԫ");
        }
        notifyAll();//���ѵȴ��е��߳�
    }
}