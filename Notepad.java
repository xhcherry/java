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
        super("���±� ");
        final JTextArea text = new JTextArea();
        text.setToolTipText("��������� ");
// ����
// �򵥵Ĳ���
        final JPanel panel = new JPanel();
        panel.setLayout(new GridLayout(1, 1));
        panel.add(new JScrollPane(text));
        this.getContentPane().add(panel);
// �˵���
        JMenuBar Mbar = new JMenuBar();
        this.setJMenuBar(Mbar);
        JMenu file = new JMenu("�ļ� ");

        JMenu edit = new JMenu("�༭ ");
        JMenu help = new JMenu("���� ");
        Mbar.add(file);
        Mbar.add(edit);
        Mbar.add(help);
        JMenuItem newFile = new JMenuItem("�½�");
// ���ֽ���
// �½��ļ�
        newFile.setMnemonic('N');
        newFile.setAccelerator(KeyStroke.getKeyStroke('N', java.awt.Event.CTRL_MASK, true)); //

        JMenuItem open = new JMenuItem("��");
        open.setMnemonic('O');
        open.setAccelerator(KeyStroke.getKeyStroke('O', java.awt.Event.CTRL_MASK, true));
// �����ļ�
        JMenuItem save = new JMenuItem("����");
        save.setMnemonic('S');
        save.setAccelerator(KeyStroke.getKeyStroke('S', java.awt.Event.CTRL_MASK, true));
// �˳�
        JMenuItem exit = new JMenuItem("�˳�");
        exit.setMnemonic('Q');
        exit.setAccelerator(KeyStroke.getKeyStroke('Q', java.awt.Event.CTRL_MASK, true));
// ��

        JMenuItem find = new JMenuItem("����");
        find.setMnemonic('F');
        find.setAccelerator(KeyStroke.getKeyStroke('F', java.awt.Event.CTRL_MASK, true));
// ��

        JMenuItem cut = new JMenuItem("����");
        cut.setMnemonic('C');
        cut.setAccelerator(KeyStroke.getKeyStroke('C', java.awt.Event.CTRL_MASK, true));
// ����
        JMenuItem copy = new JMenuItem("����");
        copy.setMnemonic('o');
        copy.setAccelerator(KeyStroke.getKeyStroke('O', java.awt.Event.CTRL_MASK, true));
// ճ��
        JMenuItem paste = new JMenuItem("ճ��");
        paste.setMnemonic('P');
        paste.setAccelerator(KeyStroke.getKeyStroke('P', java.awt.Event.CTRL_MASK, true));
        JMenuItem about = new JMenuItem("����");
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