package Staff.Items;
import javax.swing.ImageIcon;

public class ClipBoard extends Weapons {
    public ClipBoard(){
super();
    }
    public ClipBoard(int x, int y){
    super(x,y,159, 100, 90, 50, 5, new ImageIcon("pictures/ClipBoard.png"));
    }
    public String toString(){
        return"Manager gets a ClipBoard";
    }
}
