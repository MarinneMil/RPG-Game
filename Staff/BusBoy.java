package Staff;
import javax.swing.ImageIcon;



import Staff.Items.Tub;

import java.util.ArrayList;

public class BusBoy extends Characters{
    public BusBoy(){
        super();
    }

    public BusBoy(int x, int y){
        super(x,y,200,200,2, 2, 2, 2, new ImageIcon("pictures/busboy.png"),new Tub(x,y), new Sink(), "Busboy");
    }
    public String toString(){
        return "BusBoy";
    }
}