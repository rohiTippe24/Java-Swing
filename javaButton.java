//   Create Button
import javax.swing.*;
import java.awt.*;
public class javaButton {
  
  public static void main (String[] args) {
    
    JFrame frame = new JFrame();
    frame.setVisible(true);
    frame.setBounds(400 , 150 , 800 , 500);
    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    Container c = frame.getContentPane();
    c.setLayout(null);
    
//  Create Object of JButton
//  Arguments  :~  new JButton(String / object)
    JButton btn = new JButton("Click Here");
    
//  set image is JButton Counstructor
    // JButton btn = new JButton(new ImageIcon("starwebs_1.png"));
    btn.setVisible(true);
    btn.setBounds(100 , 100 , 150 , 40);
    btn.setForeground(Color.RED);
    // btn.setBackground(Color.BLACK);
    btn.setFont(new Font("Arial" , Font.PLAIN , 20));
    
// setCursor()  :~  set mouse on over event
    btn.setCursor(new Cursor(Cursor.HAND_CURSOR));
    // btn.setCursor(new Cursor(Cursor.CROSSHAIR_CURSOR));
    // btn.setCursor(new Cursor(Cursor.WAIT_CURSOR));
  
// setEnabled()  :~  make button enabled od desabled
//  setEnabled  by default argument in true
    // btn.setEnabled(false);
    c.add(btn);
    
  }
}
