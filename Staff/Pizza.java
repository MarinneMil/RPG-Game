package Staff;
import javax.swing.ImageIcon;

public class Pizza extends Options {
    public Pizza(){
        super(100,100,50,50, new ImageIcon("pizza.png"));
        setItems();
    }

    public void setItems(){
        super.addItems(new RequestItems("Get Pizza Dough", 50,50,50,50, new ImageIcon("dough.png"))); 
        super.addItems(new RequestItems("Add Sauce",500,500,50,50, new ImageIcon("dough.png")));
        super.addItems(new RequestItems("Put in Oven",300,500,50,50, new ImageIcon("dough.png")));
        super.addItems(new RequestItems("Deliver to Customer",500,500,50,50, new ImageIcon("dough.png")));

    }
}
