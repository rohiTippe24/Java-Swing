// Create Java Frame Using Swing class
// Import swing && awt class
import javax.swing.*;
import java.awt.*;
public class javaFrame {
  
  public static void main (String[] args) {
    
//  Create Object of JFrame 
    JFrame frame = new JFrame();
//  by Default Frame in not visible make it visible using setVisible() Method
    frame.setVisible(true);

//  setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE) this method is used  to exit the programe after clossing the window frame
    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

//  setSize() method is used to set size of frame 
//  arguments  :~  setSize(width , height);
    
    frame.setSize(800 , 500);

//  setLocation() is used to set a location of frame
//  arguments  :~  setLocation(Horizontal , vertical);
    frame.setLocation(400 , 150);
    
/*
we can use setBounds ();  this is opetional for setSize();  && setLocation();
arguments  :~  setBounds(Horizaotal , vertical , width , Height);
*/
    // frame.setBounds(400 , 150 , 800 , 500);
    
//  setTitle() is used to give a title to the frame
    frame.setTitle("Java Frame");
    
//  Create object of ImageIcon 
// arguments  :~  ImageIcon ico = new ImageIcon("path of image"); 
    ImageIcon ico = new ImageIcon("starwebs_1.png");
    
//  setIconImage()  is ued to set the icon of frame
//  getImage();  :~  set the image which was passed in a ImageIcon object as a argument
    frame.setIconImage(ico.getImage());
    
//  Container is is class of awt package
    Container c = frame.getContentPane();

//  setBackground();  :~  set the background color of the frame 
    c.setBackground(Color.GREEN);
    
//  etResizable()  :~  gives ablity to resize frame
//  bt Default it was true.
    frame.setResizable(false);
    
    
  }
  
}
