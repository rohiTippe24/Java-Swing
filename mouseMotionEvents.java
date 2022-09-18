//  MouseMotionlistener in java
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

class myFrame extends JFrame implements MouseMotionListener {
  
  JLabel l , l2;
  Container c;
  String t = "Moving";
  String t2 = "Dragging";  
  
  myFrame() {
  
  c  = this.getContentPane();
  c.setLayout(null);
  
  l = new JLabel("java is best programing language");
  l.setBounds(100 , 100 , 500 , 40);
  l.setFont(new Font("Arial" , Font.BOLD , 20));
  l.addMouseMotionListener(this);
  c.add(l);
    
  l2 = new JLabel();
  l2.setBounds(100 , 200 , 500 , 40);
  l2.setForeground(Color.BLUE);
  l2.setFont(new Font("Arial" , Font.BOLD , 20));
  c.add(l2);
    
    
  }
  
  public void mouseMoved (MouseEvent e) {
    l.setForeground(Color.RED);
    t += ".";
    l2.setText(t);
    t2 = "Dragging";
  }
  
  public void mouseDragged (MouseEvent e) {
    l.setForeground(Color.GREEN);
   t2 = t2 += ".";
    l2.setText(t2);
    t = "Moving";
  }
  
}

public class mouseMotionEvents {
  public static void main (String[] args) {
    
    myFrame frame = new myFrame();
    frame.setTitle("MouseMotionListener");
    frame.setBounds(400 , 150 , 800 , 500);
    frame.setVisible(true);
    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    
  }
}
