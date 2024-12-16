package Staff;
import javax.swing.ImageIcon;
import Staff.Kitchen;

import Staff.Items.Pan;

import java.util.ArrayList;

public class Chef extends Characters{

    public Chef(){
        super();
    }

    public Chef(int x, int y){
        super(x,y,200,200,2, 2, 2, 2, new ImageIcon("pictures/cook.png"),new Pan(x,y),new Kitchen(), "Chef");
    }
    public String toString(){
        return "Chef";
    }
}