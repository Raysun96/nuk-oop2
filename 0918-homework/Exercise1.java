import java.awt.*;
import javax.swing.*;

public class Exercise1 {
    public static void main(String[] args) {
        int point = 0;
        int countPoint = 0;
        int sumPoint = 0;
        float averagePoint = 0;

        JFrame frm = new JFrame("骰子模擬器");
        frm.setSize(400, 320);
        frm.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frm.setLocationRelativeTo(null);
        frm.setLayout(new BorderLayout());
        

        JLabel showPoint = new JLabel();
        showPoint.setText(""+point);
        showPoint.setHorizontalAlignment(JLabel.CENTER);
        showPoint.setFont(new Font("Noto Sans CJK TC", Font.BOLD, 60));
        frm.add(showPoint,BorderLayout.CENTER);

        JLabel showCountPoint = new JLabel();
        showCountPoint.setText("已擲 "+countPoint+" 次，總和 "+sumPoint+" ，平均 "+averagePoint);
        showCountPoint.setHorizontalAlignment(JLabel.CENTER);
        showCountPoint.setFont(new Font("Noto Sans CJK TC", Font.BOLD, 25));
        frm.add(showCountPoint,BorderLayout.NORTH);

        JButton rollDice = new JButton("擲骰子");
        rollDice.setFont(new Font("Noto Sans CJK TC",Font.BOLD,25));
        frm.add(rollDice,BorderLayout.SOUTH);

    
        frm.setVisible(true);
    }
}
