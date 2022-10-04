//  JToggleButton in java

import javax.swing.*;
import java.awt.event.*;
import java.awt.*;

public class javaToggleButton {
  
  public static void main (String[] args) {
    
    JFrame frame = new JFrame("JToggleButton");
    frame.setBounds(400 , 150 , 800 , 500);
    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    frame.setLayout(null);
    frame.setVisible(true);
    
    Container c = frame.getContentPane();
    
    JToggleButton tbtn = new JToggleButton("OFF");
    tbtn.setBounds(300 , 200 , 150 , 40);
    tbtn.addActionListener(new ActionListener () {
      public void actionPerformed (ActionEvent e) {
        if (tbtn.isSelected()){
          c.setBackground(Color.ORANGE);
          tbtn.setText("ON");
        }
        else {
          c.setBackground(Color.WHITE);
          tbtn.setText("OFF");
        }
      }
    });
    c.add(tbtn);
    
  }
  
}
