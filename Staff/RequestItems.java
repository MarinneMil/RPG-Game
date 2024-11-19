package Staff;
import javax.swing.ImageIcon;

public class RequestItems{
private String Items; 
private int x,y,w,h;
private ImageIcon pic;

public RequestItems(){
    Items="";
}
public RequestItems(String n, int x, int y, int w, int h, ImageIcon i){
    this.x=x;
    this.y=y;
    this.w=w;
    this.h=h;
    Items=n;
    pic = i;
}

public void setItems (String r){
    Items.concat(r); //concat means add
    //Items+=r;
}
public String toString(){
    return Items;
}
public String getItems() {
    return Items;
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
public int getW() {
    return w;
}
public void setW(int w) {
    this.w = w;
}
public int getH() {
    return h;
}
public void setH(int h) {
    this.h = h;
}
public ImageIcon getPic() {
    return pic;
}
public void setPic(ImageIcon pic) {
    this.pic = pic;
}

}
