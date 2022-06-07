package HomeWork.HW2_3_1;

public class PC {
    CPU cpu;
    HardDisk HD;

    public void setCPU(CPU c) {
        this.cpu = c;
    }

    public void setHardDisk(HardDisk h) {
        HD = h;
    }

    void show() {
        System.out.println(cpu.getSpeed());
        System.out.println(HD.getAmount());
    }
}
