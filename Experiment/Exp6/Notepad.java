package Experiment.Exp6;

import java.awt.*;
import java.awt.datatransfer.Clipboard;
import java.awt.datatransfer.DataFlavor;
import java.awt.datatransfer.StringSelection;
import java.awt.datatransfer.Transferable;
import java.awt.event.*;
import java.io.*;

import javax.swing.*;

public class Notepad extends JFrame implements ActionListener {
    JMenuBar menuBar;
    JMenu fileMenu, editMenu, helpMenu;

    JMenuItem fileMenu_New, fileMenu_Open, fileMenu_Save, fileMenu_Exit;
    JMenuItem editMenu_Cut, editMenu_Copy, editMenu_Paste, editMenu_Find;
    JMenuItem helpMenu_AboutNotepad;
    JTextArea editArea;
    String oldValue;
    JLabel statusLabel;
    Toolkit toolkit = Toolkit.getDefaultToolkit();
    Clipboard clipBoard = toolkit.getSystemClipboard();
    boolean isNewFile = true;
    File currentFile;

    public Notepad() {
        super("记事本");
        menuBar = new JMenuBar();
        fileMenu = new JMenu("文件");
        fileMenu_New = new JMenuItem("新建");
        fileMenu_New.addActionListener(this);
        fileMenu_New.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_N, InputEvent.CTRL_DOWN_MASK));
        fileMenu_Open = new JMenuItem("打开");
        fileMenu_Open.addActionListener(this);
        fileMenu_Open.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_O, InputEvent.CTRL_DOWN_MASK));
        fileMenu_Save = new JMenuItem("保存");
        fileMenu_Save.addActionListener(this);
        fileMenu_Save.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_S, InputEvent.CTRL_DOWN_MASK));
        fileMenu_Exit = new JMenuItem("退出");
        fileMenu_Exit.addActionListener(this);
        fileMenu_Exit.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_Q, InputEvent.CTRL_DOWN_MASK));
        menuBar.add(fileMenu);
        fileMenu.add(fileMenu_New);
        fileMenu.add(fileMenu_Open);
        fileMenu.add(fileMenu_Save);
        fileMenu.addSeparator();
        fileMenu.add(fileMenu_Exit);
        editMenu = new JMenu("编辑");
        editMenu_Cut = new JMenuItem("剪切");
        editMenu_Cut.addActionListener(this);
        editMenu_Cut.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_X, InputEvent.CTRL_DOWN_MASK));
        editMenu_Copy = new JMenuItem("复制");
        editMenu_Copy.addActionListener(this);
        editMenu_Copy.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_C, InputEvent.CTRL_DOWN_MASK));
        editMenu_Paste = new JMenuItem("粘贴");
        editMenu_Paste.addActionListener(this);
        editMenu_Paste.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_V, InputEvent.CTRL_DOWN_MASK));
        editMenu_Find = new JMenuItem("查找");
        editMenu_Find.addActionListener(this);
        editMenu_Find.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_F, InputEvent.CTRL_DOWN_MASK));
        menuBar.add(editMenu);
        editMenu.add(editMenu_Cut);
        editMenu.add(editMenu_Copy);
        editMenu.add(editMenu_Paste);
        editMenu.add(editMenu_Find);
        helpMenu = new JMenu("帮助");
        helpMenu_AboutNotepad = new JMenuItem("关于");
        helpMenu_AboutNotepad.addActionListener(this);
        helpMenu_AboutNotepad.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_P, InputEvent.CTRL_DOWN_MASK));
        menuBar.add(helpMenu);
        helpMenu.add(helpMenu_AboutNotepad);
        setJMenuBar(menuBar);
        editArea = new JTextArea(20, 50);
        JScrollPane scroller = new JScrollPane(editArea);
        scroller.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_ALWAYS);
        this.add(editArea);
        editArea.setWrapStyleWord(true);
        editArea.setLineWrap(true);
        oldValue = editArea.getText();
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
            str1 = editArea.getText();
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
                if (editArea.getSelectedText() == null)
                    k = strA.indexOf(strB, editArea.getCaretPosition() + 1);
                else
                    k = strA.indexOf(strB, editArea.getCaretPosition() - findText.getText().length() + 1);
                if (k > -1) {
                    editArea.setCaretPosition(k);
                    editArea.select(k, k + strB.length());
                } else {
                    JOptionPane.showMessageDialog(null, "找不到您查找的内容！", "查找", JOptionPane.INFORMATION_MESSAGE);
                }
            } else if (upButton.isSelected()) {
                if (editArea.getSelectedText() == null)
                    k = strA.lastIndexOf(strB, editArea.getCaretPosition() - 1);
                else
                    k = strA.lastIndexOf(strB, editArea.getCaretPosition() - findText.getText().length() - 1);
                if (k > -1) {
                    editArea.setCaretPosition(k);
                    editArea.select(k, k + strB.length());
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

    public void actionPerformed(ActionEvent e) {   //新建
        if (e.getSource() == fileMenu_New) {
            editArea.requestFocus();
            String currentValue = editArea.getText();
            boolean isTextChange = !currentValue.equals(oldValue);
            if (isTextChange) {
                int saveChoose = JOptionPane.showConfirmDialog(this, "您的文件尚未保存，是否保存？", "提示", JOptionPane.YES_NO_CANCEL_OPTION);
                if (saveChoose == JOptionPane.YES_OPTION) {
                    JFileChooser fileChooser = new JFileChooser();
                    fileChooser.setFileSelectionMode(JFileChooser.FILES_ONLY);
                    fileChooser.setDialogTitle("另存为");
                } else if (saveChoose == JOptionPane.NO_OPTION) {
                    editArea.replaceRange("", 0, editArea.getText().length());

                    this.setTitle("记事本");
                    isNewFile = true;

                    oldValue = editArea.getText();
                }
            } else {
                editArea.replaceRange("", 0, editArea.getText().length());

                this.setTitle("记事本");
                isNewFile = true;
                oldValue = editArea.getText();
            }
        } else if (e.getSource() == fileMenu_Exit) {//退出
            int exitChoose = JOptionPane.showConfirmDialog(this, "确定要退出吗?", "退出提示", JOptionPane.OK_CANCEL_OPTION);
            if (exitChoose == JOptionPane.OK_OPTION) {
                System.exit(0);
            }
        } else if (e.getSource() == helpMenu_AboutNotepad) {//关于
            editArea.requestFocus();
            JOptionPane.showMessageDialog(this,
                    "这是关于记事本的内容：这是一个记事本",
                    "记事本", JOptionPane.INFORMATION_MESSAGE);
        } else if (e.getSource() == editMenu_Cut) {//剪切
            editArea.requestFocus();
            String text = editArea.getSelectedText();
            StringSelection selection = new StringSelection(text);
            clipBoard.setContents(selection, null);
            editArea.replaceRange("", editArea.getSelectionStart(), editArea.getSelectionEnd());
        } else if (e.getSource() == editMenu_Copy) {//复制
            editArea.requestFocus();
            String text = editArea.getSelectedText();
            StringSelection selection = new StringSelection(text);
            clipBoard.setContents(selection, null);
        } else if (e.getSource() == editMenu_Find) {//查找
            editArea.requestFocus();
            find();
        } else if (e.getSource() == editMenu_Paste) {//粘贴
            editArea.requestFocus();
            Transferable contents = clipBoard.getContents(this);
            if (contents == null) return;
            String text = "";
            try {
                text = (String) contents.getTransferData(DataFlavor.stringFlavor);
            } catch (Exception exception) {
            }
            editArea.replaceRange(text, editArea.getSelectionStart(), editArea.getSelectionEnd());
        } else if (e.getSource() == fileMenu_Save) {//保存
            editArea.requestFocus();
            if (isNewFile) {
                JFileChooser fileChooser = new JFileChooser();
                fileChooser.setFileSelectionMode(JFileChooser.FILES_ONLY);
                fileChooser.setDialogTitle("保存");
                int result = fileChooser.showSaveDialog(this);
                if (result == JFileChooser.CANCEL_OPTION) {
                    statusLabel.setText("您没有选择任何文件");
                    return;
                }
                File saveFileName = fileChooser.getSelectedFile();
                if (saveFileName == null || saveFileName.getName().equals("")) {
                    JOptionPane.showMessageDialog(this, "不合法的文件名", "不合法的文件名", JOptionPane.ERROR_MESSAGE);
                } else {
                    try {
                        FileWriter fw = new FileWriter(saveFileName);
                        BufferedWriter bfw = new BufferedWriter(fw);
                        bfw.write(editArea.getText(), 0, editArea.getText().length());
                        bfw.flush();
                        bfw.close();
                        isNewFile = false;
                        currentFile = saveFileName;
                        oldValue = editArea.getText();
                        this.setTitle(saveFileName.getName() + " - 记事本");
                        statusLabel.setText("当前打开文件：" + saveFileName.getAbsoluteFile());
                    } catch (IOException ioException) {
                    }
                }
            } else {
                try {
                    FileWriter fw = new FileWriter(currentFile);
                    BufferedWriter bfw = new BufferedWriter(fw);
                    bfw.write(editArea.getText(), 0, editArea.getText().length());
                    bfw.flush();
                    fw.close();
                } catch (IOException ioException) {
                }
            }

        } else if (e.getSource() == fileMenu_Open) {//打开
            editArea.requestFocus();
            String currentValue = editArea.getText();
            boolean isTextChange = !currentValue.equals(oldValue);
            if (isTextChange) {
                int saveChoose = JOptionPane.showConfirmDialog(this, "您的文件尚未保存，是否保存？", "提示", JOptionPane.YES_NO_CANCEL_OPTION);
                if (saveChoose == JOptionPane.YES_OPTION) {
                    JFileChooser fileChooser = new JFileChooser();
                    fileChooser.setFileSelectionMode(JFileChooser.FILES_ONLY);
                    fileChooser.setDialogTitle("另存为");
                    int result = fileChooser.showSaveDialog(this);
                    if (result == JFileChooser.CANCEL_OPTION) {
                        statusLabel.setText("您没有选择任何文件");
                        return;
                    }
                    File saveFileName = fileChooser.getSelectedFile();
                    if (saveFileName == null || saveFileName.getName().equals("")) {
                        JOptionPane.showMessageDialog(this, "不合法的文件名", "不合法的文件名", JOptionPane.ERROR_MESSAGE);
                    } else {
                        try {
                            FileWriter fw = new FileWriter(saveFileName);
                            BufferedWriter bfw = new BufferedWriter(fw);
                            bfw.write(editArea.getText(), 0, editArea.getText().length());
                            bfw.flush();
                            bfw.close();
                            isNewFile = false;
                            currentFile = saveFileName;
                            oldValue = editArea.getText();
                            this.setTitle(saveFileName.getName() + " - 记事本");
                            statusLabel.setText("当前打开文件：" + saveFileName.getAbsoluteFile());
                        } catch (IOException ignored) {
                        }
                    }
                } else if (saveChoose == JOptionPane.NO_OPTION) {
                    String str;
                    JFileChooser fileChooser = new JFileChooser();
                    fileChooser.setFileSelectionMode(JFileChooser.FILES_ONLY);
                    fileChooser.setDialogTitle("打开文件");
                    int result = fileChooser.showOpenDialog(this);
                    if (result == JFileChooser.CANCEL_OPTION) {
                        statusLabel.setText("您没有选择任何文件");
                        return;
                    }
                    File fileName = fileChooser.getSelectedFile();
                    if (fileName == null || fileName.getName().equals("")) {
                        JOptionPane.showMessageDialog(this, "不合法的文件名", "不合法的文件名", JOptionPane.ERROR_MESSAGE);
                    } else {
                        try {
                            FileReader fr = new FileReader(fileName);
                            BufferedReader bfr = new BufferedReader(fr);
                            editArea.setText("");
                            while ((str = bfr.readLine()) != null) {
                                editArea.append(str);
                            }
                            this.setTitle(fileName.getName() + " - 记事本");
                            statusLabel.setText(" 当前打开文件：" + fileName.getAbsoluteFile());
                            fr.close();
                            isNewFile = false;
                            currentFile = fileName;
                            oldValue = editArea.getText();
                        } catch (IOException ignored) {
                        }
                    }
                }
            } else {
                String str;
                JFileChooser fileChooser = new JFileChooser();
                fileChooser.setFileSelectionMode(JFileChooser.FILES_ONLY);
                fileChooser.setDialogTitle("打开文件");
                int result = fileChooser.showOpenDialog(this);
                if (result == JFileChooser.CANCEL_OPTION) {
                    statusLabel.setText(" 您没有选择任何文件 ");
                    return;
                }
                File fileName = fileChooser.getSelectedFile();
                if (fileName == null || fileName.getName().equals("")) {
                    JOptionPane.showMessageDialog(this, "不合法的文件名", "不合法的文件名", JOptionPane.ERROR_MESSAGE);
                } else {
                    try {
                        FileReader fr = new FileReader(fileName);
                        BufferedReader bfr = new BufferedReader(fr);
                        editArea.setText("");
                        while ((str = bfr.readLine()) != null) {
                            editArea.append(str);
                        }
                        this.setTitle(fileName.getName() + " - 记事本");
                        statusLabel.setText(" 当前打开文件：" + fileName.getAbsoluteFile());
                        fr.close();
                        isNewFile = false;
                        currentFile = fileName;
                        oldValue = editArea.getText();
                    } catch (IOException ignored) {
                    }
                }
            }
        }
    }

    public static void main(String[] args) {
        Notepad notepad = new Notepad();
        notepad.setSize(640, 480);
        notepad.setVisible(true);
        notepad.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
