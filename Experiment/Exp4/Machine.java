package Experiment.Exp4;

public class Machine {
    // ����������Σ��Ʒ�����׳�DangerException�쳣
    public void checkBag(Goods goods) throws DangerException {
// �ڴ���ɷ����Ķ���
        if (goods.isDangerous())
            throw new DangerException();
    }
}

