//  Box Layout in Java

import javax.swing.*;
import java.awt.*;

public class boxLayout {
  
  
  public static void main (String[] args) {
    
   
JFrame frame = new JFrame("BoxLayout");
frame.setBounds(400 , 150 , 800 , 500);
frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
frame.setVisible(true);
 
 Container c = frame.getContentPane();

// BoxLayout bl = new BoxLayout(Container , alignment axis);
 
 BoxLayout bl = new BoxLayout(c , BoxLayout.Y_AXIS);
 c.setLayout(bl);
 
 JButton b1 = new JButton("Button 1");
 JButton b2 = new JButton("Button 2");
 JButton b3 = new JButton("Button 3");
 JButton b4 = new JButton("Button 4");
 JButton b5 = new JButton("Button 5");
 
//  Set component alignment
 
 b2.setAlignmentX(Component.CENTER_ALIGNMENT);
 b3.setAlignmentX(Component.RIGHT_ALIGNMENT);
 b4.setAlignmentX(Component.CENTER_ALIGNMENT);
 
 c.add(b1);
 c.add(b2);
 c.add(b3);
 c.add(b4);
 c.add(b5);
    
  }
  
}
