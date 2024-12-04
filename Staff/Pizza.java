package Staff;
import javax.swing.*;
import javax.swing.ImageIcon;
import java.awt.*;
import java.awt.event.*;
import java.util.ArrayList;
import java.awt.Rectangle;

public class Pizza extends Options {
    private boolean doughCompleted;
    private boolean sauceCompleted;
    private boolean cheeseCompleted;

    public Pizza(String string, int i, int j, int k, int l, ImageIcon imageIcon) {
        super(100, 100, 50, 50, new ImageIcon("pizza.png"));
        setItems();
      
    }

    public Pizza(){
        super(100, 100, 50, 50, new ImageIcon("pizza.png"));
        setItems();
      
    }
     public void setItems() {
             super.addItems(new RequestItems("Get Pizza Dough", 50, 500, 100, 100, new ImageIcon("Pictures/dough.png")));
         super.addItems(new RequestItems("Add Sauce", 55, 500, 100, 100, new ImageIcon("pictures/sauce.png")));
           super.addItems(new RequestItems("Add cheese", 60, 500, 100, 100, new ImageIcon("pictures/cheese.png")));
        
     }
    

    

}
