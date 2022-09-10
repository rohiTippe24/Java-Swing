//  Introduction to JLabelin java swing
//  import swing ant awt packages
import javax.swing.*;
import java.awt.*;

  public class javaLabel {
    
    public static void main (String[] args) {
    
    JFrame frame = new JFrame();
    frame.setVisible(true);
    frame.setBounds(400 , 150 , 800 , 500);
    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    
    Container c = frame.getContentPane();
    c.setLayout(null);
   
//  Create Object of JLabel
//  arguments  :~  JLabel label = new Jlabel ("String);
 JLabel label = new JLabel("Username :~ " );
    label.setBounds(100 , 170 , 300 , 50);
    
//  to add  l;abel in container    :~  ContainerObject.add(JLabeObject)
    c.add(label);

//  Create object of Font class
//  arguments  :~ Font font = new Font(font type  ,  font style  ,  font size )
    Font font = new Font("Arial" , Font.BOLD , 25);
    
//  setFont()  :~  set the font to the label
    label.setFont(font);

//  Add Second Label im same Container
    JLabel label2 = new JLabel("Password :~ ");
    label2.setBounds(100 , 220 , 300 , 50);
    label2.setFont(font);
    c.add(label2);
    
    
    }
  }
