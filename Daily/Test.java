package Daily;

import java.awt.*;
import javax.swing.*;

public class Test extends JFrame {
    JPanel jp1, jp2, jp3, jp4;
    JLabel jlb1, jlb2, label;
    JButton jb1, jb2;
    JTextField jtf;
    JPasswordField jpf;

    public static void main(String[] args) {
        new Test();
    }

    public Test() {
        jp1 = new JPanel();
        jp2 = new JPanel();
        jp3 = new JPanel();
        jp4 = new JPanel();
        label = new JLabel("欢迎登录本系统");
        jlb1 = new JLabel("用户名");
        jlb2 = new JLabel("密码");
        jb1 = new JButton("登录");
        jb2 = new JButton("退出");
        jtf = new JTextField(10);
        jpf = new JPasswordField(10);
        this.setLayout(new GridLayout(8, 0));
        jp4.add(label);
        jp4.add(jtf);
        jp1.add(jlb1);
        jp1.add(jtf);
        jp2.add(jlb2);
        jp2.add(jpf);
        jp3.add(jb1);
        jp3.add(jb2);
        this.add(jp4);
        this.add(jp1);
        this.add(jp2);
        this.add(jp3);
        this.setTitle("系统登录界面");
        this.setSize(500, 500);
        this.setLocationRelativeTo(null);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setVisible(true);
    }
}