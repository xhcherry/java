package Experiment.Exp8;

public class NumberGame implements Runnable {
    private int targetNumber; // Ŀ������
    private int guessNumber; // �²������
    private int min = 1, max = 100; // �²�ı߽�
    private int result = -1; // ��ʾ�²�����ֵΪ1��ʾ�²�Ĵ��ˣ�-1��ʾ�²��С��
    private boolean guessing; // ��ǵ�ǰ�Ƿ��ڲ²��У�true��ʾ�ֵ��²��̣߳�false��ʾ�ֵ�����߳�
    private Thread threadGuess; // �²��߳�
    private Thread threadCheck; // ����߳�

    public NumberGame(int target) {
        this.targetNumber = target;
        // ������룺�ڴ˴����²��̺߳ͼ���̣߳�ʹ�õ�ǰ�������Ϊ�̵߳�Ŀ�����
        threadGuess = new Thread(this);
        threadCheck = new Thread(this);
    }

    public void startGame() {
        // ������룺�����²��̺߳ͼ���߳�
        threadGuess.start();
        threadCheck.start();
    }

    @Override
    public void run() {
        while (true) {
            // ��ʼ��Ϸѭ��
            doGame();
            // ����һ����Ϸ����
            if (result == 0) {
                // ����Ŷ��ˣ���Ϸѭ������
                break;
            }
        }
    }

    // һ����Ϸ���̣��÷������ɲ�ͬ���߳�ִ��
    private synchronized void doGame() {
        // �����ǰ����÷������Ǽ���߳�
        if (Thread.currentThread() == threadCheck/*������룺�жϵ�ǰ�߳��Ƿ��Ǽ���߳�*/) {
            // �����ǰ�����ڲ²�״̬�������ȴ�
            while (guessing) {
                try {
                    // ������룺����ȴ�
                    wait();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
            /* ������룺�Բ²������м��
            ����²�����ִ���Ŀ����������������ˡ�
            ����²������С��Ŀ�������������С�ˡ�
            ����²�����ֵ���Ŀ��������������¶��ˡ�
            */
            if (targetNumber < guessNumber) {
                result = 1;
                System.out.println("����");
            } else if (targetNumber > guessNumber) {
                result = -1;
                System.out.println("С��");
            } else {
                result = 0;
                System.out.println("�¶���");
            }
            // ���֮��ת�����²�״̬
            guessing = true;
        }
        // �����ǰ����÷������ǲ²��߳�
        if (Thread.currentThread() == threadGuess/*������룺�жϵ�ǰ�߳��Ƿ��ǲ²��߳�*/) {
            // �����ǰ�Ǽ��״̬�У������ȴ�
            while (!guessing) {
                try {
                    // ������룺����ȴ�
                    wait();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
            /* ������룺���ݲ²������б߽��޸Ĳ��²��µ�����
            ���²�����Ϊ0ʱ�����ݴ��ڻ���С�ڽ�����Ӧ���޸Ĳ����¸����²������
            ͬʱ������Ҳ��������xx��
            */
            if (result == -1) {
                if (guessNumber > 74) {
                    min = guessNumber;
                    guessNumber = (min + max + 1) / 2;
                    System.out.println("�Ҳ��������" + guessNumber);
                } else {
                    min = guessNumber;
                    guessNumber = (min + max) / 2;
                    System.out.println("�Ҳ��������" + guessNumber);
                }
            } else if (result == 1) {
                max = guessNumber;
                guessNumber = (min + max) / 2;
                System.out.println("�Ҳ��������" + guessNumber);
            }
            // �²�֮��ת�������״̬
            guessing = false;
        }
        // ������룺һ�ι��̺����������ڵȴ����߳�
        notifyAll();
    }
}
