//  JOptionPane in javaswing

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
public class javaOptionPane extends JFrame implements WindowListener {
  
   javaOptionPane () {
     this.addWindowListener(this);
   }
  
    public void windowOpened (WindowEvent e) {
      
    }
    public void windowClosing (WindowEvent e) {
     int ch =  JOptionPane.showConfirmDialog(this , "Are You Sure To Exit" , "Exit" , JOptionPane.YES_NO_CANCEL_OPTION , JOptionPane.QUESTION_MESSAGE);
      System.out.println("Clossing");
      
      if (ch == 0) {
        //  System.exit(0); exit our program
        System.exit(0);
      } else {
        //  setDefaultCloseOperation(WindowConstants.DO_NOTHING_ON_CLOSE); :- Stops Closing our program
        this.setDefaultCloseOperation(WindowConstants.DO_NOTHING_ON_CLOSE);
      }
      
    }
    public void windowClosed (WindowEvent e) {
      
    }
    public void windowIconified (WindowEvent e) {
      
    }
    
    public void windowDeiconified (WindowEvent e) {
      
    }
    public void windowActivated (WindowEvent e) {
      
    }
    public void windowDeactivated (WindowEvent e) {
      
    }
  
  public static void main (String[] args) {
    
    Font f = new Font("Arial" , Font.BOLD , 20);
    
    javaOptionPane frame = new javaOptionPane();
    frame.setTitle("JOPtionPane");
    frame.setBounds(400 , 150 , 800 , 500);
    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    frame.setVisible(true);
    
    Container c = frame.getContentPane();
    c.setLayout(new FlowLayout());
    
    JButton btn = new JButton("Input Dialog");
    c.add(btn);
    btn.setFont(f);
    btn.addActionListener(new ActionListener() {
      public void actionPerformed(ActionEvent e) {
        btn.setForeground(Color.RED);
        String name = JOptionPane.showInputDialog("Hey, What`s Your Name");
        
        while(name.length() == 0) {
          name = JOptionPane.showInputDialog("Hey, What`s Your Name");
        }
        
        System.out.println(name);
      }
    });
    
    JButton btn2 = new JButton("Message Dialog");
    btn2.setFont(f);
    c.add(btn2);
    btn2.addActionListener(new ActionListener() {
      public void actionPerformed(ActionEvent e) {
        btn2.setForeground(Color.GREEN);
     
    // JOptionPane.showMessageDialog(container , "message" , "title" , MESSAGE_TYPE);
     
        // JOptionPane.showMessageDialog(c, "Wellcome to Starwebs" , "Starwebs" , JOptionPane.PLAIN_MESSAGE);
        // JOptionPane.showMessageDialog(c, "Wellcome to Starwebs" , "Starwebs" , JOptionPane.INFORMATION_MESSAGE);
        // JOptionPane.showMessageDialog(c, "Wellcome to Starwebs" , "Starwebs" , JOptionPane.QUESTION_MESSAGE);
        // JOptionPane.showMessageDialog(c, "Wellcome to Starwebs" , "Starwebs" , JOptionPane.ERROR_MESSAGE);
        JOptionPane.showMessageDialog(c, "Wellcome to Starwebs" , "Starwebs" , JOptionPane.WARNING_MESSAGE);
      } 
    });
    
    JButton btn3 = new JButton("Confirm Dialog");
    btn2.setFont(f);
    c.add(btn3);
    btn3.setFont(f);
    btn3.addActionListener(new ActionListener() {
      public void actionPerformed(ActionEvent e) {
        btn3.setForeground(Color.PINK);
        
        //  JOptionPane.showConfirmDialog(Container , "Message" , "title" , MESSAGE_TYLE(YES_NO_CANCEL) , MASSEGE_TYPE);
        
      int opt =  JOptionPane.showConfirmDialog(c , "Are You Sure to Exit ? " , "Confirm" , JOptionPane.YES_NO_CANCEL_OPTION , JOptionPane.QUESTION_MESSAGE);
      if (opt == 0) {
        System.out.println("Yes");
        System.exit(0);
      } else if (opt == 1) {
        System.out.println("No");
      } else if (opt == 2) {
        System.out.println("Cancel");
      }
        
      }
    });
  
  }
  
}
