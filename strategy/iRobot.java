package strategy;

/**
 * iRobot child class. Has running behavior
 * @author Eric Burkholder
 */
public class iRobot extends Robot {

    /**
     * Creates an instance of iRobot with the indicated name
     * @param name of the robot
     */
    public iRobot(String name) {
        super(name);
        character.add("( )");
        character.add("\\|/");
        character.add("/ \\");
        this.moveBehavior = new RunBehavior();
    }
    
    /**
     * Provides a String representation of the iRobot
     * @return A String consisting of the name and type of the robot
     */
    public String toString() {
        return name + " is an iRobot";
    }
}
