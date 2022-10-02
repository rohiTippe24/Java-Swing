//  JSpinner in java

import javax.swing.*;
import java.awt.*;
import javax.swing.event.*;

public class javaSpinner {
  
  public static void main (String[] args) {
    
    JFrame frame = new JFrame("JSpinner");
    frame.setBounds(400 , 150 , 800 , 500);
    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    frame.setVisible(true);
    frame.setLayout(new FlowLayout());
    
    JSpinner day , month , year;
    SpinnerModel daymodel , monthmodel , yearmodel;
    
    daymodel = new SpinnerNumberModel(1 , 1 , 31 , 1);
    day = new JSpinner(daymodel);
    frame.add(day);
    
    String[] montharr = {
      "Jan" , "Feb" , "March" , "Apr" , "May" , "june" , "July" , "Aug" , "Sept" , "Nov" , "Dec"
    };
    
    monthmodel = new SpinnerListModel(montharr);
    month = new JSpinner(monthmodel);
    frame.add(month);
    
    yearmodel = new SpinnerNumberModel(2022 , 1970 , 2025 , 1);
    year = new JSpinner(yearmodel);
    frame.add(year);
    
    
    day.addChangeListener(new ChangeListener() {
      public void stateChanged (ChangeEvent e) {
        System.out.println("Day  :-  " + day.getValue());
      }
    });
    
    month.addChangeListener(new ChangeListener () {
      public void stateChanged (ChangeEvent e) {
        System.out.println("Month  :-  " + month.getValue());
      }
    });
    
    year.addChangeListener(new ChangeListener () {
      public void stateChanged (ChangeEvent e) {
        System.out.println("Year  :-  " + year.getValue());
      }
    });
    
    frame.validate();
  }
  
  
}
