package javaLesson.Ex9.Exa9_9;

import javax.swing.event.DocumentEvent;
import javax.swing.event.DocumentListener;
import java.util.Arrays;

public class TextListener implements DocumentListener {
    WindowDocument view;

    public void setView(WindowDocument view) {
        this.view = view;
    }

    public void changedUpdate(DocumentEvent e) {
        String str = view.inputText.getText();
        String regex = "[\\s\\d\\p{Punct}]+";
        String[] words = str.split(regex);
        Arrays.sort(words);
        view.showText.setText(null);
        for (String word : words) view.showText.append(word + ",");
    }

    public void removeUpdate(DocumentEvent e) {
        changedUpdate(e);
    }

    public void insertUpdate(DocumentEvent e) {
        changedUpdate(e);
    }
}

