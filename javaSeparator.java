//  JSeparator in java

import javax.swing.*;
import java.awt.*;

public class javaSeparator {
  
  public static void main (String[] args) {
    
    JFrame frame = new JFrame("JSeparator");
    frame.setBounds(400 , 150 , 800 , 500);
    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    frame.setLayout(null);
    frame.setVisible(true);
    frame.setLocationRelativeTo(null);
    
    JMenuBar bar = new JMenuBar();
    
    JMenu menu = new JMenu("MENU");
    
   JMenuItem item1 = new JMenuItem("ITEM 1");
   JMenuItem item2 = new JMenuItem("ITEM 2");
   JMenuItem item3 = new JMenuItem("ITEM 3");
   JMenuItem item4 = new JMenuItem("ITEM 4");
   JMenuItem item5 = new JMenuItem("ITEM 5");
   JMenuItem item6 = new JMenuItem("ITEM 6");
    
   menu.add(item1);
   menu.add(item2);
   menu.add(item3);
    
    menu.add(new JSeparator());
    
    menu.add(item4);
    menu.add(item5);
    
    menu.add(new JSeparator());
    
    menu.add(item6);
    
    bar.add(menu);
    
    frame.setJMenuBar(bar);
  
    JPanel panel = new JPanel();
    panel.setBounds(200 , 50 , 400 , 300);
    panel.setLayout(new GridLayout(1 , 2));
    
    JButton btn = new JButton("Click Me");
    panel.add(btn);
  
     // by default JSeparator is Horizontal
    //  make is Vertical  new JSeparator(SwingConstants.VERTICAL);
    panel.add(new JSeparator(SwingConstants.VERTICAL));
    
    JButton btn2 = new JButton("Click Here");
    panel.add(btn2);
    
    frame.add(panel);
  }
}
