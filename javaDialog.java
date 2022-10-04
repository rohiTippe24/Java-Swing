//  JDialog in java

import javax.swing.*;
import java.awt.event.*;

public class javaDialog {
  
  public static void main (String[] args) {
    
    JFrame frame = new JFrame("JDialog");
    frame.setBounds(400 , 150 , 800 , 500);
    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    frame.setLayout(null);
    frame.setVisible(true);
    
    JButton btn = new JButton("Click Here");
    btn.setBounds(300 , 200 , 150 , 40);
    frame.add(btn);
    btn.addActionListener(new ActionListener () {
      public void actionPerformed (ActionEvent e) {
        JDialog d1 = new JDialog(frame , "Dialog box 1");
        d1.setBounds(500 , 200 , 300 , 200);
        JButton btn2 = new JButton("Click Me");
        btn2.setBounds(30 , 30 , 150 ,40);
        d1.add(btn);
        d1.setVisible(true);
       }
    });
    
    
  }
}
