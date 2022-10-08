//  JGlassPane in java

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class javaGlassPane {
  
  public static void main (String[] args) {
    
    JFrame frame = new JFrame("JGlassPane");
    frame.setSize(800 , 500);
    frame.setLocationRelativeTo(null);
    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    frame.setVisible(true);
    
    JButton btn = new JButton("Show");
    frame.add(BorderLayout.NORTH , btn);
    
    frame.setGlassPane(new JComponent() {
      public void paintComponent (Graphics g) {
        g.setColor(new Color (0 , 0 , 0 , 150));
        g.fillRect(0 , 0 , getWidth() , getHeight());
      }
    });
    
     Container c = (Container) frame.getGlassPane();
    c.setLayout(null);
    
    JButton btn2 = new JButton("Hide");
    btn2.setBounds(100 , 50 , 150 , 40);
    
    c.add(btn2);
    
    btn.addActionListener(new ActionListener () {
      public void actionPerformed (ActionEvent e) {
        c.setVisible(true);
      }
    });
    
    btn2.addActionListener(new ActionListener () {
      public void actionPerformed (ActionEvent e) {
        c.setVisible(false);
      }
    });
    
    c.addMouseListener(new MouseAdapter() {});
    
    frame.validate();
  }
}
