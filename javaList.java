// JList in java

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class javaList {
  static int index= -1;
  public static void main (String[] args) {
    JFrame frame = new JFrame("JList");
    frame.setBounds(400 , 150 , 800 , 500);
    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    frame.setVisible(true);
    /*
    String[] arr = {
      "item1",
      "item2",
      "item3",
      "item4",
      "item5",
      "item6",
      "item7",
      "item8",
      "item9",
      "item10"
    };
    
    JList list = new JList(arr);
    list.setVisibleRowCount(5);
    
    list.setToolTip("Double Click On Item");
    
    list.addMouseListener(new MouseAdapter() {
      public void mouseClicked (MouseEvent e) {
        if (e.getClickCount() == 2)
         System.out.println(list.getSelectedValue());
      }
    });
    
    JScrollPane spane = new JScrollPane(list);
    frame.add(spane);
    
    frame.setLayout(new FlowLayout());
    */
    
    frame.setLayout(new GridLayout(2 , 1));
    
    JPanel panel = new JPanel();
    panel.setLayout(new BorderLayout());
    DefaultListModel model = new DefaultListModel();
    
    JList list = new JList(model);
    model.addElement("Item1");
    model.addElement("item2");
    model.addElement("item3");
    model.addElement("item4");
    model.addElement("item5");
    model.addElement("item6");
    

    panel.add(new JScrollPane(list));
    frame.add(panel);
    
    JPanel panel2 = new JPanel();
    panel2.setLayout(null);
    
    JTextField input = new JTextField();
    panel2.add(input);
    input.setBounds(50 , 30 , 400 ,40);
    
    JButton add = new JButton("Add");
    panel2.add(add);
    add.addActionListener(new ActionListener() {
      public  void actionPerformed(ActionEvent e) {
        if (!input.getText().isEmpty()) {
        String inp = input.getText();
        model.addElement(inp);
        input.setText(null);
        }
      }
    });
    add.setBounds(50 , 100 , 100 , 40);
    
    JButton up = new JButton("Update");
    panel2.add(up);
    up.setBounds(200 , 100 , 100 , 40);
    up.addActionListener(new ActionListener() {
      public void actionPerformed (ActionEvent e) {
        if (!input.getText().isEmpty()) {
        try {
          model.set(index , input.getText());
          input.setText(null);
          index = -1;
        } catch (Exception err) {
          JOptionPane.showMessageDialog(frame , "Select Index Frist" , "Error" , JOptionPane.ERROR_MESSAGE);
        }
        }
      }
    });
    
    JButton del = new JButton("Delet");
    panel2.add(del);
    del.setBounds(350 , 100 , 100 , 40);
    frame.add(panel2);
    del.addActionListener(new ActionListener() {
      public void actionPerformed (ActionEvent e) {
      try {
        model.remove(list.getSelectedIndex());
        input.setText(null);
      } catch (Exception err) {
        input.setText(null);
      }
      }
    });
    
    
    list.addMouseListener(new MouseAdapter() {
      public void mouseClicked (MouseEvent e) {
        if (e.getClickCount() == 2) {
          index = list.getSelectedIndex();
          input.setText(String.valueOf(list.getSelectedValue()));
        }
      }
    });
    
    frame.validate();
    
  }
}
