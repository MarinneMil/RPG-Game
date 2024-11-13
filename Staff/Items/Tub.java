package Staff.Items;
import javax.swing.ImageIcon;

public class Tub extends Weapons {
    public Tub(){
super();
    }
    public Tub(int x, int y){
    super(x,y,159, 100, 90, 50, 5, new ImageIcon("pictures/Tub.png"));
    }
    public String toString(){
        return"Bus boy gets a tub";
    }
}
