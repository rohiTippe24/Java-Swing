//  Check Box in java
import javax.swing.*;
import java.awt.*;

public class javaCheckBox {
  
  public static void main (String[] args) {
    
    JCheckBox c1 , c2 , c3 , c4 , c5 ;
    
    JFrame frame = new JFrame("java Check-Box");
    frame.setBounds(400 , 150 , 800 , 500);
    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    frame.setVisible(true);
    
    Font f = new Font("Arial" , Font.BOLD , 20);
    
    Container c = frame.getContentPane();
    c.setLayout(null);
    
    JLabel l = new JLabel("You Learned Programing Languages");
    l.setBounds(190 , 50 , 600 , 50);
    l.setFont(f);
    l.setForeground(Color.BLUE);
    c.add(l);
    
    c1 = new JCheckBox("   Python 1");
    c1.setBounds(190 , 100 , 300 , 50);
    c1.setFont(f);
    c.add(c1);
    
    c2 = new JCheckBox("   Python 2");
    c2.setBounds(190 , 150 , 300 , 50);
    c2.setFont(f);
    c.add(c2);
    
    c3 = new JCheckBox("   core Java");
    c3.setBounds(190 , 200 , 300 , 50);
    c3.setFont(f);
    c.add(c3);
    
    c4 = new JCheckBox("   Advanced Java");
    c4.setBounds(190 , 250 , 300 , 50);
    c4.setFont(f);
    c.add(c4);
    
    c5 = new JCheckBox("   Kotlin");
    c5.setBounds(190 , 300 , 300 , 50);
    c5.setFont(f);
    c.add(c5);
    
  }
}
