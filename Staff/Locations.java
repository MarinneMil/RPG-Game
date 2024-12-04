package Staff;
import java.awt.Graphics;
import java.util.ArrayList;
import javax.swing.ImageIcon;

public class Locations {
    private int x, y, w, h;
    private ImageIcon pic;
    private String name;
    private ArrayList<Locations> maps;
    private ArrayList<Options> optionList;
    private int topp; // Changed from a single Options object to a list of Options

    public Locations() {
        x = 0;
        y = 0;
        w = 0;
        h = 0;
        pic = new ImageIcon();
        name = "";
        optionList = new ArrayList<>();
        topp=0; // Initialize the list
    }

    public Locations(int xV, int yV, int width, int height, ImageIcon p, String name, ArrayList<Options> options) {
        x = xV;
        y = yV;
        w = width;
        h = height;
        pic = p;
        this.name = name;
        this.optionList = options;
        topp=0; // Initialize with a list of options
    }

    public void incTopp(){
        if(topp<optionList.size())
        topp++;
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
            r.drawImage(g2d);            }
        }
    }

    public ArrayList<Options> getOptionList() {
        return optionList; // Return the list of options
    }

    public void setOptionList(ArrayList<Options> optionList) {
        this.optionList = optionList; // Set the list of options
    }

    public Options getOption() {
        return optionList.isEmpty() ? null : optionList.get(0); // Return the first option if the list is not empty
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
