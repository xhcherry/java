package javaLesson.Ex9.Exa9_4;

import java.awt.*;
import javax.swing.*;

public class ShowLayout extends JFrame {
    PanelGridLayout panelGrid;
    PanelNullLayout panelNull;
    JTabbedPane p;

    ShowLayout() {
        panelGrid = new PanelGridLayout();
        panelNull = new PanelNullLayout();
        p = new JTabbedPane();
        p.add("���񲼾ֵ����", panelGrid);
        p.add("�ղ��ֵ����", panelNull);
        add(p, BorderLayout.CENTER);
        add(new JButton("������BorderLayout����"), BorderLayout.NORTH);
        add(new JButton("��"), BorderLayout.SOUTH);
        add(new JButton("��"), BorderLayout.WEST);
        add(new JButton("��"), BorderLayout.EAST);
        setBounds(10, 10, 570, 390);
        setVisible(true);
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        validate();
    }
}
