package Experiment.Exp4;

public class DangerException extends Exception {
    private String message; // �쳣��Ϣ

    // ��ӹ��캯������
    public DangerException() {
        this.message = "Σ�վ���";
    }

    // ���show��������
    public void show() {
        System.out.println(this.message);
    }
}

