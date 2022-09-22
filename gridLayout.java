//  Grid Layout :- all content is of same size

import javax.swing.*;
import java.awt.*;

public class gridLayout {
  
  public static void main (String[] args) {
    
    JFrame frame = new JFrame("Grid Layout");
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
    
    //  GridLayout gl = new GridLayout(rows , columns);
    
    GridLayout gl = new GridLayout(2 , 2);
    c.setLayout(gl);
    
    //  set vertical and horizantal gap
    
    gl.setVgap(20);
    gl.setHgap(20);
    
    c.add(btn1);
    c.add(btn2);
    c.add(btn3);
    
    //  2nd argument set index of than content in Container
    
    c.add(btn4 , 0);
    c.add(btn5);
    
  }
}
