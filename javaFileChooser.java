//  JFileChooser in java

import javax.swing.*;
import java.awt.event.*;
import java.io.*;
import javax.swing.filechooser.*;

public class javaFileChooser {
  
  public static void main (String[] args) {
    
    JFrame frame = new JFrame("JFileChooser");
    frame.setBounds(400 , 150 , 800 , 500);
    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    frame.setLayout(null);
    frame.setVisible(true);
    
    JButton open = new JButton("Open");
    open.setBounds(50 , 50 , 150 , 40);
    frame.add(open);
    
    JButton save = new JButton("Save");
    save.setBounds(300 , 50  , 150 , 40);
    frame.add(save);
    
    JLabel label = new JLabel();
    label.setBounds(50 , 150 , 800 , 40);
    frame.add(label);
    
//  create object of JFileChooser();
    
    JFileChooser filechooser = new JFileChooser();
    
    //  set multiple file selection enabled
    filechooser.setMultiSelectionEnabled(true);
    // JFileChooser filechooser = new JFileChooser("/data/data/com.termux/files/home/java/javaswing");
    
    //  set filter to select only java files
    FileNameExtensionFilter filter = new FileNameExtensionFilter("Only Java Files (.java)" , "java");
    filechooser.addChoosableFileFilter(filter);
    
    //  Diseble Default File Chooser
    filechooser.setAcceptAllFileFilterUsed(false);
    
    open.addActionListener(new ActionListener () {
      public void actionPerformed (ActionEvent e) {
        // int a = filechooser.showDialog(null , "Open File");
        int a = filechooser.showOpenDialog(null);
        if (a == JFileChooser.APPROVE_OPTION) {
          
          //  store selected filec in File data type array
          
          File[] files = filechooser.getSelectedFiles();
          for (int i = 0 ; i < files.length ; i++) { 
           File file = files[i];
          System.out.println("selected file : " + file.getAbsolutePath() );
          }
        }
      }
    });
    
    save.addActionListener(new ActionListener () {
      public void actionPerformed (ActionEvent e) {
        int b = filechooser.showSaveDialog(null);
      }
    });
    
  }
}
