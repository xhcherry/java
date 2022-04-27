package javaLesson.Ex7.Exa7_6;

public class Exa7_6 {
    public static void main(String[] args) {
        Bank bank = new Bank();
        try {
            bank.income(200, -100);
            bank.income(300, -100);
            bank.income(400, -100);
            System.out.printf("银行目前有 %d RMB\n", bank.getMoney());
            bank.income(200, 100);
            bank.income(99999, -100);
        } catch (BankException e) {
            System.out.println("计算收益过程中出现如下问题：");
            System.out.println(e.warnMess());
        }
        System.out.printf("银行目前有 %d RMB\n", bank.getMoney());
    }
}
