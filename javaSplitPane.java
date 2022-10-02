//  JSplitPane in Java

import javax.swing.*;

public class javaSplitPane {
  
  public static void main (String[] args) {
    
    JFrame frame = new JFrame("JSplitPane");
    frame.setBounds(400 , 150 , 800 , 500);
    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    frame.setVisible(true);
    
    JButton left = new JButton("LIFT_SIDE");
    
    JButton right = new JButton("RIGHT_SIDE");
    
    JSplitPane spane = new JSplitPane(JSplitPane.HORIZONTAL_SPLIT);
    
    spane.setTopComponent(left);
    spane.setBottomComponent(right);
    
    spane.setDividerSize(8);
    spane.setDividerLocation(250);
    spane.setOneTouchExpandable(true);
    
    frame.add(spane);
    
    frame.validate();
  }
  
}
