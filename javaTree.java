//  JTree in java

import javax.swing.*;
import javax.swing.tree.*;

public class javaTree {
  
  public static void main (String[] args) {
    
    JFrame frame = new JFrame("JTree");
    frame.setSize(800 , 500);
    frame.setLocationRelativeTo(null);
    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    frame.setVisible(true);
    
    DefaultMutableTreeNode root = new DefaultMutableTreeNode("Root");
    
    DefaultMutableTreeNode a = new DefaultMutableTreeNode("A");
    DefaultMutableTreeNode b = new DefaultMutableTreeNode("b");
    
    DefaultMutableTreeNode a1 = new DefaultMutableTreeNode("a1");
    DefaultMutableTreeNode a2 = new DefaultMutableTreeNode("a2");
    
    DefaultMutableTreeNode a11 = new DefaultMutableTreeNode("a11");
    
    DefaultMutableTreeNode b1 = new DefaultMutableTreeNode("b1");
    DefaultMutableTreeNode b2 = new DefaultMutableTreeNode("b2");
    DefaultMutableTreeNode b3 = new DefaultMutableTreeNode("b3");
    
    a1.add(a11);
    
    a.add(a1);
    a.add(a2);
    
    b.add(b1);
    b.add(b2);
    b.add(b3);
    
    root.add(a);
    root.add(b);
    
    JTree tree = new JTree(root);
    
    frame.add(tree);
  }
}
