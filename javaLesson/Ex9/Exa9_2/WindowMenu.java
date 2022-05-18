package javaLesson.Ex9.Exa9_2;

import javax.swing.*;

public class WindowMenu extends JFrame {
    JMenuBar menubar;
    JMenu menuFruit;
    JMenuItem bananaItem, pearItem;
    JMenu appleMenu;
    JMenuItem redAppleItem, yellowAppleItem;

    public WindowMenu() {
    }

    public WindowMenu(String s, int x, int y, int w, int h) {
        init(s);
        setLocation(x, y);
        setSize(w, h);
        setVisible(true);
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
    }

    void init(String s) {
        setTitle(s);
        menubar = new JMenuBar();
        menuFruit = new JMenu("Ë®¹û²Ëµ¥");
        bananaItem = new JMenuItem("Ïã½¶");
        bananaItem.setIcon(new ImageIcon("banana.jpg"));
        pearItem = new JMenuItem("ÌðÀæ");
        pearItem.setIcon(new ImageIcon("pear.jpg"));
        appleMenu = new JMenu("Æ»¹û");
        redAppleItem = new JMenuItem("ºìÆ»¹û");
        redAppleItem.setIcon(new ImageIcon("redApple.jpg"));
        yellowAppleItem = new JMenuItem("»ÆÆ»¹û");
        yellowAppleItem.setIcon(new ImageIcon("yellowApple.jpg"));
        menuFruit.add(bananaItem);
        menuFruit.add(pearItem);
        menuFruit.addSeparator();
        menuFruit.add(appleMenu);
        appleMenu.add(redAppleItem);
        appleMenu.add(yellowAppleItem);
        menuFruit.add(menuFruit);
        setJMenuBar(menubar);
    }
}
