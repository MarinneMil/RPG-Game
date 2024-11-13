package Staff;
import javax.swing.ImageIcon;
import java.util.ArrayList;
import java.awt.Rectangle;

public class Kitchen extends Locations{
    public Kitchen(){
      super(0,0, 1800,1600,new ImageIcon("pictures/Kitchen.jpg"), "Kitchen",new Pizza());
      setName("Kitchen");
    }
    public Kitchen(int x,int y){
        super(x,y, 50,50,new ImageIcon("kitchen.jpg"), "Pictures/Kitchen",new Pizza());
      }
      public ArrayList<Options> setOptionsList(){
     ArrayList<Options> temp = new ArrayList<>();
     temp.add(new Pizza());
    return temp;
      }

}

