package javaLesson.Ex5.Exa5_13;

public class MobileTelephone {
    SIM card;

    public void useSIM(SIM card) {
        this.card = card;
    }

    public void showMess() {
        System.out.println("ʹ�õĿ��ǣ�" + card.giveCorpName() + "�ṩ��");
        System.out.println("�ֻ����ǣ�" + card.giveNumber());
    }
}
