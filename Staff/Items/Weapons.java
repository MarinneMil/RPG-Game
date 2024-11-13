package Staff.Items;
import javax.swing.ImageIcon;
import java.awt.Graphics;
import java.awt.Rectangle;
public class Weapons {
    @SuppressWarnings("unused")
    private int x,y,w,h, dx, dy, damage, duribility, dps;

    private ImageIcon pic; 


    public Weapons(){
        x=0;
        y=0;
        w=0;
        h=0;
        damage=0; 
        duribility=0; 
        dps=0; 
        dx=0;
        dy=0;
        pic = new ImageIcon();
        }

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
        
        public void setDx(int dx) {
            this.dx = dx;
        }
        
        public void setDy(int dy) {
            this.dy = dy;
        }
        
        public void setPic(ImageIcon pic) {
            this.pic = pic;
        }
        
        public void setdamage(int damage) {
            this.damage = damage;
        }
        public void setduribility(int duribility) {
            this.duribility = duribility;
        }
        
        public void setdps(int dps) {
            this.dps = dps;
        }

        public int getduribility() {
            return duribility;
        }

        public int getdamage() {
            return damage;
        }
        public int getDps() {
            return dps;
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
        
        public int getDx() {
            return dx;
        }
        
        public int getDy() {
            return dy;
        }
        
        public ImageIcon getPic() {
            return pic;
        }

        public Weapons(int xV, int yV, int width, int height, int da, int dur, int dp, ImageIcon p){
            x= xV;
            y=yV;
            w=width;
            h=height;
           damage=da;
           duribility=dur;
           dps=dp; 
            pic= p;
            dx=0;
            dy=0;
            }
            public void drawWeap(Graphics g2d){
                g2d.drawImage(pic.getImage(), x,y,w,h, null);
            }
        
}
