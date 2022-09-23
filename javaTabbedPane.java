//  java Tabbed Pane  :- JTabbedPane();
import javax.swing.*;

public class javaTabbedPane {
  
  public static void main (String[] args) {
    
    JFrame frame = new JFrame("JTabbedPane");
    frame.setLayout(null);
    
    JTabbedPane tb = new JTabbedPane();
    tb.setBounds(50 , 50 , 600 , 400);
    
    JPanel panel1 = new JPanel();
    JPanel panel2 = new JPanel();
    JPanel panel3 = new JPanel();
    
    panel1.add(new JLabel("Frist Tab"));
    panel2.add(new JLabel("Second Tab"));
    panel3.add(new JLabel("Third Tab"));
    
    tb.add("Frist" , panel1);
    tb.add("second" , panel2);
    tb.add("Third" , panel3);
    
    frame.add(tb);
    
    frame.setBounds(400 , 150 , 800 , 500);
    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    frame.setVisible(true);
    
  }
}
