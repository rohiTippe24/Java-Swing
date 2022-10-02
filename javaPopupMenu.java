//  popup menu in java
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class javaPopupMenu {
  
  public static void main (String[] args) {
    
    JFrame frame = new myFrame();
    frame.setBounds(400 , 150 , 800 , 500);
    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    frame.setTitle("JPopupMenu");
    frame.setLocationRelativeTo(null);
    frame.setLayout(new FlowLayout());
    frame.setVisible(true);
    
  JPopupMenu pp;
  JMenuItem m1 , m2 , m3;
  
    pp = new JPopupMenu();
    m1 = new JMenuItem("Item 1");
    m2 = new JMenuItem("Item 2");
    m3 = new JMenuItem("Item 3");
  
    pp.add(m1);
    pp.add(m2);
    pp.add(m3);
    
    // pp.setVisible(true);
    //  ,show(whereToShow , LocationX , LocationY);
    pp.show(frame , 200 , 200);
    
    frame.addMouseListener(new MouseAdapter() {
      public void mouseClicked(MouseEvent e) {
        //  getButton(); :-  gives the button Clicked 
        /*
        Left Button  :-  MouseEvent.BUTTON!
        middle Button  :-  MouseEvent.BUTTON2
        right Button  :-  MouseEvent.BUTTON3
        */ 
        //  getX();  :-  Gives the Mouse Clicked x axis
        //  getY();  :-  Gives the Mouse Clicked y axis
        if (e.getButton() == MouseEvent.BUTTON3) 
          pp.show(frame , e.getX() ,e.getY());
      }
    });
    
  }
  
}

