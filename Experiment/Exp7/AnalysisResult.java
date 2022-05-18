package Experiment.Exp7;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class AnalysisResult {
    public void analysisFile(String srcFile, String rltFile) {
        List<String> srcFileList = readSrcFile(srcFile); // ��ȡԴ����
        for (int i = 0; i < srcFileList.size(); i++) {
            String line = srcFileList.get(i);
            int totalScore = Util.getTotalScore(line);
            line = line + "�ܳɼ�:" + totalScore + "kg";
            srcFileList.set(i, line);
        }
        saveRltFile(srcFileList, rltFile); // �����ս�����浽Ŀ���ļ���
//д����ɺ󣬶�ȡĿ���ļ��е�����
        List<String> rltFileList = readSrcFile(rltFile);
        System.out.println("Դ�ļ�����Ϊ��" + Util.listToString(srcFileList));
        System.out.println("Ŀ���ļ�����Ϊ��" + Util.listToString(rltFileList));
    }

    private List<String> readSrcFile(String srcFile) {
        List<String> list = new ArrayList<>();
        BufferedReader reader = null;
        try {
            String str;
            reader = new BufferedReader(new FileReader(srcFile));
            while ((str = reader.readLine()) != null) {
                list.add(str);
            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (reader != null) {
                try {
                    reader.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
        return list;
    }

    private void saveRltFile(List<String> list, String rltFile) {
        BufferedWriter writer = null;
        try {
// �ڴ���ɷ����Ķ��壬��list�����е��ַ���д�뵽Ŀ���ļ��У�ÿ���ַ���ռ
            writer = new BufferedWriter(new FileWriter(rltFile));
            for (String str : list) {
                writer.write(str);
                writer.newLine();
                writer.flush();
            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (writer != null) {
                try {
                    writer.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}