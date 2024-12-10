package Staff;
import javax.swing.ImageIcon;

public class Dishes extends Options {
    public Dishes(){
        super(100,100,50,50, new ImageIcon("Dishes.png"));
        setItems();
    }

    public void setItems(){
        super.addItems(new RequestItems("Get Pizza Dough", 300, 500, 200, 200, new ImageIcon("Pictures/dough.png")));
        super.addItems(new RequestItems("Add Sauce", 300, 500, 200, 200, new ImageIcon("pictures/sauce.png")));
          super.addItems(new RequestItems("Add cheese", 300, 500, 200, 200, new ImageIcon("pictures/cheese.png")));

    }
    public String toString (){
        return "Dishes";
     }
}
