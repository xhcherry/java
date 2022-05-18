package javaLesson.Ex9.Exa9_11;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class LP extends JLayeredPane implements MouseListener, MouseMotionListener {
    JButton buttonTom, buttonJerry;
    int x, y, a, b, x0, y0;

    LP() {
        buttonTom = new JButton("用鼠标拖动Tom");
        buttonTom.addMouseListener(this);
        buttonTom.addMouseMotionListener(this);
        buttonJerry = new JButton("用鼠标拖动Jerry");
        buttonJerry.addMouseListener(this);
        buttonJerry.addMouseMotionListener(this);
        setLayout(new FlowLayout());
        add(buttonTom, JLayeredPane.DEFAULT_LAYER);
        add(buttonJerry, JLayeredPane.DEFAULT_LAYER);
    }

    public void mousePressed(MouseEvent e) {
        JComponent com;
        com = (JComponent) e.getSource();
        setLayer(com, JLayeredPane.DEFAULT_LAYER);
        a = com.getBounds().x;
        b = com.getBounds().y;
        x = e.getX();
        y = e.getY();
    }

    @Override
    public void mouseReleased(MouseEvent e) {
        JComponent com;
        com = (JComponent) e.getSource();
        setLayer(com, JLayeredPane.DEFAULT_LAYER);
    }

    @Override
    public void mouseEntered(MouseEvent e) {
    }

    @Override
    public void mouseExited(MouseEvent e) {
    }

    @Override
    public void mouseClicked(MouseEvent e) {
    }

    @Override
    public void mouseMoved(MouseEvent e) {
    }

    @Override
    public void mouseDragged(MouseEvent e) {
        Component com;
        if (e.getSource() instanceof Component) {
            com = (Component) e.getSource();
            a = com.getBounds().x;
            b = com.getBounds().y;
            x = e.getX();
            y = e.getY();
            a += x;
            b += y;
            com.setLocation(a - x0, b - y0);
        }
    }
}
