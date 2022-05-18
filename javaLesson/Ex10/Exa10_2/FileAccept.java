package javaLesson.Ex10.Exa10_2;

import java.io.File;
import java.io.FilenameFilter;

public class FileAccept implements FilenameFilter {
    private String extendName;

    public void setExtendName(String s) {
        extendName = "." + s;
    }

    @Override
    public boolean accept(File dir, String name) {
        return name.endsWith(extendName);
    }
}
