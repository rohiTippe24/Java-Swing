//  JLayeredPane in java

import javax.swing.*;
import java.awt.*;

class myFrame extends JFrame {
  
  myFrame () {
    JLayeredPane lpane = this.getLayeredPane();
    
    JButton red = new JButton("Red");
    red.setBounds(50 , 50 , 150 , 50);
    red.setForeground(Color.RED);
    lpane.add(red , 10);
    
    JButton blue = new JButton("Blue");
    blue.setBounds(100 , 75 , 150 , 50);
    blue.setForeground(Color.BLUE);
    lpane.add(blue , 20);
    
    JButton green = new JButton("Green");
    green.setBounds(150 , 100 , 150 , 50);
    green.setForeground(Color.GREEN);
    lpane.add(green ,50);
    
    JButton yellow = new JButton("Yellow");
    yellow.setBounds(200 , 125 , 150 , 50);
    yellow.setForeground(Color.YELLOW);
    lpane.add(yellow , 30);
    
    JButton orange = new JButton("Orange");
    orange.setBounds(250 , 150 , 150 , 50);
    orange.setForeground(Color.ORANGE);
    lpane.add(orange , 40);
    
  }
}

public class javaLayaredPane {
  
  public static void main (String[] args) {
    
    myFrame frame = new myFrame();
    frame.setBounds(400 , 150 , 800 , 500);
    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    frame.setVisible(true);
    
  }
}
