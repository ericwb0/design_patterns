package strategy;

/**
 * Dog robot child class. Has crawling behavior.
 * @author Eric Burkholder
 */
public class DogRobot extends Robot {

    /**
     * Creates an instance of DogRobot with the indicated name
     * @param name of the robot
     */
    public DogRobot(String name) {
        super(name);
        this.character.add("++o");
        this.moveBehavior = new CrawlBehavior();
    }

    /**
     * Provides a String representation of the Dog Robot
     * @return A String consisting of the name and type of the robot
     */
    public String toString() {
        return name + " is a dog robot";
    }
}
