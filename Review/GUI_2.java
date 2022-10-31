package Review;

import java.awt.*;
import javax.swing.*;

public class GUI_2 {
    public static void main(String[] args) {
        JFrame win = new JFrame("GridLayout—› æ");
        JMenuBar menuBar;
        JMenu menuFile;
        win.setSize(500, 400);
        win.setLayout(new GridLayout(4, 5));
        win.setLocationRelativeTo(null);
        win.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        for (int i = 0; i < 20; i++) {
            win.add(new JButton("" + (i + 1)));
        }
        menuBar = new JMenuBar();
        win.setJMenuBar(menuBar);
        menuFile = new JMenu("Œƒº˛");
        menuBar.add(menuFile);
        menuBar.add(new JMenu("±‡º≠"));
        win.setVisible(true);
    }
}
