package Staff;
import javax.swing.ImageIcon;
import java.util.ArrayList;
import java.util.Collections;

public class Table extends Locations {

    public Table() {
        super(0, 0, 1800, 1600, new ImageIcon("pictures/Table.png"), "Table");
        setName("Table");

        // Set the options for this location
        ArrayList<Options> options = new ArrayList<>();
        options.add(new Orders());
        Collections.shuffle(options);
        setOptionList(setQueue(options)); 
    }

    public Table(int x, int y) {
        super(x, y, 50, 50, new ImageIcon("pictures/Table.png"), "Table");

        // Set the options for this location
        ArrayList<Options> options = new ArrayList<>();
        options.add(new Orders());
                Collections.shuffle(options);
        setOptionList(setQueue(options)); 
    }
}
