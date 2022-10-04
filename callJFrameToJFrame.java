//  call JFrame to anathor JFrame in java

import javax.swing.*;
import java.awt.event.*;

class myFrame implements ActionListener {
  JFrame frame , frame2 ;
  JButton btn , btn2;
  JLabel l ;
  JTextField inp;
  
  
  myFrame () {
  
  frame = new JFrame("Frist Frame");
  frame.setBounds(400 , 150 , 800 , 500);
  frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
  frame.setLayout(null);
  frame.setLocationRelativeTo(null);
  frame.setVisible(true);
  
  btn = new JButton("Click");
  btn.setBounds(100 , 40 , 150 , 40);
  btn.addActionListener(this);
  frame.add(btn);
  
  l = new JLabel();
  l.setBounds(300 , 40 , 500 , 40);
  frame.add(l);
    
  }
  
  public void actionPerformed (ActionEvent e) {
    if (e.getActionCommand().equals("Click")) {
      frame2 = new JFrame("Second Frame");
      frame2.setBounds(500 , 150 , 500 , 300);
      frame2.setLayout(null);
      frame2.setLocationRelativeTo(frame);
      frame2.setVisible(true);
      
      inp = new JTextField();
      inp.setBounds(20 , 40 , 250 , 40);
      frame2.add(inp);
      
      btn2 = new JButton("Submit");
      btn2.setBounds(300 , 40 , 150 , 40);
      frame2.add(btn2);
      frame.dispose();
      btn2.addActionListener(this);
    } else if (e.getActionCommand().equals("Submit")) {
      l.setText(inp.getText());
      frame2.dispose();
      frame.setVisible(true);
    }
  }
}

public class callJFrameToJFrame {
  
  public static void main (String[] args) {
    
    myFrame frame = new myFrame();
  }
}
