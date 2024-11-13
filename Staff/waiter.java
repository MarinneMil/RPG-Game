package Staff;
import java.util.ArrayList;

import javax.swing.ImageIcon;


import Staff.Items.Tray;

public class waiter extends Characters{
    public waiter(){
        super();
    }

    public waiter(int x, int y){
        super(x,y,200,200,2, 2, 2, 2, new ImageIcon("pictures/waiter.png"), new Tray(x,y), new Table(),"Waiter");
    
    }
    public String toString(){
        return "waiter" ;
    }
    
}