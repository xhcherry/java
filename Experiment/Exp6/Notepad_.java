package Experiment.Exp6;

import java.awt.*;
import java.awt.event.*;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;

import javax.swing.*;

public class Notepad_ extends JFrame {
    String openFilePath;
    String openFileName;
    String title = "ERROR MESSAGE";
    int type = JOptionPane.ERROR_MESSAGE;

    public Notepad_() {
        super("记事本 ");
        final JTextArea text = new JTextArea();
        text.setToolTipText("请键入内容 ");
        // 界面
        // 退出事件
        this.addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent e) {
                System.exit(0);
            }
        });
        // 简单的布局
        final JPanel panel = new JPanel();
        panel.setLayout(new GridLayout(1, 1));
        panel.add(new JScrollPane(text));
        this.getContentPane().add(panel);
        // 菜单项
        JMenuBar Mbar = new JMenuBar();
        this.setJMenuBar(Mbar);
        JMenu file = new JMenu("文件 ");
        JMenu edit = new JMenu("编辑 ");
        JMenu help = new JMenu("帮助 ");
        Mbar.add(file);
        Mbar.add(edit);
        Mbar.add(help);
        JMenuItem newFile = new JMenuItem("新建");
        newFile.addActionListener(e -> text.setText(" "));
        // 布局结束
        // 新建文件
        newFile.setMnemonic('N');
        newFile.setAccelerator(KeyStroke.getKeyStroke('N', InputEvent.CTRL_DOWN_MASK, true)); // 打开文件
        JMenuItem open = new JMenuItem("打开");
        open.setMnemonic('O');
        open.setAccelerator(KeyStroke.getKeyStroke('O', InputEvent.CTRL_DOWN_MASK, true));
        open.addActionListener(e -> {
            JFileChooser openfile = new JFileChooser();
            openfile.setDialogTitle("打开文件");
            openfile.setApproveButtonText("打开");
            openfile.showOpenDialog(panel);
            File filename = openfile.getSelectedFile();
            StringBuilder strBF = new StringBuilder();
            String error_message = "Error";
            FileInputStream inputfile;
            try {
                char[] buffer = new char[1024];
                inputfile = new FileInputStream(filename);
                int len;
                FileReader in = new FileReader(filename.getAbsoluteFile());
                while ((len = in.read(buffer)) != -1) {
                    strBF.append(buffer, 0, len);
                }
                inputfile.close();
                text.setText(strBF.toString());
                String openfilename = filename.getName();
                setTitle(openfilename);
            } catch (IOException ioEX) {
                JOptionPane.showMessageDialog(panel, error_message, title, type);
            }
        });
        // 保存文件
        JMenuItem save = new JMenuItem("保存");
        save.setMnemonic('S');
        save.setAccelerator(KeyStroke.getKeyStroke('S', InputEvent.CTRL_DOWN_MASK, true));
        save.addActionListener(e -> {
            JFileChooser savefile = new JFileChooser();
            savefile.setApproveButtonText("保存");
            savefile.setDialogTitle("保存文件");
            savefile.showSaveDialog(panel);
            File filesa = savefile.getSelectedFile();
            String file_notfound_message = "找不到文件";
            FileOutputStream outputfile = null;
            // 处理异常开始
            try {
                outputfile = new FileOutputStream(filesa);
            } catch (FileNotFoundException fe) {
                JOptionPane.showMessageDialog(panel, file_notfound_message, title, type);
            }
            String filecontent = text.getText();
            String write_error_message = "写文件错误";
            try {
                outputfile.write(filecontent.getBytes());
            } catch (IOException ioEx) {
                JOptionPane.showMessageDialog(panel, write_error_message, title, type);
            }
            String cmessage = "关闭错误";
            try {
                outputfile.close();
            } catch (IOException ioEx) {
                JOptionPane.showMessageDialog(panel, cmessage, title, type);
            }
        });
        // 退出
        JMenuItem exit = new JMenuItem("退出");
        exit.addActionListener(e -> System.exit(0));
        exit.setMnemonic('Q');
        exit.setAccelerator(KeyStroke.getKeyStroke('Q', InputEvent.CTRL_DOWN_MASK, true)); // 查找
        JMenuItem find = new JMenuItem("查找");
        find.addActionListener(e -> {
            find.requestFocus();
            find();
        });
        find.setMnemonic('F');
        find.setAccelerator(KeyStroke.getKeyStroke('F', InputEvent.CTRL_DOWN_MASK, true)); // 剪切
        JMenuItem cut = new JMenuItem("剪切");
        cut.addActionListener(e -> text.cut());
        cut.setMnemonic('C');
        cut.setAccelerator(KeyStroke.getKeyStroke('C', InputEvent.CTRL_DOWN_MASK, true));
        // 复制
        JMenuItem copy = new JMenuItem("复制");
        copy.addActionListener(e -> text.copy());
        copy.setMnemonic('o');
        copy.setAccelerator(KeyStroke.getKeyStroke('O', InputEvent.CTRL_DOWN_MASK, true));
        // 粘贴
        JMenuItem paste = new JMenuItem("粘贴");
        paste.addActionListener(e -> text.paste());
        paste.setMnemonic('P');
        paste.setAccelerator(KeyStroke.getKeyStroke('P', InputEvent.CTRL_DOWN_MASK, true));
        JMenuItem about = new JMenuItem("关于");
        about.addActionListener(e -> {
            int type = JOptionPane.INFORMATION_MESSAGE;
            String title = "关于";
            String message = "Make by cat lee";
            JOptionPane.showMessageDialog(panel, message, title, type);
        });
        file.add(newFile);
        file.add(open);
        file.add(save);
        file.addSeparator();
        file.add(exit);
        edit.add(cut);
        edit.add(copy);
        edit.add(paste);
        edit.add(find);
        help.add(about);
    }

    public void find() {
        JDialog findDialog = new JDialog(this, "查找", false);
        Container con = findDialog.getContentPane();
        con.setLayout(new FlowLayout(FlowLayout.LEFT));
        JLabel findContentLabel = new JLabel("查找内容(N)：");
        final JTextField findText = new JTextField(15);
        JButton findNextButton = new JButton("查找下一个(F)：");
        final JCheckBox matchCheckBox = new JCheckBox("区分大小写(C)");
        ButtonGroup bGroup = new ButtonGroup();
        final JRadioButton upButton = new JRadioButton("向上(U)");
        final JRadioButton downButton = new JRadioButton("向下(U)");
        downButton.setSelected(true);
        bGroup.add(upButton);
        bGroup.add(downButton);
        JButton cancel = new JButton("取消");
        cancel.addActionListener(e -> findDialog.dispose());
        findNextButton.addActionListener(e -> {
            int k;
            final String str1, str2, str3, str4, strA, strB;
            str1 = findText.getText();
            str2 = findText.getText();
            str3 = str1.toUpperCase();
            str4 = str2.toUpperCase();
            if (matchCheckBox.isSelected()) {
                strA = str1;
                strB = str2;
            } else {
                strA = str3;
                strB = str4;
            }
            if (downButton.isSelected()) {
                if (findText.getSelectedText() == null)
                    k = strA.indexOf(strB, findText.getCaretPosition() + 1);
                else
                    k = strA.indexOf(strB, findText.getCaretPosition() - findText.getText().length() + 1);
                if (k > -1) {
                    findText.setCaretPosition(k);
                    findText.select(k, k + strB.length());
                } else {
                    JOptionPane.showMessageDialog(null, "找不到您查找的内容！", "查找", JOptionPane.INFORMATION_MESSAGE);
                }
            } else if (upButton.isSelected()) {
                if (findText.getSelectedText() == null)
                    k = strA.lastIndexOf(strB, findText.getCaretPosition() - 1);
                else
                    k = strA.lastIndexOf(strB, findText.getCaretPosition() - findText.getText().length() - 1);
                if (k > -1) {
                    findText.setCaretPosition(k);
                    findText.select(k, k + strB.length());
                } else {
                    JOptionPane.showMessageDialog(null, "找不到您查找的内容！", "查找", JOptionPane.INFORMATION_MESSAGE);
                }
            }
        });
        JPanel panel1 = new JPanel();
        JPanel panel2 = new JPanel();
        JPanel panel3 = new JPanel();
        JPanel directionPanel = new JPanel();
        directionPanel.setBorder(BorderFactory.createTitledBorder("方向"));
        directionPanel.add(downButton);
        directionPanel.add(upButton);
        panel1.setLayout(new GridLayout(2, 1));
        panel1.add(findNextButton);
        panel1.add(cancel);
        panel2.add(findContentLabel);
        panel2.add(findText);
        panel2.add(panel1);
        panel3.add(matchCheckBox);
        panel3.add(directionPanel);
        con.add(panel2);
        con.add(panel3);
        findDialog.setSize(410, 180);
        findDialog.setResizable(false);
        findDialog.setLocation(230, 280);
        findDialog.setVisible(true);
    }

    public static void main(String[] args) {
        Notepad_ notepad = new Notepad_();
        notepad.setSize(640, 480);
        notepad.setVisible(true);
        notepad.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}














