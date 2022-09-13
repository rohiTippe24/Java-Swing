//  Create Text Area in Java
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
class myFrame extends JFrame implements ActionListener {
  JTextArea textarea;
  Container c;
  JButton btn;
  myFrame () {
    c = this.getContentPane();
    c.setLayout(null);
    
    textarea = new JTextArea();
    textarea.setBounds(200 , 30 , 350 , 300);
    textarea.setFont(new Font("Arial" , Font.BOLD , 20));
    textarea.setText("Type Something Here");
    textarea.setBackground(Color.BLACK);
    textarea.setForeground(Color.WHITE);
//  setLineWrap();  :~  overflow line text goes to next line
    textarea.setLineWrap(true);
    c.add(textarea);
    btn = new JButton("Next");
    btn.setBounds(570 , 320 , 100 , 40);
    btn.setForeground(Color.RED);
    btn.setFont(new Font("Arial" , Font.BOLD , 20));
    btn.addActionListener(this);
    c.add(btn);
  }
  
  public void actionPerformed (ActionEvent e) {
    textarea.setText("");
  }
}

public class javaTextArea {
  
  public static void main (String[] args) {
    
    myFrame frame = new myFrame();
    frame.setVisible(true);
    frame.setBounds(600 , 220 , 700 , 400);
    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    frame.setBackground(Color.GREEN);
    
  }
  
}
