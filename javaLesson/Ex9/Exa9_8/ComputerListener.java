package javaLesson.Ex9.Exa9_8;

import java.awt.event.*;

public class ComputerListener implements ActionListener {
    NumberView view;
    String symbol;

    public void setView(NumberView view) {
        this.view = view;
    }

    public void setSymbol(String s) {
        symbol = s;
    }

    public void actionPerformed(ActionEvent e) {
        try {
            double number1 = Double.parseDouble(view.inputNumberOne.getText());
            double number2 = Double.parseDouble(view.inputNumberTwo.getText());
            double result = 0;
            boolean isShow = true;
            switch (symbol) {
                case "+" -> result = number1 + number2;
                case "-" -> result = number1 - number2;
                case "*" -> result = number1 * number2;
                case "/" -> result = number1 / number2;
                default -> isShow = false;
            }
            if (isShow)
                view.textShow.append(number1 + " " + symbol + " " + number2 + "=" + result + "\n");
        } catch (Exception exp) {
            view.textShow.append("\n«Î ‰»Î◊÷∑˚\n");
        }
    }
}
