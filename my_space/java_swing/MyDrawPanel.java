import javax.swing.*;
import java.awt.*;

class MyDrawPanel extends JPanel {
    public static void main(String[] args) {

        JFrame frame = new JFrame("Draw Panel");
        JButton button= new JButton();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.getContentPane().add(new MyDrawPanel());        
        frame.setSize(300, 600);
        frame.setVisible(true);

    }

    public void paintComponent(Graphics g) {
        super.paintComponent(g);
        g.setColor(Color.orange);
        g.fillRect(20, 30, 100, 200);
    }
}