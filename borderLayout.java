//  Border Layout

import javax.swing.*;
import java.awt.*;

public class borderLayout {
  
  public static void main (String[] args) {
    
    JFrame frame = new JFrame("Border Layout");
    frame.setBounds(400 , 150 , 800 , 500);
    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    frame.setVisible(true);
    
    JButton btn1  , btn2, btn3 , btn4 , btn5 ;
    
    btn1 = new JButton("Button 1");
    btn2 = new JButton("Button 2");
    btn3 = new JButton("Button 3");
    btn4 = new JButton("Button 4");
    btn5 = new JButton("Button 5");
    
    Container c = frame.getContentPane();
   BorderLayout bl = new BorderLayout(10 , 10);
   c.setLayout(bl);
     
    c.add(btn1  , BorderLayout.PAGE_START  );
    c.add(btn2   , BorderLayout.PAGE_END  );
    c.add(btn3  , BorderLayout.LINE_START  );
    c.add(btn4  , BorderLayout.LINE_END  );
    c.add(btn5  , BorderLayout.CENTER  );
    
  }
}
