import javax.swing.ImageIcon; 

public class Caitlyn extends Customers{
    public Caitlyn(){
        super();
    }
    public Caitlyn(int x, int y){
       super(x,y,200,200,5,6,2,new ImageIcon("pictures/Caitlyn.png"));
    }
    public String toString(){
        return "Caitlyn";
    }
}
