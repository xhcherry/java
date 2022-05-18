package javaLesson.Ex9.Exa9_8;

import javax.swing.*;
import java.awt.*;

public class NumberView extends JFrame {
    public JTextField inputNumberOne, inputNumberTwo;
    public JComboBox<String> choiceSymbol;
    public JTextArea textShow;
    public JButton button;
    public OperatorListener operator;
    public ComputerListener computer;

    public NumberView() {
        init();
        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    void init() {
        setLayout(new FlowLayout());
        Font font = new Font("宋体", Font.BOLD, 22);
        inputNumberOne = new JTextField(5);
        inputNumberTwo = new JTextField(5);
        inputNumberOne.setFont(font);
        inputNumberTwo.setFont(font);
        choiceSymbol = new JComboBox<>();
        choiceSymbol.setFont(font);
        button = new JButton("计算");
        button.setFont(font);
        choiceSymbol.addItem("选择运算符号：");
        String[] a = {"+", "-", "*", "/"};
        for (String s : a) {
            choiceSymbol.addItem(s);
        }
        choiceSymbol.setSelectedIndex(-1);
        textShow = new JTextArea(9, 30);
        textShow.setFont(font);
        operator = new OperatorListener();
        computer = new ComputerListener();
        operator.setView(this);
        computer.setView(this);
        choiceSymbol.addItemListener(operator);
        choiceSymbol.addActionListener(operator);
        button.addActionListener(computer);
        add(inputNumberOne);
        add(choiceSymbol);
        add(inputNumberTwo);
        add(button);
        add(new JScrollPane(textShow));
    }
}
