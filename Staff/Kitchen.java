package Staff;
import javax.swing.ImageIcon;
import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.Queue;

public class Kitchen extends Locations {

    public Kitchen() {
        super(0, 0, 1800, 1600, new ImageIcon("pictures/Kitchen.jpg"), "Kitchen");
        setName("Kitchen");

        // Add multiple options to the Kitchen
        ArrayList<Options> options = new ArrayList<>();
        options.add(new Pizza());
    
        Collections.shuffle(options);
        setOptionList(setQueue(options)); 
        System.out.println("Pizza test "+super.getOptionList().element());    // Set the list of options;

        // Set the list of options
    }

    public Kitchen(int x, int y) {
        super(x, y, 50, 50, new ImageIcon("kitchen.jpg"), "Kitchen");
        
        // Add multiple options to the Kitchen
        ArrayList<Options> options = new ArrayList<>();
        options.add(new Pizza());
        options.add(new Dishes());  // Add the pizza option;
        Collections.shuffle(options);
        setOptionList(setQueue(options));
        System.out.println("Pizza test "+super.getOptionList().element());    // Set the list of options;
    }


}
