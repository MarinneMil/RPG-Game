import javax.swing.ImageIcon;

import Staff.Characters;

import java.awt.Graphics;
import java.awt.Rectangle;

public class Customers extends Characters {
    private int x, y, w, h, manners, friendliness, patience, dx, dy;
    private ImageIcon pic;

    public Customers() {
        x = 0;
        y = 0;
        w = 0;
        h = 0;
        manners = 0;
        friendliness = 0;
        patience = 0; 
        dx = 0; 
        dy = 0;
        pic = new ImageIcon();
    }

    public Customers(int xV, int yV, int width, int height, int man, int frien, int pat, ImageIcon p) {
        x = xV;
        y = yV;
        w = width;
        h = height;
        man = manners; 
        friendliness = frien;
        pat = patience;
        pic = p;
        dx = 0;
        dy = 0;
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

    public int getManners() {
        return manners;
    }

    public void setManners(int manners) {
        this.manners = manners;
    }

    public int getFriendliness() {
        return friendliness;
    }

    public void setFriendliness(int friendliness) {
        this.friendliness = friendliness;
    }

    public int getPatience() {
        return patience;
    }

    public void setPatience(int patience) {
        this.patience = patience;
    }

    public int getDx() {
        return dx;
    }

    public void setDx(int dx) {
        this.dx = dx;
    }

    public int getDy() {
        return dy;
    }

    public void setDy(int dy) {
        this.dy = dy;
    }

    public ImageIcon getPic() {
        return pic;
    }

    public void setPic(ImageIcon pic) {
        this.pic = pic;
    }
    public void drawChar(Graphics g2d) {
        g2d.drawImage(pic.getImage(), x, y, w, h, null);

    }
}
