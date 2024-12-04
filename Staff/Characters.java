package Staff;

import javax.swing.ImageIcon;

import Staff.Items.Pan;
import Staff.Items.Weapons;
import Staff.Locations;

import java.awt.Graphics;
import java.awt.Rectangle;
import java.lang.foreign.Linker.Option;
import java.util.ArrayList;

public class Characters {
    private int x, y, w, h, speed, health, smarts, friendliness, dx, dy;
    private ImageIcon pic;
    private Weapons weap;
    private ArrayList<RequestItems> ItemsList;
    private Options tasks;
    private Locations location;
    private String Name;
    public Object getLocation;

    public Characters() {
        x = 0;
        y = 0;
        w = 0;
        h = 0;
        speed = 0;
        health = 0;
        smarts = 0;
        friendliness = 0;
        dx = 0;
        dy = 0;
        pic = new ImageIcon();
        Name = "";
        // ItemsList=setItemsList();
    }

    public boolean mouseCol(int mx, int my) {
        Rectangle mouse = new Rectangle(mx, my, 1, 1);
        Rectangle cha = new Rectangle(x, y, w, h);

        if (cha.intersects(mouse)) {
            return true;
        };

        return false;
    }

    public Characters(int xV, int yV, int width, int height, int sp, int hea, int sma, int frie, ImageIcon p,Weapons we, Locations loc, String name) {
        x = xV;
        y = yV;
        w = width;
        h = height;
        speed = sp;
        health = hea;
        smarts = sma;
        friendliness = frie;
        pic = p;
        dx = 0;
        dy = 0;
        weap = we;
        location = loc;
        this.Name=name;
    }



    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

   
    public Locations getLocation() {
        return location;
    }

    public void setLocation(Locations location) {
        this.location = location;
    }

    public Options getTasks() {
        return tasks;
    }

    public void setTasks(Options opt) {
        tasks = opt;
    }

    public void drawChar(Graphics g2d) {
        g2d.drawImage(pic.getImage(), x, y, w, h, null);

    }

    public void drawWeap(Graphics g2d) {
        g2d.drawImage(pic.getImage(), x, y, w, h, null);
    }
    // public ArrayList<RequestItems> setItemsList(){
    // ArrayList<RequestItems> temp = new ArrayList<>();
    // return temp;

    // }
    public void setX(int x) {
        this.x = x;
    }

    public void setY(int y) {
        this.y = y;
    }

    public void setW(int w) {
        this.w = w;
    }

    public void setH(int h) {
        this.h = h;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public void setHealth(int health) {
        this.health = health;
    }

    public void setSmarts(int smarts) {
        this.smarts = smarts;
    }

    public void setFriendliness(int friendliness) {
        this.friendliness = friendliness;
    }

    public void setDx(int dx) {
        this.dx = dx;
    }

    public void setDy(int dy) {
        this.dy = dy;
    }

    public void setPic(ImageIcon pic) {
        this.pic = pic;
    }

    public void setWeapons(Weapons weap) {
        this.weap = weap;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public int getW() {
        return w;
    }

    public int getH() {
        return h;
    }

    public int getSpeed() {
        return speed;
    }

    public int getHealth() {
        return health;
    }

    public int getSmarts() {
        return smarts;
    }

    public int getFriendliness() {
        return friendliness;
    }

    public int getDx() {
        return dx;
    }

    public int getDy() {
        return dy;
    }

    public ImageIcon getPic() {
        return pic;
    }

    public Weapons getWeap() {
        return weap;
    }

}
