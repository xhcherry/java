package Daily;

import java.awt.*;
import javax.swing.*;
class ActionHandle {
    JFrame frame = new JFrame("¼àÌý");
    JButton but = new JButton("ÏÔÊ¾");
    JLabel lab = new JLabel();
    JPanel pan = new JPanel();

    public ActionHandle() {
        but.addActionListener(e -> {
            if (e.getSource() == but) {
                lab.setText("123");
            }
        });
        frame.setLayout(new GridLayout(2, 1));
        pan.add(but);
        frame.add(pan);
        frame.add(lab);
        frame.setSize(400, 200);
        frame.getContentPane().setBackground(Color.white);
        frame.setVisible(true);
    }
}
public class Button1 {
    public static void main(String[] args) {
        new ActionHandle();
    }
}