package Staff;
import java.awt.Graphics;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

import javax.swing.ImageIcon;

public class Locations {
    private int x, y, w, h;
    private ImageIcon pic;
    private String name;
    private ArrayList<Locations> maps;
    private Queue<Options> optionList;
    private int topp; // Changed from a single Options object to a list of Options

    public Locations() {
        x = 0;
        y = 0;
        w = 0;
        h = 0;
        pic = new ImageIcon();
        name = "";
        optionList = new LinkedList<>();
        topp=1; // Initialize the list
    }

    public Locations(int xV, int yV, int width, int height, ImageIcon p, String name) {
        x = xV;
        y = yV;
        w = width;
        h = height;
        pic = p;
        this.name = name;
        optionList= new LinkedList <Options> ();
        topp=1; // Initialize with a list of options
    }
    public Locations(int xV, int yV, int width, int height, ImageIcon p, String name, Queue<Options> options) {
        x = xV;
        y = yV;
        w = width;
        h = height;
        pic = p;
        this.name = name;
        this.optionList = options;
        topp=1; // Initialize with a list of options
    }
    public Queue <Options> setQueue(ArrayList <Options> list){
        Queue <Options> qopt= new LinkedList<>();

        for(int i=list.size()-1; i>=0; i--){
    qopt.add(list.remove(i));
        }
        System.out.println("testing queue"+qopt.size());
        return qopt;
    }
    public void incTopp(){
        System.out.println("top is "+topp+" checking list "+optionList.element().getList().size());
        if(topp<optionList.element().getList().size()){
            topp=topp+1;
            System.out.println("top is now "+topp);

        }
        
    }
    public int getTopp(){
        return topp;
    }
    public void drawLocation(Graphics g2d) {
        g2d.drawImage(pic.getImage(), 0, 0, getWidth(), getHeight(), null);
        g2d.drawString("options! ", 300, 300);
        
        // Loop through the list of options
        for (Options option : optionList) {
            g2d.drawString("Option: " + option.toString(), 300, 400); // Print out a simple description of the option
            // Draw the items for each option
            for (RequestItems r : option.getList()) {
          //  r.drawImage(g2d);            
          }
        }
    }

    public Queue<Options> getOptionList() {
        return optionList; // Return the list of options
    }

    public void setOptionList(Queue<Options> options) {
        this.optionList = options; // Set the list of options
    }

    public Options getOption() {
        return optionList.isEmpty() ? null : optionList.element(); // Return the first option if the list is not empty
    }

    public void setOption(Options option) {
        this.optionList.add(option); // Add a new option to the list
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
