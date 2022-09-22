//  CardLayout  :- only one content display on the screen

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

class myFrame extends JFrame implements ActionListener {
  Container c;
  JButton b1 , b2 , b3 , b4 , b5 ;
  CardLayout cl ;
  myFrame () {
    c = this.getContentPane();
    
    cl  = new CardLayout();
    c.setLayout(cl);
    
    b1 = new JButton("Page 1");
    b2 = new JButton("Page 2");
    b3 = new JButton("Page 3");
    b4 = new JButton("Page 4");
    b5 = new JButton("Page 5");
    
    b1.addActionListener(this);
    b2.addActionListener(this);
    b3.addActionListener(this);
    b4.addActionListener(this);
    b5.addActionListener(this);
  
    c.add(b1 , "1");
    c.add(b2 , "2");
    c.add(b3 , "3");
    c.add(b4 , "4");
    c.add(b5 , "5");
    
      }
  public void actionPerformed (ActionEvent e) {
    
    //  Card Layout Methods 
    
      cl.next(c);
      // cl.previous(c);
      // cl.first(c);
      // cl.last(c);
      // cl.show(c , "1");
      
      
    } 
    

  
}


public class cardLayout {
  
  public static void main (String[] args) {
    
    myFrame frame = new myFrame();
    frame.setBounds(400 , 150 , 800 , 500);
    frame.setTitle("CardLayout");
    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    frame.setVisible(true);
   
  }
  
}
