package Staff;
import javax.swing.ImageIcon;


import Staff.Items.ClipBoard;

import java.util.ArrayList;

public class Manager extends Characters{
    public Manager(){
        super();
    }

    public Manager(int x, int y){
        super(x,y,300,300,2, 2, 2, 2, new ImageIcon("pictures/manager.png"), new ClipBoard(x,y),new HostStand(),"Manager");
    }
    public String toString(){
        return "Manager";
    }
}