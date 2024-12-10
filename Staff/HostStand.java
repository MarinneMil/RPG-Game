package Staff;
import javax.swing.ImageIcon;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Queue;

public class HostStand extends Locations {

    public HostStand() {
        super(0, 0, 1800, 1600, new ImageIcon("pictures/HostStand.png"), "HostStand");
        setName("HostStand");

        // Add the options for the HostStand
        ArrayList<Options> options = new ArrayList<>();
        options.add(new Checks());  // Add the Checks option
        Collections.shuffle(options);
        setOptionList(setQueue(options));     }

    public HostStand(int x, int y) {
        super(x, y, 50, 50, new ImageIcon("pictures/HostStand.png"), "HostStand");
        
        // Add the options for the HostStand
        ArrayList<Options> options = new ArrayList<>();
        options.add(new Checks());  // Add the Checks option
        Collections.shuffle(options);
        setOptionList(setQueue(options));     }
}
