//  Java Menu Bar
import javax.swing.*;
import java.awt.*;

public class javaMenuBar {
  
  public static void main (String[] args) {
    
    JFrame frame = new JFrame("Notepad ** ");
    frame.setBounds(400 , 150 , 800 , 500);
    frame.setVisible(true);
    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

//  Create Object of JMenuBar to set menubar
    JMenuBar bar = new JMenuBar();
    
//  Create object of JMenu to add menues in menu bas
    JMenu menu = new JMenu("File");
    
//  Create object of JMenuItem to add item in menu
    JMenuItem item = new JMenuItem("New");
    JMenuItem item2 = new JMenuItem("Open");
    JMenuItem item3 = new JMenuItem("Save");
    JMenuItem item4 = new JMenuItem("Exit");
    
    item.setFont(new Font("Arial" , Font.BOLD , 15));
    item2.setFont(new Font("Arial" , Font.BOLD , 15));
    item3.setFont(new Font("Arial" , Font.BOLD , 15));
    item4.setFont(new Font("Arial" , Font.BOLD , 15));
    
    menu.add(item);
    menu.add(item2);
    menu.add(item3);
    menu.add(item4);
    
    bar.add(menu);
    
    menu.setFont(new Font("Arial" , Font.BOLD , 15));
    
    frame.setJMenuBar(bar);
    
    JMenu edit = new JMenu("Edit");
    
    edit.setFont(new Font("Arial" , Font.BOLD , 15));
    
    JMenuItem ei = new JMenuItem("undo");
    JMenuItem ei2 = new JMenuItem("Redo");
    
    ei.setFont(new Font("Arial" , Font.BOLD , 15));
    ei2.setFont(new Font("Arial" , Font.BOLD , 15));
    
    edit.add(ei);
    edit.add(ei2);
    
    menu.add(edit);
  }
  
}
