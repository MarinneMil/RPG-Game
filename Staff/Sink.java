package Staff;

import javax.swing.ImageIcon;
import java.util.ArrayList;
import java.util.Collections;

public class Sink extends Locations {

    public Sink() {
        super(0, 0, 1800, 1600, new ImageIcon("pictures/Sink.jpg"), "Sink");
        setName("Sink");

        // Set the options for this location
        ArrayList<Options> options = new ArrayList<>();
        options.add(new Dishes());
                Collections.shuffle(options);
        setOptionList(setQueue(options)); 
    }

    public Sink(int x, int y) {
        super(x, y, 50, 50, new ImageIcon("pictures/Sink.jpg"), "Sink");

        // Set the options for this location
        ArrayList<Options> options = new ArrayList<>();
        options.add(new Orders());
        Collections.shuffle(options);
        setOptionList(setQueue(options)); 
    }
  }