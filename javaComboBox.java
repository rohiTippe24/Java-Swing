//  Java Combo Box
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class javaComboBox {
  
  public static void main (String[] args) {
    
    JFrame frame = new JFrame("Java Combo- Box");
    frame.setSize(800 , 500);
    frame.setLocationRelativeTo(null);
    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    frame.setVisible(true);
    
    Font f = new Font("Arial" , Font.BOLD , 20);
    
    Container c = frame.getContentPane();
    c.setLayout(null);
    
    JLabel l = new JLabel("Select Your Country");
    l.setBounds(100 , 90 , 400 , 50);
    l.setFont(f);
    l.setForeground(Color.BLUE);
    c.add(l);
    
    String[] country = { "USA" , "Finland" , "United Kingdom" , "India" , "Itly" , "Japan" , "Norwey"};
    
    JComboBox cb = new JComboBox(country);
    cb.setBounds(400 , 100 , 300 , 40);
    cb.setFont(f);
    cb.setEditable(true);
    cb.setSelectedItem("select country");
    cb.setForeground(Color.RED);
    cb.addItem("Canada");
    c.add(cb);
    
    JButton btn = new JButton("Submit");
    btn.setBounds(600 , 350 , 120 , 50);
    btn.setFont(f);
    btn.setForeground(Color.GREEN);
    btn.addActionListener(new ActionListener () {
      public void actionPerformed (ActionEvent e) {
        System.out.println("User Selected  :-  " + cb.getSelectedItem());
      }
    });
    c.add(btn);
  }
}
