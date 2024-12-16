package Staff;
import javax.swing.ImageIcon;

public class Dishes extends Options {
    public Dishes(){
        super(100,100,50,50, new ImageIcon("Dishes.png"));
        setItems();
    }

    public void setItems(){
        super.addItems(new RequestItems("Get Pizza Dough", 500, 500, 200, 200, new ImageIcon("Pictures/dirtydishes.png")));
        super.addItems(new RequestItems("Add Sauce", 100, 500, 200, 200, new ImageIcon("pictures/dirtydishes.png")));
          super.addItems(new RequestItems("Add cheese", 300, 500, 200, 200, new ImageIcon("pictures/dirtydishes.png")));
          super.addItems(new RequestItems("Add cheese", 200, 500, 200, 200, new ImageIcon("pictures/dirtydishes.png")));
          super.addItems(new RequestItems("Add cheese", 400, 500, 200, 200, new ImageIcon("pictures/dirtydishes.png")));
          super.addItems(new RequestItems("Add cheese", 600, 500, 200, 200, new ImageIcon("pictures/dirtydishes.png")));

    }
    public String toString (){
        return "Dishes";
     }
}
