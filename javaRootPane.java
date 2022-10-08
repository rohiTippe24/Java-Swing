//  JRootPane in java

import javax.swing.*;

class myFrame extends JFrame {
  
  myFrame () {
    JRootPane root = this.getRootPane();
    
    JButton btn = new JButton("Click Me");
    
    root.getContentPane().add(btn);
  }
}

public class javaRootPane {
  
  public static void main (String[] args) {
    
    myFrame frame = new myFrame();
    frame.setBounds(400 , 150 , 800 , 500);
    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    frame.setVisible(true);
    
  }
}
