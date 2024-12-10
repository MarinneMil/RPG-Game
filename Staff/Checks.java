package Staff;
import javax.swing.ImageIcon;

public class Checks extends Options {
    public Checks(){
        super(100,100,50,50, new ImageIcon("checks.png"));
        setItems();
    }

    public void setItems(){
        super.addItems(new RequestItems("Get Pizza Dough", 300, 500, 200, 200, new ImageIcon("Pictures/dough.png")));
        super.addItems(new RequestItems("Add Sauce", 300, 500, 200, 200, new ImageIcon("pictures/sauce.png")));
          super.addItems(new RequestItems("Add cheese", 300, 500, 200, 200, new ImageIcon("pictures/cheese.png")));

    }
}
