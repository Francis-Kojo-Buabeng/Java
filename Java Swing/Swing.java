import java.awt.Color;
import javax.swing.*;

public class Swing {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Mr Fragrance");
        frame.setSize(400, 300);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setResizable(false);

        
        JButton btn = new JButton("User Name");
        btn.setSize(15, 10);
        frame.add(btn);
        frame.setBackground(Color.red);

        frame.setVisible(true);

        frame.repaint();
        frame.revalidate();
    }
}
