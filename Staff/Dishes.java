package Staff;
import javax.swing.ImageIcon;

public class Dishes extends Options {
    public Dishes(){
        super(100,100,50,50, new ImageIcon("Dishes.png"));
        setItems();
    }

    public void setItems(){
        super.addItems(new RequestItems("Wash dishes", 50,50,50,50, new ImageIcon("dough.png"))); 
    }
}
