package Experiment.Exp7;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class AnalysisResult {
    public void analysisFile(String srcFile, String rltFile) {
        List<String> srcFileList = readSrcFile(srcFile); // 读取源数据
        for (int i = 0; i < srcFileList.size(); i++) {
            String line = srcFileList.get(i);
            int totalScore = Util.getTotalScore(line);
            line = line + "总成绩:" + totalScore + "kg";
            srcFileList.set(i, line);
        }
        saveRltFile(srcFileList, rltFile); // 将最终结果保存到目标文件中
//写入完成后，读取目标文件中的内容
        List<String> rltFileList = readSrcFile(rltFile);
        System.out.println("源文件内容为：" + Util.listToString(srcFileList));
        System.out.println("目标文件内容为：" + Util.listToString(rltFileList));
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
// 在此完成方法的定义，将list集合中的字符串写入到目标文件中，每个字符串占
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