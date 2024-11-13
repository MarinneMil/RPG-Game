package Staff;
import javax.swing.ImageIcon;
import java.util.ArrayList;
import java.awt.Rectangle;

public class Table extends Locations{
    public Table(){
      super(0,0, 50,50,new ImageIcon("Table.jpg"), "Table",new Orders());
      setName("Table");
    }
    public Table(int x,int y){
        super(x,y, 50,50,new ImageIcon("Table.jpg"), "Table",new Orders());
      }
      public ArrayList<Options> setOptionsList(){
     ArrayList<Options> temp = new ArrayList<>();
     temp.add(new Orders());
    return temp;
      }

}

