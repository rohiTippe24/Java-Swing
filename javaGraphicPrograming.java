//  Graphics Programing in java

import javax.swing.*;
import java.awt.*;

class myPanel extends JPanel {
  
  myPanel () {
    setBackground(Color.BLACK);
  }
  public void paint (Graphics g) {
    super.paint(g);
    g.setColor(Color.white);
    g.setFont(new Font("Arial" , Font.BOLD , 30));
    g.drawString("Rohit" , 50 , 50);
    
    g.drawLine(50 , 100 , 200 , 200);
    
    g.drawRect(50 , 250 , 200 , 100);
    
    g.fillRect(50 , 360 , 200 , 100);
    
    g.drawOval(300 , 10 , 100 , 100);
    
    g.fillOval(300 , 130 , 100 , 100);
    
    g.drawArc(300 , 250 , 100 , 100 , 0 , 270);
    
    g.fillArc(300 , 370 , 100 , 100 , 0 , 270);
    
    int[] x = {500 , 600 , 450};
    int [] y = {10 , 150 , 300};
    
    g.drawPolygon(x , y , 3);
    
    g.drawImage(new ImageIcon("starwebs_1.png").getImage() , 500 , 300 , 200 , 200 , null);
    
  }
}

class myFrame extends JFrame {
  
  myFrame () {
    add(new myPanel());
  }
  
}

public class javaGraphicPrograming {
  
  public static void main (String[] args) {
    
    myFrame frame = new myFrame();
    frame.setBounds(400 , 150 , 800 , 500);
    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    frame.setVisible(true);
    
  }
}
