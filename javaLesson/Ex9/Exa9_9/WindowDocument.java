package javaLesson.Ex9.Exa9_9;

import javax.swing.*;
import javax.swing.text.Document;
import java.awt.*;

public class WindowDocument extends JFrame {
    JTextArea inputText, showText;
    JMenuBar menubar;
    JMenu menu;
    JMenuItem itemCopy, itemCut, itemPaste;
    TextListener textChangeListener;
    HandListener handleListener;

    WindowDocument() {
        init();
        setLayout(new FlowLayout());
        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    void init() {
        inputText = new JTextArea(10, 28);
        showText = new JTextArea(10, 28);
        showText.setLineWrap(true);
        showText.setWrapStyleWord(true);
        Font font = new Font("����", Font.PLAIN, 25);
        inputText.setFont(font);
        showText.setFont(font);
        menubar = new JMenuBar();
        menu = new JMenu("�༭");
        itemCopy = new JMenuItem("����(c)");
        itemCut = new JMenuItem("����(t)");
        itemPaste = new JMenuItem("ճ��(p)");
        itemCopy.setAccelerator(KeyStroke.getKeyStroke('c'));
        itemCut.setAccelerator(KeyStroke.getKeyStroke('t'));
        itemPaste.setAccelerator(KeyStroke.getKeyStroke('p'));
        itemCopy.setActionCommand("copy");
        itemCut.setActionCommand("cut");
        itemPaste.setActionCommand("paste");
        menu.add(itemCopy);
        menu.add(itemCut);
        menu.add(itemPaste);
        menubar.add(menu);
        setJMenuBar(menubar);
        add(new JScrollPane(inputText));
        add(new JScrollPane(showText));
        textChangeListener = new TextListener();
        handleListener = new HandListener();
        textChangeListener.setView(this);
        handleListener.setView(this);
        Document document = inputText.getDocument();
        document.addDocumentListener(textChangeListener);
        itemCopy.addActionListener(handleListener);
        itemCut.addActionListener(handleListener);
        itemPaste.addActionListener(handleListener);
    }
}

