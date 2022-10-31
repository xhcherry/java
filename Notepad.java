import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;
import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.KeyStroke;
public class Notepad extends JFrame {
    String openFilePath;
    String openFileName;
    String title = "ERROR MESSAGE";
    int type = JOptionPane.ERROR_MESSAGE;
    public Notepad() {
        super("记事本 ");
        final JTextArea text = new JTextArea();
        text.setToolTipText("请键入内容 ");
// 界面
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
// 布局结束
// 新建文件
        newFile.setMnemonic('N');
        newFile.setAccelerator(KeyStroke.getKeyStroke('N', java.awt.Event.CTRL_MASK, true)); //

        JMenuItem open = new JMenuItem("打开");
        open.setMnemonic('O');
        open.setAccelerator(KeyStroke.getKeyStroke('O', java.awt.Event.CTRL_MASK, true));
// 保存文件
        JMenuItem save = new JMenuItem("保存");
        save.setMnemonic('S');
        save.setAccelerator(KeyStroke.getKeyStroke('S', java.awt.Event.CTRL_MASK, true));
// 退出
        JMenuItem exit = new JMenuItem("退出");
        exit.setMnemonic('Q');
        exit.setAccelerator(KeyStroke.getKeyStroke('Q', java.awt.Event.CTRL_MASK, true));
// 查

        JMenuItem find = new JMenuItem("查找");
        find.setMnemonic('F');
        find.setAccelerator(KeyStroke.getKeyStroke('F', java.awt.Event.CTRL_MASK, true));
// 剪

        JMenuItem cut = new JMenuItem("剪切");
        cut.setMnemonic('C');
        cut.setAccelerator(KeyStroke.getKeyStroke('C', java.awt.Event.CTRL_MASK, true));
// 复制
        JMenuItem copy = new JMenuItem("复制");
        copy.setMnemonic('o');
        copy.setAccelerator(KeyStroke.getKeyStroke('O', java.awt.Event.CTRL_MASK, true));
// 粘贴
        JMenuItem paste = new JMenuItem("粘贴");
        paste.setMnemonic('P');
        paste.setAccelerator(KeyStroke.getKeyStroke('P', java.awt.Event.CTRL_MASK, true));
        JMenuItem about = new JMenuItem("关于");
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
    public static void main(String[] args) {
        Notepad notepad = new Notepad();
        notepad.setSize(640, 480);
        notepad.setVisible(true);
        notepad.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}