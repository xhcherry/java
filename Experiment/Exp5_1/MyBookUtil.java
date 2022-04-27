package Experiment.Exp5_1;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class MyBookUtil {
    // 检查目标字符串中是否包含指定的关键字
    public static boolean check(String info, String key) {
        // 在此完成方法的定义
        return info.contains(key);
    }

    // 截取图书信息中的书名
    public static String getName(String info) {
        // 在此完成方法的定义
        return info.substring(info.indexOf("书名：") + 3, info.indexOf("，出版时间"));
    }

    // 截取图书信息中的价格
    public static double getPrice(String info) {
        // 在此完成方法的定义
        return Double.parseDouble(info.substring(info.indexOf("价格：") + 3, info.indexOf("元，页数")));
    }

    // 截取图书信息中的页码
    public static int getPage(String info) {
        // 在此完成方法的定义
        return Integer.parseInt(info.substring(info.indexOf("页数：") + 3, info.lastIndexOf("页")));
    }
}