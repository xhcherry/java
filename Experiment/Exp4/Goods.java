package Experiment.Exp4;

public class Goods {
    private boolean dangerous; // 是否是危险品
    private String name; // 商品名称

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
