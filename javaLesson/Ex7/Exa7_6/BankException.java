package javaLesson.Ex7.Exa7_6;

public class BankException extends Exception {
    String message;

    public BankException(int m, int n) {
        message = "�����ʽ�" + m + "�Ǹ�����֧��" + n + "��������������ϵͳҪ��";
    }

    public String warnMess() {
        return message;
    }
}
