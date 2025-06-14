import java.awt.*;
import javax.swing.*;

class SwingApplication
{
    public static void main(String[] args) {
        JFrame jf = new JFrame();
        jf.setTitle("Srijan<god");
        jf.getContentPane().setBackground(Color.cyan);
        // ImageIcon ig = new ImageIcon("\"C:\\Users\\srijan\\Pictures\\458490109_2271406999875679_1655997285532115645_n.jpg\"");
        // jf.setIconImage(new ImageIcon("\"C:\\Users\\srijan\\Pictures\\458490109_2271406999875679_1655997285532115645_n.jpg\""));
        jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        jf.setLocationRelativeTo(null);
        jf.setSize(500, 650);

        JButton b1 = new JButton("OK");
        jf.add(b1);

        jf.setResizable(false);
        jf.setVisible(true);
    }
}