import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.util.Random;

public class Exercise1 extends JFrame implements ActionListener{

    static int point = 0;
    static int countPoint = 0;
    static int sumPoint = 0;
    static float averagePoint = 0;
    static Random rand = new Random();
    static Exercise1 frm = new Exercise1();

    static JLabel showPoint = new JLabel();
    static JLabel showCountPoint = new JLabel();
    static JButton rollDice = new JButton("擲骰子");
    public static void main(String[] args) {

        frm.setTitle("骰子模擬器");
        frm.setSize(400, 320);
        frm.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frm.setLocationRelativeTo(null);
        frm.setLayout(new BorderLayout());
        

        //JLabel showPoint = new JLabel();
        showPoint.setText(""+point);
        showPoint.setHorizontalAlignment(JLabel.CENTER);
        showPoint.setFont(new Font("Noto Sans CJK TC", Font.BOLD, 60));
        frm.add(showPoint,BorderLayout.CENTER);

        //JLabel showCountPoint = new JLabel();
        showCountPoint.setText("已擲 "+countPoint+" 次，總和 "+sumPoint+" ，平均 "+ String.format("%.2f", averagePoint));
        showCountPoint.setHorizontalAlignment(JLabel.CENTER);
        showCountPoint.setFont(new Font("Noto Sans CJK TC", Font.BOLD, 25));
        frm.add(showCountPoint,BorderLayout.NORTH);

        //JButton rollDice = new JButton("擲骰子");
        rollDice.setFont(new Font("Noto Sans CJK TC",Font.BOLD,25));
        rollDice.addActionListener(frm);
        frm.add(rollDice,BorderLayout.SOUTH);

    
        frm.setVisible(true);
    }
    public void actionPerformed(ActionEvent e) {
        point = rand.nextInt(1,7);
        countPoint += 1;
        sumPoint += point;
        averagePoint = (float)sumPoint / countPoint;

        showPoint.setText(""+point);
        showCountPoint.setText("已擲 "+countPoint+" 次，總和 "+sumPoint+" ，平均 "+ String.format("%.2f", averagePoint));
        if (point == 6) {
            showPoint.setForeground(Color.GREEN);
        } else if (point == 1) {
            showPoint.setForeground(Color.RED);
        } else {
            showPoint.setForeground(Color.BLACK);
        }
    }
}
