package observer;

import java.util.Random;

/**
 * Dad class
 * @author Eric Burkholder
 */
public class Dad implements Observer {
    private Subject baby;
    private Random rand;

    public Dad(Subject baby) {
        this.baby = baby;
        baby.registerObserver(this);
        this.rand = new Random();
    }

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
