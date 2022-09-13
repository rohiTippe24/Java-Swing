//  java Radio Button
import javax.swing.*;
import java.awt.*;

public class javaRadioButton {
  
  public static void main (String[] args) {
    
    JRadioButton b1 , b2 , b3  , b4  , b5;
    
    JFrame frame = new JFrame("Java Radio Button");
    frame.setBounds(400 , 150 , 800 , 500);
    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    frame.setVisible(true);
    
    Font f = new Font("Arial" , Font.BOLD , 20);
    
    Container c = frame.getContentPane();
    c.setLayout(null);
    
    JLabel l = new JLabel("Your Fevroite Programing Language");
    l.setBounds(190 , 50 , 600 , 100);
    l.setFont(f);
    l.setForeground(Color.RED);
    c.add(l);
    
    b1 = new JRadioButton("   Python");
    b1.setBounds(190 , 150 , 200 , 50);
    b1.setFont(f);
    c.add(b1);
    
    b2 = new JRadioButton("   Java");
    b2.setBounds(190 , 200 , 200 , 50);
    b2.setFont(f);
    b2.setSelected(true);
    c.add(b2);
    
    b3 = new JRadioButton("   c#");
    b3.setBounds(190 , 250 , 200 , 50);
    b3.setFont(f);
    c.add(b3);
    
    b4 = new JRadioButton("   ASP.Net");
    b4.setBounds(190 , 300 , 200 , 50);
    b4.setFont(f);
    c.add(b4);
    
    b5 = new JRadioButton("   HTML");
    b5.setBounds(190 , 350 , 200 , 50);
    b5.setFont(f);
    b5.setEnabled(false);
    c.add(b5);
    
//  Create group of multiple buttons
    ButtonGroup lang = new ButtonGroup();
    lang.add(b1);
    lang.add(b2);
    lang.add(b3);
    lang.add(b4);
    lang.add(b5);
    
    
  }
  
}
