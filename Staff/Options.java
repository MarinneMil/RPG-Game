package Staff;
import java.util.ArrayList;

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
    

}
