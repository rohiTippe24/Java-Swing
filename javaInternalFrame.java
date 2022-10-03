//  JInternalFrame in java

import javax.swing.*;

public class javaInternalFrame {
  
  public static void main (String[] args) {
    
    JFrame frame = new JFrame("JFrame");
    frame.setBounds(400 , 150 , 800 , 500);
    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    frame.setLayout(null);
    frame.setVisible(true);
    
    JInternalFrame iframe = new JInternalFrame("JInternalFrame");
    iframe.setBounds(20 , 20 , 700 , 400);
    iframe.setDefaultCloseOperation(JInternalFrame.DISPOSE_ON_CLOSE);
    iframe.setVisible(true);
    frame.add(iframe);
    iframe.setClosable(true);
    
  }
  
}
