//  JSlider in java

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import javax.swing.event.*;

public class javaSlider{
  
  public static void main (String[] args) {
    JFrame frame = new JFrame();
    frame.setBounds(400 , 150 , 800 , 500);
    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    frame.setLayout(new FlowLayout());
    String str = "JSlider";
    frame.setTitle(str);
    frame.setVisible(true);
    
    JSlider range = new JSlider();
    frame.add(range);
    
    range.setMinimum(0);
    range.setMaximum(200);
    
    range.setPaintTicks(true);
    range.setPaintLabels(true);
    
    range.setMajorTickSpacing(50);
    range.setMinorTickSpacing(10);
    
    // range.setOrientation(JSlider.VERTICAL);
    
    frame.add(new JSeparator());
    
    JLabel label = new JLabel();
    frame.add(label);
    
    range.addChangeListener(new ChangeListener() {
      public void stateChanged(ChangeEvent e) {
        label.setText( "Slider Value  :  " + range.getValue());
      }
    });
    
  }
}
