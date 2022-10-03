//  ToolTipText in java

import javax.swing.*;

public class javaToolTip {
  
  public static void main (String[] args) {
    
    JFrame frame = new JFrame("JToolTip");
    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    frame.setBounds(400 , 150 , 800 , 500);
    frame.setVisible(true);
    frame.setLayout(null);
    
    //  Addd HTML in java string
    String text = "<html><h2 style = color:red> java Tool Tip Introduction </h2></html>";
    
    JLabel label = new JLabel(text);
    label.setBounds(100 , 50 , 800 , 50);
    frame.add(label);
    
    String str = "<html><div bgcolor=yellow color=red > Click To submit <br/> Submit</div> </html>";
    
    JButton btn = new JButton("Submit");
    btn.setBounds(350 , 250 , 200 , 40);
    frame.add(btn);
    btn.setToolTipText(str);
    
    frame.validate();
    
  }
}
