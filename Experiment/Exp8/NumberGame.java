package Experiment.Exp8;

//public class NumberGame implements Runnable {
//    private int targetNumber; // Ŀ������
//    private int guessNumber; // �²������
//    private int min = 1, max = 100; // �²�ı߽�
//    private int result = -1; // ��ʾ�²�����ֵΪ1��ʾ�²�Ĵ��ˣ�-1��ʾ�²��С��
//    private boolean guessing; // ��ǵ�ǰ�Ƿ��ڲ²��У�true��ʾ�ֵ��²��̣߳�false��ʾ�ֵ�����߳�
//    private Thread threadGuess; // �²��߳�
//    private Thread threadCheck; // ����߳�
//
//    public NumberGame(int target) {
//        this.targetNumber = target;
//        // ������룺�ڴ˴����²��̺߳ͼ���̣߳�ʹ�õ�ǰ�������Ϊ�̵߳�Ŀ�����
//    }
//
//    public void startGame() {
//        // ������룺�����²��̺߳ͼ���߳�
//    }
//
//    @Override
//    public void run() {
//        while (true) { // ��ʼ��Ϸѭ��
//            doGame(); // ����һ����Ϸ����
//            if (result == 0) { // ����Ŷ��ˣ���Ϸѭ������
//                break;
//            }
//        }
//    }
//
//    // һ����Ϸ���̣��÷������ɲ�ͬ���߳�ִ��
//    private synchronized void doGame() {
//        // �����ǰ����÷������Ǽ���߳�
//        if ( /*������룺�жϵ�ǰ�߳��Ƿ��Ǽ���߳�*/) {
//        // �����ǰ�����ڲ²�״̬�������ȴ�
//            while (guessing) {
//                try {
//                    // ������룺����ȴ�
//                } catch (InterruptedException e) {
//                    e.printStackTrace();
//                }
//            }
///* ������룺�Բ²������м��
//����²�����ִ���Ŀ����������������ˡ�
//����²������С��Ŀ�������������С�ˡ�
//����²�����ֵ���Ŀ��������������¶��ˡ�
// */
//            // ���֮��ת�����²�״̬
//            guessing = true;
//        }
//// �����ǰ����÷������ǲ²��߳�
//        if ( /*������룺�жϵ�ǰ�߳��Ƿ��ǲ²��߳�*/) {
//// �����ǰ�Ǽ��״̬�У������ȴ�
//            while (!guessing) {
//                try {
//// ������룺����ȴ�
//                } catch (InterruptedException e) {
//                    e.printStackTrace();
//                }
//            }
///* ������룺���ݲ²������б߽��޸Ĳ��²��µ�����
//���²�����Ϊ0ʱ�����ݴ��ڻ���С�ڽ�����Ӧ���޸Ĳ����¸����²������
//ͬʱ������Ҳ��������xx��
//*/
//// �²�֮��ת�������״̬
//            guessing = false;
//        }
//// ������룺һ�ι��̺����������ڵȴ����߳�
//    }
//}
