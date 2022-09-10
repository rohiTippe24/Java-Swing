//  Create Text Input Field In java
import javax.swing.*;
import java.awt.*;

public class javaTextField {
  
  public static void main (String[] args) {
    JFrame frame = new JFrame();
    frame.setVisible(true);
    frame.setBounds(400 , 150 , 800 , 500);
    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    Container c = frame.getContentPane();
    c.setLayout(null);
    
//  Create Object of JTextField
    JTextField textInput = new JTextField();
    textInput.setBounds(300 , 100 , 200 , 30);
    textInput.setText("Username");
    
    Font font = new Font("Arial" , Font.PLAIN , 15);
    textInput.setFont(font);
    
//  setForeground();  :~  set the color to text
    textInput.setForeground(Color.RED);
    
//  setBackground();  :~  set color to the background input field
    textInput.setBackground(Color.YELLOW);
    // text.setEditable(false);
    c.add(textInput);
    
    
  }
}
