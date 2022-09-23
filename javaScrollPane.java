//  Java Scroll Pane  :- JScrollPane();

import javax.swing.*;
import java.awt.*;

public class javaScrollPane {
  
  public static void main (String[] args) {
    
    JFrame frame = new JFrame("JScrollPane");
    frame.setLayout(new FlowLayout());
    
    JTextArea ta = new JTextArea(10 , 15);
    // JScrollPane spane = new JScrollPane(ta , JScrollPane.VERTICAL_SCROLLBAR_ALWAYS , JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
    // frame.add(spane);
    
    JScrollPane spane = new JScrollPane(ta , JScrollPane.VERTICAL_SCROLLBAR_AS_NEEDED , JScrollPane.HORIZONTAL_SCROLLBAR_AS_NEEDED);
    frame.add(spane);
    
    
     frame.setBounds(400 , 150 , 800 , 500);
    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    frame.setVisible(true);
   
  }
  
}
