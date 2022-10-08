
import javax.swing.*;
import java.awt.*;

class Panel extends JPanel {
  int x = 0;
  int step = 10;
  Panel () {
    setBackground(Color.BLACK);
  }
  
  public void paint (Graphics g) {
    super.paint(g);
    
    g.setColor(Color.GREEN);
    g.drawRect(x , 50 , 200 , 100);
  
    g.fillRect(x , 200 , 200 , 100);
    
    if (x > 800-200 || x < 0 ) {
      step = -step;
    }
    try {
      Thread.sleep(40);
    } catch(Exception e) {
    }
    
    x+=step;
  repaint();
  }
}

public class javaMovingRect {
  
  public static void main (String[] args) {
    
    JFrame frame = new JFrame("Moving Rectangle");
    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    frame.setBounds(400 , 150 , 800 , 500);
    frame.setVisible(true);
    
    frame.add(new Panel());
    
  }
}
