package javaLesson.Ex9.Exa9_10;

import javax.swing.*;
import java.awt.*;

public class WindowMouse extends JFrame {
    JButton button;
    JTextArea area;
    MousePolice police;

    WindowMouse() {
        init();
        setVisible(true);
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
    }

    void init() {
        setLayout(new FlowLayout());
        area = new JTextArea(10, 28);
        Font font = new Font("ËÎÌå", Font.PLAIN, 22);
        area.setFont(font);
        police = new MousePolice();
        police.setView(this);
        button = new JButton("°´Å¥");
        button.addMouseListener(police);
        addMouseListener(police);
        add(button);
        add(new JScrollPane(area));
    }
}
