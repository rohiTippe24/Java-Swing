//  JPanel in java swing

import java.awt.*;
import javax.swing.*;

public class javaPanel {
  
  public static void main (String[] args) {
    
    JFrame frame = new JFrame("JPanel");
    frame.setBounds(400 , 150 , 800 , 500);
    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    frame.setVisible(true);
    
    Container c = frame.getContentPane();
    c.setLayout(null);
    
    JPanel panel = new JPanel();
    panel.setBackground(Color.PINK);
    panel.setBounds(0 , 0 , 300 , 150);
    panel.setLayout(null);
    c.add(panel);
    
    JPanel panel2 = new JPanel();
    panel2.setBounds(100 , 100 , 100 , 50);
    panel2.setBackground(Color.YELLOW);
    // c.add(panel2);
    
    JButton btn = new JButton("Button 1");
    btn.setBounds(50 , 50 , 100 , 40);
    panel.add(btn);
    // panel2.add(btn);
    
    panel.add(panel2);
    
  }
  
}
