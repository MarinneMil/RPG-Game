import javax.swing.ImageIcon; 

public class Campbell extends Customers{
    public Campbell(){
        super();
    }
    public Campbell(int x, int y){
       super(x,y,200,200,5,6,2,new ImageIcon(""));
    }
    public String toString(){
        return "Campbell";
    }
}
