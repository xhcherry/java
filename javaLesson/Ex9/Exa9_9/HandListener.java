package javaLesson.Ex9.Exa9_9;

import java.awt.event.*;

public class HandListener implements ActionListener {
    WindowDocument view;

    public void setView(WindowDocument view) {
        this.view = view;
    }

    public void actionPerformed(ActionEvent e) {
        String str = e.getActionCommand();
        switch (str) {
            case "copy" -> view.showText.copy();
            case "cut" -> view.showText.cut();
            case "paste" -> view.showText.paste();
        }
    }
}
