package javaLesson.Ex9.Exa9_5;

import javax.swing.*;

public class WindowBoxLayout extends JFrame {
    Box boxH;
    Box boxVOne, boxVTwo;

    public WindowBoxLayout() {
        setLayout(new java.awt.FlowLayout());
        init();
        setVisible(true);
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
    }

    void init() {
        boxH = Box.createHorizontalBox();
        boxVOne = Box.createVerticalBox();
        boxVTwo = Box.createVerticalBox();
        boxVOne.add(new JLabel("ÐÕÃû "));
        boxVOne.add(new JLabel("Ö°Òµ "));
        boxVTwo.add(new JTextField(10));
        boxVTwo.add(new JTextField(10));
        boxH.add(boxVOne);
        boxH.add(Box.createHorizontalStrut(10));
        boxH.add(boxVTwo);
        add(boxH);
    }
}
