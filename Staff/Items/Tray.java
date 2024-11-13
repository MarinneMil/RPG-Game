package Staff.Items;
import javax.swing.ImageIcon;

public class Tray extends Weapons {
    public Tray(){
super();
    }
    public Tray(int x, int y){
    super(x,y,159, 100, 90, 50, 5, new ImageIcon("pictures/Tray.png"));
    }
    public String toString(){
        return"Waiter gets a Tray";
    }
}
