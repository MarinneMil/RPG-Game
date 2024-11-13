package Staff;
import javax.swing.ImageIcon;
import java.util.ArrayList;
import java.awt.Rectangle;

public class Sink extends Locations{
    public Sink(){
      super(0,0, 1800,1600,new ImageIcon("pictures/Sink.jpg"), "Sink",new Dishes());
      setName("Sink");
    }
    public Sink(int x,int y){
        super(x,y, 50,50,new ImageIcon("pictures/Sink.jpg"), "Sink",new Dishes());
      }
      public ArrayList<Options> setOptionsList(){
     ArrayList<Options> temp = new ArrayList<>();
     temp.add(new Dishes());
    return temp;
      }

}