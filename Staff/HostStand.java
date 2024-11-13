package Staff;
import javax.swing.ImageIcon;
import java.util.ArrayList;
import java.awt.Rectangle;

public class HostStand extends Locations{
    public HostStand(){
      super(0,0, 1800,1600,new ImageIcon("pictures/HostStand.png"), "HostStand",new Checks());
      setName("HostStand");
    }
    public HostStand(int x,int y){
        super(x,y, 50,50,new ImageIcon("pictures/HostStand.png"), "HostStand",new Checks());
      }
      public ArrayList<Options> setOptionsList(){
     ArrayList<Options> temp = new ArrayList<>();
     temp.add(new Checks());
    return temp;
      }

}
