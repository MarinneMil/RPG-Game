package Staff;
import javax.swing.ImageIcon;

public class Checks extends Options {
    public Checks(){
        super(100,100,50,50, new ImageIcon("checks.png"));
        setItems();
    }

    public void setItems(){
        super.addItems(new RequestItems("Get Pizza Dough", 300, 500, 200, 200, new ImageIcon("Pictures/busboy.png")));
        super.addItems(new RequestItems("Add Sauce", 500, 500, 200, 200, new ImageIcon("pictures/cook.png")));
          super.addItems(new RequestItems("Add cheese", 700, 500, 200, 200, new ImageIcon("pictures/waiter.png")));
          super.addItems(new RequestItems("Add cheese", 900, 500, 200, 200, new ImageIcon("pictures/waiter.png")));


    }
}
