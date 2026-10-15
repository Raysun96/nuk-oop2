import javax.swing.*;
import java.awt.*;

public class GoodLogin extends JFrame {
    public GoodLogin() {
        setTitle("登入");
        setSize(300, 150);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new BorderLayout());

        JLabel l1 = new JLabel("帳號:");
        JTextField t1 = new JTextField();
        JLabel l2 = new JLabel("密碼:");
        JPasswordField t2 = new JPasswordField();
        JButton btn = new JButton("登入");

        // 中間：帳號、密碼
        JPanel center = new JPanel(new GridLayout(2, 2));
        center.add(l1); center.add(t1);
        center.add(l2); center.add(t2);

        add(center, BorderLayout.CENTER);
        add(btn, BorderLayout.SOUTH);

        btn.addActionListener(e -> {
            String user = t1.getText();
            String pass = new String(t2.getPassword());
            if (user.equals("admin") && pass.equals("1234")) {
                System.out.println("登入成功");
            } else {
                System.out.println("帳號或密碼錯誤");
            }
        });

        setVisible(true);
    }

    public static void main(String[] a) {
        new GoodLogin();
    }
}