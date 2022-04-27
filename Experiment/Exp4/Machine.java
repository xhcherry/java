package Experiment.Exp4;

public class Machine {
    // 检查货物，如果是危险品，则抛出DangerException异常
    public void checkBag(Goods goods) throws DangerException {
// 在此完成方法的定义
        if (goods.isDangerous())
            throw new DangerException();
    }
}

