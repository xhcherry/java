package Experiment.Exp5_1;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class MyBookUtil {
    // ���Ŀ���ַ������Ƿ����ָ���Ĺؼ���
    public static boolean check(String info, String key) {
        // �ڴ���ɷ����Ķ���
        return info.contains(key);
    }

    // ��ȡͼ����Ϣ�е�����
    public static String getName(String info) {
        // �ڴ���ɷ����Ķ���
        return info.substring(info.indexOf("������") + 3, info.indexOf("������ʱ��"));
    }

    // ��ȡͼ����Ϣ�еļ۸�
    public static double getPrice(String info) {
        // �ڴ���ɷ����Ķ���
        return Double.parseDouble(info.substring(info.indexOf("�۸�") + 3, info.indexOf("Ԫ��ҳ��")));
    }

    // ��ȡͼ����Ϣ�е�ҳ��
    public static int getPage(String info) {
        // �ڴ���ɷ����Ķ���
        return Integer.parseInt(info.substring(info.indexOf("ҳ����") + 3, info.lastIndexOf("ҳ")));
    }
}