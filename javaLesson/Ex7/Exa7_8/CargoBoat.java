package javaLesson.Ex7.Exa7_8;

public class CargoBoat {
    int realContent;
    int maxContent;

    public void setMaxContent(int c) {
        maxContent = c;
    }

    public void loading(int m) throws DangerException {
        realContent += m;
        if (realContent > maxContent)
            throw new DangerException();
    }
}
