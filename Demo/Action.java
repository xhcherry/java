package Demo;

//abstract 抽象类
public abstract class Action {
    //abstract 抽象方法 只有方法名字  没有方法实现
    public abstract void doSomething();
    //不能new这个抽象类 只能靠子类去实现  约束
    //抽象类可以写普通方法
    //抽象方法必须在抽象类中
    //抽象的抽象 约束
}
