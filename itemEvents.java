import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

class myFrame extends JFrame implements ItemListener {
  Container c ;
  JComboBox cbox;
  JLabel j;
  JRadioButton rb1 , rb2;
  JCheckBox c1 , c2 , c3 ;
  JMenuBar bar;
  JMenu menu;
  JCheckBoxMenuItem jc;
  
  myFrame () {
    c = this.getContentPane();
    c.setLayout(null);
    
  Font f = new Font("Arial" , Font.BOLD , 20);
  
//  addItemListener() on JComboBox
    
    String clr[] = {"red" , "green" , "yellow" , "pink"};
    
    cbox = new JComboBox(clr);
    cbox.setBounds(100 , 80 , 150 , 40);
    cbox.addItemListener(this);
    cbox.setFont(f);
    c.add(cbox);
    
    j = new JLabel("");
    j.setBounds(450 , 10 , 400 , 50);
    j.setForeground(Color.RED);
    j.setFont(f);
    c.add(j);
   
//  addItemListener() on JRadioButon
    
    rb1 = new JRadioButton("Male");
    rb1.setBounds(100 , 150 , 150 , 40);
    rb1.setFont(f);
    rb1.addItemListener(new ItemListener() {
     public void itemStateChanged (ItemEvent e) {
        j.setText("Male");
      }
    });
    c.add(rb1);
    
    rb2 = new JRadioButton("Female");
    rb2.setBounds(250 ,150 , 150 ,40);
    rb2.setFont(f);
    rb2.addItemListener(new ItemListener() {
      public void itemStateChanged(ItemEvent e) {
        j.setText("Female");
      }
    });
    c.add(rb2);
    
    ButtonGroup gr = new ButtonGroup();
    gr.add(rb1);
    gr.add(rb2);

//  addItemListener() on JCheckBox
    
    c1 = new JCheckBox("Marathi");
    c1.setBounds(100 , 250 , 150  , 40);
    c1.setFont(f);
    c.add(c1);
    c1.addItemListener(this);
    
    c2 = new JCheckBox("Hindi");
    c2.setBounds(300 , 250 , 150 , 40);
    c2.setFont(f);
    c.add(c2);
    c2.addItemListener(this);
    
    c3 = new JCheckBox("English");
    c3.setBounds(500 , 250 , 150 , 40);
    c3.setFont(f);
    c.add(c3);
    c3.addItemListener(this);
    
//  addActionListener() on JCheckBoxMenuItem
    
    bar = new JMenuBar();
    menu = new JMenu("View");
    jc = new JCheckBoxMenuItem("print");
    jc.setSelected(true);
    
    jc.addItemListener(new ItemListener () {
      public void itemStateChanged (ItemEvent e) {
        if (jc.isSelected()) {
          j.setVisible(true);
        } else {
          j.setVisible(false);
        }
      }
    });
    
    menu.add(jc);
    bar.add(menu);
    this.setJMenuBar(bar);
  }

  public void itemStateChanged (ItemEvent e) {
    if (e.getSource() == cbox ) {
   j.setText(cbox.getSelectedItem().toString());
    } else {
   String lan = "";
   if (c1.isSelected()) {
     lan += "  marathi  " ;
   }
   if (c2.isSelected()) {
     lan += "  Hindi  ";
   }
   if (c3.isSelected()) {
     lan += "  English  ";
   }
   j.setText(lan);
     }
  }
}

public class itemEvents {
  
  public static void main (String[] args) {
    
  myFrame frame = new myFrame();
  frame.setVisible(true);
  frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
  frame.setBounds(400 , 150 , 800 , 500);
    
  }
  
}
