//  action listeners on JButton JTextField , JMenu
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

class myFrame extends JFrame implements ActionListener {
  Container c;
  JTextField inp ;
  JButton btn ;
  JMenuBar bar;
  JMenu menu ;
  JMenuItem item1 , item2;
  
  myFrame () {
    c = this.getContentPane();
    c.setLayout(null);
    
    Font f = new Font("Arial" , Font.BOLD , 20);
    
    inp = new JTextField("username");
    inp.setBounds(100 , 80 , 200 , 50);
    c.add(inp);
    inp.setFont(f);
    
    btn = new JButton("Submit");
    btn.setBounds(400 , 80 , 150 , 40);
    c.add(btn);
    btn.setFont(f);
    btn.setVisible(true);
    
    
     bar = new JMenuBar();
    
    menu = new JMenu("View");
    
     item1 = new JMenuItem("View");
    item2 = new JMenuItem("Go back");
    
    menu.add(item1);
    menu.add(item2);
    
    bar.add(menu);
    
    this.setJMenuBar(bar);
    
//  action listener in text field applies when we press enter button
    
    inp.addActionListener(this);
    btn.addActionListener(this);
    item1.addActionListener(this);
    item2.addActionListener(this);
    
    
  }
  
  
  public void actionPerformed (ActionEvent e) {
    if (e.getSource() == btn) {
      System.out.println("username  :-  " + inp.getText() );
      inp.setText("");
    }
   if (e.getSource() == inp) {
      inp.setText("");
    }
    
    if (e.getSource() == item2) {
      inp.setText("username");
      btn.setVisible(true);
      inp.setEditable(true);
    }
    
    if (e.getSource() == item1) {
      btn.setVisible(false);
      inp.setEditable(false);
    }
    
  }
  
}

public class actionEvents {
  
  public static void main (String[] args) {
    
    myFrame frame = new myFrame();
    frame.setVisible(true);
    frame.setTitle("java action event");
    frame.setBounds(400 , 150 , 800 , 500);
    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
  
    
  }
  
}




