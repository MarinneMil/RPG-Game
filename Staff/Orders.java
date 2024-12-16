package Staff;
import javax.swing.ImageIcon;

public class Orders extends Options {
    public Orders(){
        super(100,100,50,50, new ImageIcon("3.png"));
        setItems();
    }

    public void setItems(){
        super.addItems(new RequestItems("Get Pizza Dough", 100, 500, 200, 200, new ImageIcon("Pictures/person1.png")));
         super.addItems(new RequestItems("Add Sauce", 300, 500, 200, 200, new ImageIcon("pictures/person2.png")));
           super.addItems(new RequestItems("Add cheese", 600, 500, 200, 200, new ImageIcon("pictures/person1.png")));
           super.addItems(new RequestItems("Add Sauce", 800, 500, 200, 200, new ImageIcon("pictures/person2.png")));

    }
}
