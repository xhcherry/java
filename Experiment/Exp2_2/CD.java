package Experiment.Exp2_2;

public class CD {
    public int[] content; // 光盘数据内容数组

    CD() {
        content = new int[8];
    }

    // 获取内容数组
    public int[] getContent() {
// 在此完成方法的定义
        return content;
    }

    // 设置光盘的数据内容，其中根据参数传入的数组来重新创建内容数组对象
    public void setContent(int[] b) {
// 在此完成方法的定义
        content = b;
    }
}
