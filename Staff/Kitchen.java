package Staff;
import javax.swing.ImageIcon;
import java.util.ArrayList;

public class Kitchen extends Locations {

    public Kitchen() {
        super(0, 0, 1800, 1600, new ImageIcon("pictures/Kitchen.jpg"), "Kitchen", new ArrayList<>());
        setName("Kitchen");

        // Add multiple options to the Kitchen
        ArrayList<Options> options = new ArrayList<>();
        options.add(new Pizza());  // Add the pizza option
        setOptionList(options);    // Set the list of options
    }

    public Kitchen(int x, int y) {
        super(x, y, 50, 50, new ImageIcon("kitchen.jpg"), "Kitchen", new ArrayList<>());
        
        // Add multiple options to the Kitchen
        ArrayList<Options> options = new ArrayList<>();
        options.add(new Pizza());  // Add the pizza option
        setOptionList(options);    // Set the list of options
    }
}
