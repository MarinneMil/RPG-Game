package Staff;
import javax.swing.ImageIcon;

public class Checks extends Options {
    public Checks(){
        super(100,100,50,50, new ImageIcon("checks.png"));
        setItems();
    }

    public void setItems(){
        super.addItems(new RequestItems("check chef", 50,50,50,50, new ImageIcon("dough.png"))); 
        super.addItems(new RequestItems("check waiter",500,500,50,50, new ImageIcon("dough.png")));
        super.addItems(new RequestItems("check bus boy",300,500,50,50, new ImageIcon("dough.png")));
        super.addItems(new RequestItems("check customers",500,500,50,50, new ImageIcon("dough.png")));

    }
}
