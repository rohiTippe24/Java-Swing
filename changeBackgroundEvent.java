//  Change the background color of frame by handling events
import javax.swing.*;
import java.awt.*;

// import java.awt.event.*  class to implement ActionListener class
import java.awt.event.*;

//  create class <myframe> which extends JFrame and implements ActionListener
class myFrame extends JFrame implements ActionListener{
//  Create Object of Container && JButton
  Container c ;
  JButton btn , btn2 , btn3 , btn4;

//  Define Counstructor myFrame
  myFrame () {
//  use this keyword to apply method on self class
    c = this.getContentPane();
    c.setLayout(null);
    btn = new JButton();
    btn2 = new JButton("Red");
    btn3 = new JButton("Green");
    btn4 = new JButton("Blue");
    btn.setText("Yellow");
    btn.setBounds(80 , 100 , 150 , 40);
    btn2.setBounds(230 , 100 , 150 , 40);
    btn3.setBounds(380 , 100 , 150 , 40);
    btn4.setBounds(530 , 100 , 150 , 40);
    btn.setForeground(Color.YELLOW);
    btn2.setForeground(Color.RED);
    btn3.setForeground(Color.GREEN);
    btn4.setForeground(Color.BLUE);
    btn.setFont(new Font("Arial" , Font.PLAIN , 18));
    btn2.setFont(new Font("Arial" , Font.PLAIN , 18));
    btn3.setFont(new Font("Arial" , Font.PLAIN , 18));
    btn4.setFont(new Font("Arial" , Font.PLAIN , 18));
    
//  addActionListener()  :~  add action to the button 
    btn.addActionListener(this);
    btn2.addActionListener(this);
    btn3.addActionListener(this);
    
//  implement linier addActionListener
    btn4.addActionListener(new ActionListener() {
      public void actionPerformed (ActionEvent e) {
        c.setBackground(Color.BLUE);
      }
    });
    c.add(btn);
    c.add(btn2);
    c.add(btn3);
    c.add(btn4);
    
  }

//  actionPerformed(ActionEvent # ) is the abstract method of Actionlistener interface
public  void actionPerformed (ActionEvent a) {

//  a.getSource()  :~  finds the source on which this method was applied
if (a.getSource() == btn)
  c.setBackground(Color.YELLOW);
else if (a.getSource() == btn2) 
  c.setBackground(Color.RED);
else if (a.getSource() == btn3)
  c.setBackground(Color.GREEN);
 }
}

public class changeBackgroundEvent {
  
  public static void main (String[] args) {
    
    myFrame frame = new myFrame();
    frame.setTitle("Change Background Color");
    frame.setVisible(true);
    frame.setBounds(400 , 150 , 800 , 500);
    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    frame.setResizable(false);
  }
}
