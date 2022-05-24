package Experiment.Exp8;

//public class NumberGame implements Runnable {
//    private int targetNumber; // 目标数字
//    private int guessNumber; // 猜测的数字
//    private int min = 1, max = 100; // 猜测的边界
//    private int result = -1; // 表示猜测结果，值为1表示猜测的大了，-1表示猜测的小了
//    private boolean guessing; // 标记当前是否在猜测中，true表示轮到猜测线程，false表示轮到检查线程
//    private Thread threadGuess; // 猜测线程
//    private Thread threadCheck; // 检查线程
//
//    public NumberGame(int target) {
//        this.targetNumber = target;
//        // 补充代码：在此创建猜测线程和检查线程，使用当前类对象作为线程的目标对象
//    }
//
//    public void startGame() {
//        // 补充代码：启动猜测线程和检查线程
//    }
//
//    @Override
//    public void run() {
//        while (true) { // 开始游戏循环
//            doGame(); // 进行一次游戏过程
//            if (result == 0) { // 如果才对了，游戏循环结束
//                break;
//            }
//        }
//    }
//
//    // 一次游戏过程，该方法会由不同的线程执行
//    private synchronized void doGame() {
//        // 如果当前进入该方法的是检查线程
//        if ( /*补充代码：判断当前线程是否是检查线程*/) {
//        // 如果当前是正在猜测状态，则进入等待
//            while (guessing) {
//                try {
//                    // 补充代码：进入等待
//                } catch (InterruptedException e) {
//                    e.printStackTrace();
//                }
//            }
///* 补充代码：对猜测结果进行检查
//如果猜测的数字大于目标数字则输出“大了”
//如果猜测的数字小于目标数字则输出“小了”
//如果猜测的数字等于目标数字则输出“猜对了”
// */
//            // 检查之后转换到猜测状态
//            guessing = true;
//        }
//// 如果当前进入该方法的是猜测线程
//        if ( /*补充代码：判断当前线程是否是猜测线程*/) {
//// 如果当前是检查状态中，则进入等待
//            while (!guessing) {
//                try {
//// 补充代码：进入等待
//                } catch (InterruptedException e) {
//                    e.printStackTrace();
//                }
//            }
///* 补充代码：根据猜测结果进行边界修改并猜测新的数字
//当猜测结果不为0时，根据大于或者小于进行相应的修改并重新给出猜测的数字
//同时输出“我猜这个数是xx”
//*/
//// 猜测之后转换到检查状态
//            guessing = false;
//        }
//// 补充代码：一次过程后唤醒其他处于等待的线程
//    }
//}
