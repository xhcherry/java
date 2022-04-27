package Experiment.Exp4;

public class DangerException extends Exception {
    private String message; // 异常消息

    // 添加构造函数定义
    public DangerException() {
        this.message = "危险警告";
    }

    // 添加show方法定义
    public void show() {
        System.out.println(this.message);
    }
}

