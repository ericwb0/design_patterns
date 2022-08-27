package strategy;

/**
 * Human robot child class. Has walking behavior
 * @author Eric Burkholder
 */
public class HumanRobot extends Robot {

    /**
     * Creates an instance of HumanRobot with the indicated name
     * @param name of the robot
     */
    public HumanRobot(String name) {
        super(name);
        character.add(" 0 ");
        character.add("-|-");
        character.add("/ \\"); // backslash escape char
        moveBehavior = new WalkBehavior();
    }

    /**
     * Provides a String representation of the Human Robot
     * @return A String consisting of the name and type of the robot
     */
    public String toString() {
        return name + " is a human robot";
    }
}
