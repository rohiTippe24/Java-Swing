//  JColorChooser in java

import javax.swing.*;
import java.awt.event.*;
import java.awt.*;

public class javaColorChooser {
  
  public static void main (String[] args) {
    
    JFrame frame = new JFrame("JColorChooser");
    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    frame.setBounds(400 , 150 , 800 , 500);
    frame.setLayout(null);
    frame.setVisible(true);
    
    Container  c = frame.getContentPane();
    
    JButton btn = new JButton("Choose Colour");
    btn.setBounds(300 , 200 , 200 , 40);
    c.add(btn);
    
    btn.addActionListener(new ActionListener () {
      public void actionPerformed (ActionEvent e) {
        Color color = JColorChooser.showDialog(null , "Select Colour" , Color.BLACK);
        c.setBackground(color);
      }
    });
    
  }
}
