//  KeyListener in java
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

class myFrame extends JFrame implements KeyListener {
  JLabel l1 , l2 , l3;
  Container c;
  JTextField text;
  
  myFrame() {
    c = this.getContentPane();
    c.setLayout(null);
    
    Font f = new Font("Arial" , Font.BOLD , 20);
    
    l1 = new JLabel("press r for RED");
    l1.setBounds(100 , 80 , 400 , 50);
    l1.setFont(f);
    c.add(l1);
    l1.setForeground(Color.RED);
    
    l2 = new JLabel("press g for GREEN");
    l2.setBounds(100 , 230 , 400 , 50);
    l2.setFont(f);
    c.add(l2);
    l2.setForeground(Color.GREEN);
    
    l3 = new JLabel("press p for PINK");
    l3.setBounds(100 , 380 , 400 , 50);
    l3.setFont(f);
    c.add(l3);
    l3.setForeground(Color.PINK);
    
    text = new JTextField();
    text.setBounds(550 , 200 , 100 , 100);
    c.add(text);
    text.setFont(new Font("Arial" , Font.BOLD , 35));
    text.addKeyListener(this);
  }
  
  public void keyPressed (KeyEvent e) {
   if (e.getKeyChar() =='r') {
      c.setBackground(Color.RED);
   } else if (e.getKeyChar() == 'g') {
     c.setBackground(Color.GREEN);
   } else if (e.getKeyChar() == 'p') {
     c.setBackground(Color.PINK);
   }

  }
  
  public void keyTyped (KeyEvent e) {
    text.setText("");
    
      }
  
  public void keyReleased (KeyEvent e) {
    c.setBackground(Color.WHITE);
    text.setText("");
  }
  
}

public class keyEvents {
  
  public static void main (String[] args) {
    
  myFrame frame = new myFrame();
  frame.setBounds(400 , 150 , 800 , 500);
  frame.setTitle("keyListener");
  frame.setVisible(true);
  frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    
  }
}
