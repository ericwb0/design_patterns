package observer;

import java.util.Random;

/**
 * Dad class
 * @author Eric Burkholder
 */
public class Dad implements Observer {
    private Subject baby;
    private Random rand;

    /**
     * Creates an instance of the Dad class with the given baby. Then, registers itself with the 
     * baby and instantiates a random number generator
     * @param baby The baby subject that this class observes
     */
    public Dad(Subject baby) {
        this.baby = baby;
        baby.registerObserver(this);
        this.rand = new Random();
    }

    /**
     * Prints a reaction message based on random number generator output [0,3) for 3 possible 
     * outcomes.
     * @param cry The value of cry that the passes to the observer. NOTE: This is not used in the 
     * Dad class, but this parameter is required of all Observer instances.
     */
    public void update(Cry cry) {
        int choice = rand.nextInt(3); // Chooses between 0, 1, 2 for 3 choices
        switch(choice) {
            case 0:
                System.out.println("Dad puts a pillow over his head");
                break;
            case 1:
                System.out.println("Dad nudges mom");
                break;
            default: // Only 1 other option: 2
                System.out.println("Dad screams .... aaaaa");
                break;
        }
    }
}
