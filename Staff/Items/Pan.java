package Staff.Items;
import javax.swing.ImageIcon;

public class Pan extends Weapons {
    public Pan(){
super();
    }
    public Pan(int x, int y){
    super(x,y,159, 100, 90, 50, 5, new ImageIcon("pictures/Pan.png"));
    }
    public String toString(){
        return"chef gets a pan";
    }
}
