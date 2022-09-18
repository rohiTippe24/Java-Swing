//  MouseListener in java
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

class myFrame extends JFrame implements MouseListener {
JTextField text;
JButton btn;
Container c;

   myFrame() {
     c = this.getContentPane();
     c.setLayout(null);
     
     Font f = new Font("Arial" , Font.BOLD , 20);
     
     text = new JTextField();
     text.setBounds(200 , 150 , 200 , 40);
     text.setFont(f);
     c.add(text);
     text.setText("Username :~ ");
     text.addMouseListener(this);
     
     btn = new JButton("Submit");
     btn.setBounds(450 , 150 , 200 , 40);
     btn.setFont(f);
     c.add(btn);
     btn.addMouseListener(this);
   }
  
  public void mouseEntered (MouseEvent e) {
    if (e.getSource() == btn) {
    btn.setForeground(Color.RED);
  }
  }
  
  public void mouseExited (MouseEvent e) {
    if (e.getSource() == btn) {
    btn.setForeground(Color.BLACK);
    }
  }
  
  public void mousePressed (MouseEvent e) {
  if (e.getSource() == btn)
    btn.setText("click");
  }
  
  public void mouseReleased (MouseEvent e) {
    if (e.getSource() == btn)
    System.out.println("username  :-  " + text.getText() );
  }
  
  public void mouseClicked (MouseEvent e) {
    if (e.getSource() == btn) {
      btn.setText("Submited");
    } else if (e.getSource() == text ) {
      text.setText("");
      btn.setText("Submit");
    }
  }
}

public class mouseEvents {
  public static void main (String[] args) {
    
    myFrame frame = new myFrame();
    frame.setBounds(400 , 150 , 800 , 500);
    frame.setTitle("mouseListener");
    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    frame.setVisible(true);
  }
}
