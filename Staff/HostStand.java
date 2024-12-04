package Staff;
import javax.swing.ImageIcon;
import java.util.ArrayList;

public class HostStand extends Locations {

    public HostStand() {
        super(0, 0, 1800, 1600, new ImageIcon("pictures/HostStand.png"), "HostStand", new ArrayList<>());
        setName("HostStand");

        // Add the options for the HostStand
        ArrayList<Options> options = new ArrayList<>();
        options.add(new Checks());  // Add the Checks option
        setOptionList(options);     // Set the list of options
    }

    public HostStand(int x, int y) {
        super(x, y, 50, 50, new ImageIcon("pictures/HostStand.png"), "HostStand", new ArrayList<>());
        
        // Add the options for the HostStand
        ArrayList<Options> options = new ArrayList<>();
        options.add(new Checks());  // Add the Checks option
        setOptionList(options);     // Set the list of options
    }
}
