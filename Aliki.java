import javax.swing.ImageIcon; 

public class Aliki extends Customers{
    public Aliki(){
        super();
    }
    public Aliki(int x, int y){
       super(x,y,200,200,5,6,2,new ImageIcon("pictures/Aliki.png"));
    }
    public String toString(){
        return "Aliki";
    }
}
