package javaLesson.Ex9.Exa9_6;

import Demo.Action;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ReaderListener implements ActionListener {
    public void actionPerformed(ActionEvent e) {
        String str = e.getActionCommand();
        System.out.println(str + ":" + str.length());
    }
}
