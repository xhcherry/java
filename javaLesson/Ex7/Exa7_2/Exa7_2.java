package javaLesson.Ex7.Exa7_2;

public class Exa7_2 {
    public static void main(String[] args) {
        ShowBank showBank = new ShowBank();
        showBank.showMess(new Bank() {
            public void output() {
                money += 100;
                System.out.printf("�й������ʽ�%3d\n", money);
            }
        });
        showBank.showMess(new Bank(500) {
            public void output() {
                money += 100;
                System.out.printf("���������ʽ�%3d\n", money);
            }
        });
    }
}
