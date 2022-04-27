package Experiment.Exp5_1;

public class TestUtil {
    public static void main(String[] args) {
        String bookInfo = "书名：Java程序设计，出版时间：2011.10.01,"+ "出版社：清华大学出版社，价格：29.8元，页数：389页";
// 测试包含
        if (MyBookUtil.check(bookInfo, "程序")) {
            System.out.println("图书信息中包含关键字：程序");
        }
// 测试获取书名
        String bookName = MyBookUtil.getName(bookInfo);
        System.out.println("图书名称为：" + bookName);
// 测试获取价格
        double price = MyBookUtil.getPrice(bookInfo);
        System.out.println("图书价格为：" + price);
// 测试获取页码
        int page = MyBookUtil.getPage(bookInfo);
        System.out.println("图书共有" + page + "页");

    }
}
