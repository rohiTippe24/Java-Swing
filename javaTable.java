//  JTable in java swing

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

//  import javax.swing.table.*;  for DefaultTableModel class
import javax.swing.table.*;

class myFrame extends JFrame{
  
  JTable table;
  Container c , c2;
  JScrollPane sp;
  JLabel l1 , l2 , l3;
  JTextField inpname , inprole , inpper;
  JButton add , update , del;
  JPanel panel1 , panel2;
  String nameee , roleee;
  int perrr;
  int selectedRow = -1;
  
  //  Created 2d array of Object 
  //  in Object we can add string or int both
   Object[][] data = {
      {
        "Rohan" , "Angular" , 100
      } ,
      {
        "Ramesh" , "Spring Boot" , 50
      } ,
      {
        "Rohit" , "React JS" , 99
      }         
    };
    
    String name[] = {
      "Name" , "Role", "Percentage"
    };
   
  //  DefaultTableModel("2d Array for column , array for row / Title");
   DefaultTableModel model = new DefaultTableModel(data , name);
  
  myFrame () {
  
    c = this.getContentPane();
 //  set Grid layout of 3 by 1  :- 3 column || one Row 
    c.setLayout(new GridLayout(3 , 1));
    
    Font f = new Font("Arial" , Font.BOLD , 20);

//  JTable(add default table model )   ::: optional  :-  new JTable(2d array , array);
    table = new JTable(model);
    table.setFont(new Font("Arial" , Font.BOLD , 12));
    table.setForeground(Color.BLUE);
    sp = new JScrollPane(table);
    
    c.add(sp);
  
  panel1 = new JPanel();
  panel1.setLayout(null);
  c.add(panel1);
  
   panel2 = new JPanel();
   panel2.setLayout(new GridLayout(3 , 3));
   c.add(panel2);
    
    l1 = new JLabel("Name  :-  ");
    panel2.add(l1);
    l1.setFont(f);
    
    inpname = new JTextField();
    panel2.add(inpname);
    
    add = new JButton("Add");
    panel2.add(add);
    add.addActionListener(new ActionListener() {
      public void actionPerformed(ActionEvent e) {
       try {
       
        String namee = inpname.getText();
        String rolee = inprole.getText();
        int perr = Integer.parseInt(inpper.getText());
        
        //  Create Object as column to add in table
        Object[] newRow = {namee , rolee , perr};
        
        //  Add items in table  :-  model.addRow(array for Row);
        model.addRow(newRow);
        
        inpname.setText(null);
        inprole.setText(null);
        inpper.setText(null);
       } catch (Exception ex) {
         JOptionPane.showMessageDialog(c , "Error :- Failed" , "Error", JOptionPane.ERROR_MESSAGE);
       }
      }
    });
   
    l2 = new JLabel("Role  :- ");
    panel2.add(l2);
    l2.setFont(f);
  
   inprole = new JTextField();
    panel2.add(inprole);
    update = new JButton("Update");
    panel2.add(update);
    update.addActionListener(new ActionListener() {
      public void actionPerformed(ActionEvent e1) {
        try {
        String upname = inpname.getText();
        String uprole = inprole.getText();
        int upper = Integer.parseInt(inpper.getText());
        
        //  Update Row in table 
        //  model.setValueAt(valueToSet , IndexOfRow , IndetOfColumn);
        
        model.setValueAt(upname , selectedRow , 0);
        model.setValueAt(uprole , selectedRow , 1);
        model.setValueAt(upper , selectedRow , 2);
        
        inpname.setText(null);
        inprole.setText(null);
        inpper.setText(null);
        
        } catch (Exception ex) {
          JOptionPane.showMessageDialog(c , "Select Row To Update" , "Error" , JOptionPane.ERROR_MESSAGE);
        }
          }
    });
   
    l3 = new JLabel("Percentage  :-  ");
    panel2.add(l3);
    l3.setFont(f);
    
    inpper = new JTextField();
    panel2.add(inpper);
    
    del = new JButton("Delet");
    panel2.add(del);
    del.addActionListener(new ActionListener () {
      public void actionPerformed(ActionEvent e) {
        try {
          if (selectedRow != -1 ) {
            
            int ch = JOptionPane.showConfirmDialog(c , "Are You Sure To Delet" , "Delet" , JOptionPane.YES_NO_OPTION , JOptionPane.WARNING_MESSAGE);
            
            //  Delet Row in Table :-  model.removeRow(IndexOfRow);
            if (ch == 0) 
              model.removeRow(selectedRow);
          selectedRow = -1;
          
           inpname.setText(null);
           inprole.setText(null);
           inpper.setText(null);
             
          } else {
            JOptionPane.showMessageDialog(c, "Select Row Frist To Delet" , "Error" , JOptionPane.ERROR_MESSAGE);
          }
        } catch(Exception ex) {
          
        }
      }
    });
    
    //  MouseAdapter class is optional class for MouseListener
    //  MouseAdapter  :-  no need to implement all methods of MouseListener interface
    table.addMouseListener (new MouseAdapter() {
      public void mouseClicked(MouseEvent e) {
        //  Find the index of selected Row 
        //  table.getSelectedRow();
        selectedRow = table.getSelectedRow();
        
       nameee = model.getValueAt(selectedRow , 0).toString();
       roleee = model.getValueAt(selectedRow  , 1).toString();
       perrr = Integer.parseInt(model.getValueAt(selectedRow , 2).toString());
       
        inpname.setText(nameee);
        inprole.setText(roleee);
        
        //  Convert Integer to tring  :-  String.valueOf(IntVeriable);
        String perup = String.valueOf(perrr);
        inpper.setText(perup);
      }
    });
  
  }
  
}

public class javaTable {
  
  public static void main (String[] args) {
    
    myFrame frame = new myFrame();
    frame.setBounds(400 , 150 , 800 , 500);
    frame.setTitle("JTable");
    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    frame.setVisible(true);
    
  }
  
}
