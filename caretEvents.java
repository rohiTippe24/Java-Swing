//  java CaretListener

import javax.swing.*;
import java.awt.*;
//  CaretListener is a interface in javax.swing.event package
import javax.swing.event.*;

class myFrame extends JFrame implements CaretListener {
  
  Container c ;
  JTextArea ta ;
  JLabel l ;
  int count = 0;
  
  myFrame () {
    
  c = this.getContentPane();
  c.setLayout(null);
  
  Font f = new Font("Arial" , Font.BOLD , 20);
  
  ta = new JTextArea();
  ta.setBounds(100 , 100 , 250 , 150);
  ta.setFont(f);
  ta.setForeground(Color.BLUE);
  ta.addCaretListener(this);
  c.add(ta);
    
  l = new JLabel();
  l.setBounds(100 , 400 , 300 , 40);
  l.setFont(f);
  l.setForeground(Color.GREEN);
  l.setVisible(false);
  c.add(l);
  }
  
  public void caretUpdate (CaretEvent e) {
    count++;
    l.setVisible(true);
    // l.setText("Character count  :-  " + (count-1));
    l.setText("Character Count  :-  " + e.getDot() );
  }
  
}

public class caretEvents {
  
  public static void main (String[] args) {
    
    myFrame frame = new myFrame();
    frame.setTitle("CaretListener");
    frame.setBounds(400 , 150 , 800 , 500);
    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    frame.setVisible(true);
  
  }
  
}
