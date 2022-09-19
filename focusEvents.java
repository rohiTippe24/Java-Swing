//  Java FocusListener

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

class myFrame extends JFrame implements FocusListener {
  
  JTextField l1 , l2 ;
  Container c ;
  
  myFrame () {
    
    Font f = new Font("Arial" , Font.BOLD , 20);
    
    c = this.getContentPane();
    c.setLayout(null);
    
    l1 = new JTextField("...Focus Here Change Colour...");
    l1.setBounds(100 , 100 , 400 , 40);
    l1.setFont(f);
    l1.setForeground(Color.RED);
    l1.addFocusListener(this);
    c.add(l1);
    
    l2 = new JTextField("if you click here focus will lost from frist text field");
    l2.setBounds(100 , 150 , 400 , 40);
    c.add(l2);
    
  }
  
  public void focusGained (FocusEvent e) {
    l1.setForeground(Color.BLUE);
  }
  
  public void focusLost (FocusEvent e) {
    l1.setForeground(Color.RED);
  }
  
}


public class focusEvents {
  
  public static void main (String[] args) {
    
    myFrame frame = new myFrame();
    frame.setBounds(400 , 150 , 800 , 500);
    frame.setTitle("FocusListener");
    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    frame.setVisible(true);
    
  }
  
}
