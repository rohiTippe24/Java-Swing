//  Create Well-Come Screen in java

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

class myFrame  {
  JFrame frame;
  JWindow win;
  JProgressBar pbar;
  JPanel panel;
  JLabel label;
  Timer timer;
  
  myFrame () {
    
    frame = new JFrame("WellCome Screen");
    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    frame.setBounds(400 , 150 , 800 , 500);
    frame.setLayout(null);
    
    label = new JLabel("Well-Come");
    label.setForeground(Color.RED);
    label.setFont(new Font("Arial" , Font.BOLD , 22));
    frame.add(label);
    
    win = new JWindow(frame);
    win.setBounds(400 , 150 , 800 , 220);
    win.setLayout(null);
    win.setVisible(true);
    
    pbar = new JProgressBar(0 , 100);
    pbar.setBounds(50 , 100 , 700 , 50);
    win.add(pbar);
    win.revalidate();
    timer = new Timer(150 , new ActionListener () {
       public void actionPerformed (ActionEvent e) {
    int a = pbar.getValue();
    if (a >=100) {
      win.dispose();
      frame.setVisible(true);
      timer.stop();
    } else {
      pbar.setValue(a+4);
    }
    
  }
    });
    
    timer.start();
    frame.validate();
  }
  
}

public class wellcomeScreen {
  
  public static void main (String[] args) {
    
    myFrame frame = new myFrame();
    
  }
}