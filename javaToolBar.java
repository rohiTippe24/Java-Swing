//  JToolBar in java

import javax.swing.*;
import java.awt.*;

public class javaToolBar {
  
  public static void main (String[] args) {
    
    JFrame frame = new JFrame("JToolBar");
    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    frame.setBounds(400 , 150 , 800 , 500);
    frame.setVisible(true);
    
    JToolBar tbar = new JToolBar();
    
    JButton btn = new JButton("Button1");
    tbar.add(btn);
    
    JButton btn2 = new JButton("Button2");
    tbar.add(btn2);
    
    tbar.addSeparator();
    
    JComboBox cb = new JComboBox( new String[] {"item1" , "item2" , "item3" , "item4" , "item5"});
    tbar.add(cb);
    
    tbar.setFloatable(false);
    
    frame.add(BorderLayout.NORTH , tbar);
    
    frame.validate();
    
  }
}
