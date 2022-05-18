package Experiment.Exp7;

public class TestFile {
    public static final String SRC_FILE = TestFile.class.getClassLoader().getResource("").getFile() + "Experiment\\Exp7\\source1.data"; // 源数据文件名
    public static final String RLT_FILE = TestFile.class.getClassLoader().getResource("").getFile() + "Experiment\\Exp7\\result.data"; // 最终结果存放文件名

    public static void main(String[] args) {
        AnalysisResult ar = new AnalysisResult();
        ar.analysisFile(SRC_FILE, RLT_FILE);
    }
}
