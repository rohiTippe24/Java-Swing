
import javax.swing.*;
import java.awt.*;

class myPanel extends JPanel {
  int x = 10;
  int y = 10;
  int step1 = 10;
  int step2 = 10;
  myPanel () {
    setBackground(Color.BLACK);
  }
  public void paint (Graphics g) {
    super.paint(g);
    
    g.setColor(Color.GREEN);
    
    g.fillOval(x , y , 50 ,50);
    
    if (x > 800-50 || x < 0) {
      step1 = -step1;
    }
    if (y > 500-60 || y < 0) {
      step2 = -step2;
    }
      
    x+=step1;
    y+=step2;
    
    try {
      Thread.sleep(40);
    } catch(Exception e) {
    }
    
    repaint();
  }
}

public class javaBouncingBall {
  public static void main (String[] args) {
    
  JFrame frame = new JFrame("Bouncing Ball");
  frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
  frame.setBounds(400 , 150 , 800 , 500);
  frame.setVisible(true);
  
  frame.add(new myPanel());
  }
}
