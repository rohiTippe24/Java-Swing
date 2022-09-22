//  GridBagLayout

import javax.swing.*;
import java.awt.*;

public class gridBagLayout {
  
  public static void main (String[] args) {
    
    JFrame frame = new JFrame("GridBag Layout");
    frame.setBounds(400 , 150 , 800 , 500);
    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    frame.setVisible(true);
    
    JButton btn1  , btn2, btn3 , btn4 , btn5 ;
    
    btn1 = new JButton("Button 1");
    btn2 = new JButton("Button 2");
    btn3 = new JButton("Button 3");
    btn4 = new JButton("Button 4");
    btn5 = new JButton("Button 5");
    
    Container c = frame.getContentPane();
    // FlowLayout fl = new FlowLayout();
    
    //  GridLayout gl = new GridLayout(rows , columns);
    
    GridBagLayout gbl = new GridBagLayout();
    c.setLayout(gbl);
    
    //  set vertical and horizantal gap
    
    
    GridBagConstraints gbc = new GridBagConstraints();
    
    //  weightx  :-  add weight on x axis
    
    gbc.weightx = 0.5;
    
    //  .fill = GridBagConstraints.HORIZONTAL  :- adjust the size of content accourding to screen size
    
    gbc.fill = GridBagConstraints.HORIZONTAL;

//  .gridy  :-  location on y axis
//  .gridx  :-  location on x axis
    
    gbc.gridy = 0 ;
    gbc.gridx = 0;
    c.add(btn1 , gbc);
    
    gbc.gridx = 1 ;
    gbc.gridy = 0 ; 
    c.add(btn2 , gbc);
    
    gbc.gridx = 2 ;
    gbc.gridy = 0 ;
    c.add(btn3 , gbc);
    
//  .gridwidth  :- set width of content accourding to per grid width
    
    gbc.gridwidth = 3;
    
//  .ipady  :-  gives padding to the content
    
    gbc.ipady = 40;
    gbc.gridx = 0;
    gbc.gridy = 1 ;
    c.add(btn4 , gbc);
    
    gbc.gridwidth = 2;
    gbc.gridx = 2 ;
    gbc.gridy = 5 ;
    c.add(btn5 , gbc);
    
  }
}
