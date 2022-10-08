//  JTextPane in java
import javax.swing.*;
import javax.swing.text.*;
import java.awt.*;

public class javaTextPane {
  
  public static void main (String[] args) {
    
    JFrame frame = new JFrame("JTextPane");
    frame.setBounds(400 , 150 , 800 , 500);
    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    frame.setVisible(true);
    
    
    JTextPane text = new JTextPane();
    frame.add(text);
    
    SimpleAttributeSet sty = new SimpleAttributeSet();
    StyleConstants.setBold(sty , true);
    StyleConstants.setForeground(sty , Color.RED);
    StyleConstants.setBackground(sty , Color.GREEN);
    text.setCharacterAttributes(sty , true);
    
    text.setText("Well-Come to Starwebs");
  
    
    frame.validate();
    
  }
}
