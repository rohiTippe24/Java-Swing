// Null Layout :- if we set layout of container is null the we need to asingn location  to all items in container
//  if we resize the screen the location of content does not change

import javax.swing.*;
import java.awt.*;

public class nullLayout {
  
  public static void main (String[] args) {
    
    JFrame frame = new JFrame("Null Layout");
    frame.setBounds(400 , 150 , 800 , 500);
    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    frame.setVisible(true);
    
    JButton btn1  , btn2, btn3 , btn4 , btn5 ;
    
    btn1 = new JButton("Button 1");
    btn2 = new JButton("Button 2");
    btn3 = new JButton("Button 3");
    btn4 = new JButton("Button 4");
    btn5 = new JButton("Button 5");
    
    btn1.setBounds(80 , 80 , 100 , 40);
    btn2.setBounds(180 , 80 , 100 , 40);
    btn3.setBounds(280 , 80 , 100 , 40);
    btn4.setBounds(380 , 80 , 100 , 40);
    btn5.setBounds(480 , 80 , 100 , 40);
    
    Container c = frame.getContentPane();
    c.setLayout(null);
    
    c.add(btn1);
    c.add(btn2);
    c.add(btn3);
    c.add(btn4);
    c.add(btn5);
    
  }
}
