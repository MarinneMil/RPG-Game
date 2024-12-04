package Staff;
import java.util.ArrayList;
import java.awt.Graphics;
import java.awt.Rectangle;

import javax.swing.ImageIcon;

public class Options {

    private int x,y,w,h;
    private ImageIcon pic;
    private ArrayList <RequestItems> requestsList;
    private String name;

    public Options(int xv, int yv, int width, int height, ImageIcon i){
        x=xv;
        y=yv;
        w=width;
        h=height;
        pic=i;
        requestsList = new ArrayList<>();
    }
    public Options(String s, int xv, int yv, int width, int height, ImageIcon i){
name =s;
x=xv;
y=yv;
w=width;
h=height;
pic=i;
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

    public void drawImage(Graphics g2d) {
        // TODO Auto-generated method stub
g2d.drawImage(pic.getImage(), x,y,w,h,null)  ;
  }


    

}
