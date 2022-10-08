//  JComponent in java

import javax.swing.*;
import java.awt.*;

public class javaComponent {
  
  public static void main (String[] args) {
    
    JFrame frame = new JFrame("JComponent");
    frame.setBounds(400 , 150 , 800 , 500);
    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    frame.setVisible(true);
    
    frame.add(new JComponent () {
      public void paintComponent (Graphics g) {
        g.setColor(Color.GREEN);
        g.fillRect(100 , 100 , 300 , 300);
      }
    });
    
    frame.validate();
  }
}
