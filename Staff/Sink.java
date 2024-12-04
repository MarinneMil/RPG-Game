package Staff;

import javax.swing.ImageIcon;
import java.util.ArrayList;

public class Sink extends Locations {

    public Sink() {
        super(0, 0, 1800, 1600, new ImageIcon("pictures/Sink.jpg"), "Sink", new ArrayList<Options>());
        setName("Sink");

        // Set the options for this location
        ArrayList<Options> options = new ArrayList<>();
        options.add(new Orders());
        setOptionList(options);
    }

    public Sink(int x, int y) {
        super(x, y, 50, 50, new ImageIcon("pictures/Sink.jpg"), "Sink", new ArrayList<Options>());

        // Set the options for this location
        ArrayList<Options> options = new ArrayList<>();
        options.add(new Orders());
        setOptionList(options);
    }
  }