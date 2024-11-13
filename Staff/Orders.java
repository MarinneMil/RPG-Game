package Staff;
import javax.swing.ImageIcon;

public class Orders extends Options {
    public Orders(){
        super(100,100,50,50, new ImageIcon("orders.png"));
        setItems();
    }

    public void setItems(){
        super.addItems(new RequestItems("Take orders", 50,50,50,50, new ImageIcon("dough.png"))); 
        

    }
}
