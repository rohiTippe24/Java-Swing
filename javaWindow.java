
import javax.swing.*;
import java.awt.event.*;
import java.awt.*;

class myFrame implements ActionListener {
  JFrame frame;
  JWindow win;
  JButton btn , btn2;
  
  myFrame () {
    frame = new JFrame("JWindow");
    frame.setBounds(400 , 150 , 800 , 500);
    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    frame.setVisible(true);
    frame.setLayout(null);
    
    btn = new JButton("Click");
    btn.setBounds(200 , 100 , 150 , 40);
    frame.add(btn);
    btn.addActionListener(this);
  }
  
  public void actionPerformed (ActionEvent e) {
  if (e.getActionCommand().equals("Click")) {
    win = new JWindow(frame);
    win.setBounds(500 , 200 , 400 , 250);
    win.setVisible(true);
    win.setBackground(Color.GREEN);
    
    JPanel panel = new JPanel();
    panel.setBackground(Color.GREEN);
    win.add(panel);
    
    btn2 = new JButton("Close");
    btn2.setBounds(20 , 20 , 150 ,40);
    btn2.addActionListener(this);
    panel.add(btn2);
  } else if (e.getActionCommand().equals("Close")) {
    win.dispose();
  }  
  }
  
  
}

public class javaWindow {
  
  public static void main (String[] args) {
    
    myFrame frame = new myFrame();
    
    
  }
}
