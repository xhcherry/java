package javaLesson.Ex9.Exa9_7;

import java.awt.*;
import javax.swing.*;

public class WindowView extends JFrame {
    public JTextField inputText;
    public JTextArea textShow;
    public JButton button;
    PoliceListener listener;

    public WindowView() {
        init();
        setVisible(true);
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
    }

    void init() {
        setLayout(new FlowLayout());
        Font font = new Font("宋体", Font.PLAIN, 20);
        inputText = new JTextField(20);
        inputText.setFont(font);
        button = new JButton("确定");
        button.setFont(font);
        font = new Font("宋体", Font.BOLD, 22);
        textShow = new JTextArea(9, 30);
        textShow.setFont(font);
        listener = new PoliceListener();
        listener.setView(this);
        inputText.addActionListener(listener);
        button.addActionListener(listener);
        add(inputText);
        add(button);
        add(new JScrollPane(textShow));
    }
}
