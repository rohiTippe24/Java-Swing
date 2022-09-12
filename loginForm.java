//  Create login page 
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

class myFrame extends JFrame  implements ActionListener{
  Container c;
  JLabel j1 , j2 , j3 , j4 , j5;
  Font f;
  JTextField inp1;
  JPasswordField pass;
  JButton btn;
  myFrame () {
  f = new Font("Arial" , Font.BOLD , 20);
  j1 = new JLabel("Username  :-  ");
  c = this.getContentPane();
  c.setLayout(null);
  j1.setBounds(100 , 25 , 200 , 160);
  j1.setFont(f);
  
  inp1 = new JTextField();
  inp1.setBounds(300 , 78 ,  250 , 50);
  inp1.setFont(f);
  c.add(inp1);
  
  j2 = new JLabel("Password  :-  ");
  j2.setBounds(100 , 96  , 200 , 160);
  j2.setFont(f);
  
  pass = new JPasswordField();
  pass.setBounds(300 , 150 , 250 , 50);
  pass.setFont(f);
  c.add(pass);
  c.add(j1);
  c.add(j2);
  
  btn = new JButton("Submit");
  btn.setBounds(500 , 250 , 100 , 40);
  btn.setFont(new Font("Arial" , Font.BOLD , 15));
  btn.setForeground(Color.RED);
  btn.addActionListener(this);
  c.add(btn);
  
  }
  
  public void actionPerformed (ActionEvent e) {
    c.setBackground(Color.ORANGE);
    j3 = new JLabel("Submited Succesfully");
    j3.setBounds(250 , 300 , 300 , 40);
    j3.setForeground(Color.GREEN);
    j3.setFont(new Font("Arial" , Font.BOLD , 16));
    c.add(j3);

//  getText() is used to get input text
    j4 = new JLabel("Congrachulation " + inp1.getText());
    j4.setBounds(150 , 320 , 500 , 40);
    j4.setForeground(Color.BLUE);
    j4.setFont(f);
    c.add(j4); 
    
    System.out.println("Name :- " + inp1.getText());
    System.out.println("Password  :- " + pass.getText());
    
  }
}

public class loginForm {
  
  public static void main (String[] args) {
    
    myFrame frame = new myFrame();
    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    frame.setVisible(true);
    frame.setTitle("Login Page");
    frame.setBounds(500 , 200 , 700 , 400);
    
  }
}
