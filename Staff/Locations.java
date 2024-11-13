package Staff;
import java.awt.Graphics;
import java.util.ArrayList;

import javax.swing.ImageIcon;

public class Locations {
    private int x, y,w,h;
    private ImageIcon pic;
    private String name;
    private ArrayList <Locations> maps;
    private Options option;

    public Locations(){
       x=0;
       y=0;
       w=0;
       h=0;
       pic=new ImageIcon();
       name="";
      // maps=setMaps();

    }

    public Locations(int xV, int yV, int width, int height, ImageIcon p, String name, Options Op){
        x=xV;
        y=yV;
        w=width;
        h=height;
        pic=p;
        this.name=name;
        option=Op;
    }

    public void drawLocation(Graphics g2d){
        g2d.drawImage(pic.getImage(), 0,0,getWidth(), getHeight(), null);
        g2d.drawString("options! "+option, 300,300);
        g2d.drawString("List! "+option.getList(), 300,400);


    }


    // public ArrayList<Locations> setMaps(){
    //     ArrayList <Locations> temp = new ArrayList <>();
    //     temp.add(new Kitchen(100,100));
    //     temp.add(new HostStand(100,100));
    //     temp.add(new MainFloor(100,100));

    //     return temp;

    // }


    public Options getOption() {
        return option;
    }

    public void setOption(Options option) {
        this.option = option;
    }

    public int getX() {
        return x;
    }


    public void setX(int x) {
        this.x = x;
    }


    public int getY() {
        return y;
    }


    public void setY(int y) {
        this.y = y;
    }

    public int getWidth() {
        return w; 
    }

    public int getHeight() {
        return h; 
    }
   
    public void setWidth(int w) {
        this.w = w; 
    }

    public void setHeight(int h) {
        this.h = h; 
    }

    public ImageIcon getPic() {
        return pic;
    }


    public void setPic(ImageIcon pic) {
        this.pic = pic;
    }


    public String getName() {
        return name;
    }


    public void setName(String name) {
        this.name = name;
    }


    public ArrayList<Locations> getMaps() {
        return maps;
    }


    public void setMaps(ArrayList<Locations> maps) {
        this.maps = maps;
    }
}

