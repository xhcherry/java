package javaLesson.Ex9.Exa9_10;

import javax.swing.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

public class MousePolice implements MouseListener {
    WindowMouse view;

    public void setView(WindowMouse view) {
        this.view = view;
    }

    public void mousePressed(MouseEvent e) {
        if (e.getSource() == view.button && e.getButton() == MouseEvent.BUTTON1) {
            view.area.append("�ڰ�ť�ϰ�����������\n");
            view.area.append(e.getX() + "," + e.getY() + "\n");
        } else if (e.getSource() == view && e.getButton() == MouseEvent.BUTTON1) {
            view.area.append("�ڴ����а�����������\n");
            view.area.append(e.getX() + "," + e.getY() + "\n");
        }
    }

    public void mouseReleased(MouseEvent e) {
    }

    public void mouseEntered(MouseEvent e) {
        if (e.getSource() instanceof JButton)
            view.area.append("\n�����밴ť,λ��:" + e.getX() + "," + e.getY() + "\n");
        if (e.getSource() instanceof JFrame)
            view.area.append("\n�����봰��,λ��:" + e.getX() + "," + e.getY() + "\n");
    }

    public void mouseExited(MouseEvent e) {
    }

    public void mouseClicked(MouseEvent e) {
        if (e.getClickCount() >= 2)
            view.area.setText("�������");
    }
}
