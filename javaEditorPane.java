//  JEditorPane in java

import javax.swing.*;
import java.awt.*;

public class javaEditorPane {
  
  public static void main (String[] args) {
    
    JFrame frame = new JFrame("JEditorPane");
    frame.setBounds(400 , 150 , 800 , 500);
    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    frame.setLayout(null);
    frame.setVisible(true);
    
    // JEditorPane epane = new JEditorPane();
    // epane.setContentType("text/plain");
    // epane.setText("hii i am Rohit Uttam Tippe");
    // epane.setBounds(20 , 20 , 600 , 40);
    // frame.add(epane);
    
    frame.setLayout(new FlowLayout());
    
    JEditorPane epane = new JEditorPane();
    epane.setContentType("text/html");
    epane.setText("<html> <h1 color = 'red'>Hello World</h1> <hr/> <p color = 'green'>hiii i am rohit uttam tippe</p>  </html>");
    frame.add(epane);
   
    frame.validate();
  }
}
