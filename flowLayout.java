//  Flow Layout :- it adjust width , height and location of content automatically

import javax.swing.*;
import java.awt.*;

public class flowLayout {
  
  public static void main (String[] args) {
    
    JFrame frame = new JFrame("Flow Layout");
    frame.setBounds(400 , 150 , 800 , 500);
    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    frame.setVisible(true);
    
    JButton btn1  , btn2, btn3 , btn4 , btn5 ;
    
    btn1 = new JButton("Button 1");
    btn2 = new JButton("Button 2");
    btn3 = new JButton("Button 3");
    btn4 = new JButton("Button 4");
    btn5 = new JButton("Button 5");
    
    Container c = frame.getContentPane();
    // FlowLayout fl = new FlowLayout();
    FlowLayout fl = new FlowLayout(FlowLayout.LEFT);
    c.setLayout(fl);
    
    //  set vertical and horizantal gap
    
    fl.setVgap(20);
    fl.setHgap(20);
    
    c.add(btn1);
    c.add(btn2);
    c.add(btn3);
    
    //  2nd argument set index of than content in Container
    
    c.add(btn4 , 0);
    c.add(btn5);
    
  }
}
