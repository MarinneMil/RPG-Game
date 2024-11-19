package Staff;
import java.util.ArrayList;
import java.awt.Rectangle;

import javax.swing.ImageIcon;

public class Options {

    private int x,y,w,h;
    private ImageIcon pic;
    private ArrayList <RequestItems> requestsList;

    public Options(int xv, int yv, int width, int height, ImageIcon i){
        x=xv;
        y=yv;
        w=width;
        h=height;
        pic=i;
        requestsList = new ArrayList<>();
    }

    public ArrayList <RequestItems> getList(){
        
        return requestsList;
    }

    public void addItems(RequestItems r){
        requestsList.add(r);
    }
    
    public boolean mouseCol(int xv, int yv){
        Rectangle mouse = new Rectangle(xv,yv, 1,1);
        Rectangle order = new Rectangle(x,y,w,h);
         if(mouse.intersects(order))
         return true;

         return false;
    }

}
