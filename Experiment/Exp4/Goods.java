package Experiment.Exp4;

public class Goods {
    private boolean dangerous; // �Ƿ���Σ��Ʒ
    private String name; // ��Ʒ����

    public void setDangerous(boolean dangerous) {
        this.dangerous = dangerous;
    }

    public boolean isDangerous() {
        return dangerous;
    }

    public void setName(String s) {
        name = s;
    }

    public String getName() {
        return name;
    }
}
