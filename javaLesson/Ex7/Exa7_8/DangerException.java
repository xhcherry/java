package javaLesson.Ex7.Exa7_8;

public class DangerException extends Exception {
    final String message = "����";

    public String warnMess() {
        return message;
    }
}
