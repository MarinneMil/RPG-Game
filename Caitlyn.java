import javax.swing.ImageIcon; 

public class Caitlyn extends Customers{
    public Caitlyn(){
        super();
    }
    public Caitlyn(int x, int y){
       super(x,y,200,200,5,6,2,new ImageIcon(""));
    }
    public String toString(){
        return "Caitlyn";
    }
}
