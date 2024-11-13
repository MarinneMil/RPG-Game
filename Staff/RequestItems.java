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

}
