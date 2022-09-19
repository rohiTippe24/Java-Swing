//  java WindowListener

import javax.swing.*;
import java.awt.event.*;

class myFrame extends JFrame implements WindowListener {
  myFrame () {
  this.addWindowListener(this);
}

/*
abstract method of WindowListener interfase
1. windowOpened();
2. windowClosing();
3. windowClosed();
4. windowIconifide();
5. windowDeiconified();
6. windowActivated();
7. windowDeactivated();
*/

public void windowOpened (WindowEvent e) {
  System.out.println("window opened");
} 

public void windowClosing (WindowEvent e) {
  System.out.println("window closing");
}

public void windowClosed (WindowEvent E) {
  System.out.println("window closed");
}

public void windowIconified (WindowEvent e) {
  System.out.println("window minimized");
} 

public void windowDeiconified (WindowEvent e) {
  System.out.println("window maximized");
}

public void windowActivated (WindowEvent e) {
  System.out.println("window activated");
}

public void windowDeactivated (WindowEvent e) {
  System.out.println("window deactivated");
}
}

public class windowEvents {
  
  public static void main (String[] args) {
    
    myFrame frame = new myFrame();
    frame.setBounds(400 , 150 , 800 , 500);
    frame.setTitle("WindowListener");
    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    frame.setVisible(true);
    
  }
  
}
