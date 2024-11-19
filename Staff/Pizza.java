package Staff;
import javax.swing.*;
import javax.swing.ImageIcon;
import java.awt.*;
import java.awt.event.*;
import java.util.ArrayList;

public class Pizza extends Options {
    private long startTime;
    private boolean taskCompleted = false;

    public Pizza() {
        super(100, 100, 50, 50, new ImageIcon("pizza.png"));
        setItems();
      
    }

    public void setItems() {
        super.addItems(new RequestItems("Get Pizza Dough", 50, 500, 100, 100, new ImageIcon("Pictures/dough.png")));
        super.addItems(new RequestItems("Add Sauce", 55, 500, 100, 100, new ImageIcon("pictures/sauce.png")));
        super.addItems(new RequestItems("Add cheese", 60, 500, 100, 100, new ImageIcon("pictures/cheese.png")));
    }

    // Setup mouse listener to handle interaction with the dough image
    

    // Call this method to check when the task is completed and calculate score
    public void completeTask() {
        if (taskCompleted) {
            long endTime = System.currentTimeMillis();
            long timeTaken = endTime - startTime;
            int score = calculateScore(timeTaken);
            JOptionPane.showMessageDialog(null, "Task Completed in " + timeTaken + " milliseconds. Your score: " + score);
            
        }
    }

    // Calculate score based on time taken
    private int calculateScore(long timeTaken) {
        if (timeTaken < 5000) {
            return 100;  // Excellent, if completed in under 5 seconds
        } else if (timeTaken < 10000) {
            return 75;  // Good, if completed in under 10 seconds
        } else {
            return 50;  // Could be better, if completed in over 10 seconds
        }
    }

}
