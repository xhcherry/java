package javaLesson.Ex9.Exa9_8;

import java.awt.event.*;

public class OperatorListener implements ItemListener, ActionListener {
    NumberView view;

    public void setView(NumberView view) {
        this.view = view;
    }

    public void itemStateChanged(ItemEvent e) {
        String symbol = view.choiceSymbol.getSelectedItem().toString();
        view.computer.setSymbol((symbol));
    }

    public void actionPerformed(ActionEvent e) {
        String symbol = view.choiceSymbol.getSelectedItem().toString();
        view.computer.setSymbol(symbol);
    }
}
