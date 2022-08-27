package strategy;

import java.util.ArrayList;

/**
 * Robot abstract parent class
 * @author Eric Burkholder
 */
public abstract class Robot {
    protected String name;
    protected ArrayList<String> character;
    protected MoveBehavior moveBehavior;

    /**
     * Creates a robot with the indicated name
     * @param name of the robot
     */
    public Robot(String name) {
        this.character = new ArrayList<String>();
        this.name = name;
    }

    /**
     * Setter method for the moveBehavior
     * @param moveBehavior the new moveBehavior for the robot
     */
    public void setMoveBehavior(MoveBehavior moveBehavior) {
        this.moveBehavior = moveBehavior;
    }

    /**
     * Calls the move() method for a robot's specific moveBehavior
     */
    public void move() {
        moveBehavior.move(character);
    }

    public abstract String toString();

    /**
     * Getter method for the name of the robot
     * @return the name of the robot as a String
     */
    public String getName() {
        return name;
    }
}
