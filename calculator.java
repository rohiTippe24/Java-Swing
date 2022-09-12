import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

class myFrame extends JFrame implements ActionListener {
  Container c;
  JLabel frist , second , ans;
  JButton add , sub , mult , div  ;
  JTextField fin , sin ;
  myFrame () {
    Font f = new Font("Arial" , Font.BOLD , 20);
    c = this.getContentPane();
    c.setLayout(null);
    frist = new JLabel("Frist Number  :-  ");
    frist.setBounds(170 , 110 , 300 , 40);
    frist.setFont(f);
    c.add(frist);
    
    second = new JLabel("Second Number  :-  ");
    second.setBounds(170 , 190 , 300 , 40);
    second.setFont(f);
    c.add(second);
    
    fin = new JTextField();
    fin.setBounds(390 , 110 , 250 , 40 );
    fin.setFont(f);
    c.add(fin);
    
    sin = new JTextField();
    sin.setBounds(390 , 190 , 250 , 40);
    sin.setFont(f);
    c.add(sin);
    
    add = new JButton(" + ");
    add.setBounds(100 , 310 , 80 , 40);
    add.setFont(f);
    c.add(add);
    
    sub = new JButton(" - ");
    sub.setBounds(260 , 310 , 80 , 40);
    sub.setFont(f);
    c.add(sub);
    
    mult = new JButton(" x ");
    mult.setBounds(410 , 310 , 80 , 40);
    mult.setFont(f);
    c.add(mult);
    
    div = new JButton(" / ");
    div.setBounds(560 , 310 , 80 , 40);
    div.setFont(f);
    c.add(div);
    
    add.addActionListener(this);
    sub.addActionListener(this);
    mult.addActionListener(this);
    div.addActionListener(this);
    
    
     ans = new JLabel("");
    ans.setBounds(200 , 400 , 800 , 50);
    ans.setFont(new Font("Arial" , Font.BOLD , 20));
    ans.setForeground(Color.RED);
    c.add(ans);
   
    
  }
  
  public void actionPerformed ( ActionEvent e ) {
    int a = Integer.parseInt(fin.getText());
    int b = Integer.parseInt(sin.getText());
    int c;
    if (e.getSource() == add) {
      ans.setText("");
      c = a+b;
      ans.setText("Addition is :-  " + c );
    } else if (e.getSource() == sub) {
      ans.setText("");
      c = a-b;
      ans.setText("Substraction is :-  " +  c);
    } else if (e.getSource() == mult) {
      ans.setText("");
      c = a*b;
      ans.setText("Multiplication is :-  " + c );
    } else if (e.getSource() == div) {
      c = a/b;
      ans.setText("");
      ans.setText("Division is :-  " +  c);
    }
  }
  
}

public class calculator {
  
  public static void main (String[] args) {
    
    myFrame frame = new myFrame();
    frame.setVisible(true);
    frame.setBounds(400 , 150 , 800 , 500);
    frame.setTitle("Calculator");
    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
  }
}
