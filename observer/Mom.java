package observer;

/**
 * Mom class
 * @author Eric Burkholder
 */
public class Mom implements Observer {
    private Subject baby;

    /**
     * Creates an instance of the Momk class with the given baby. Then, registers itself with the 
     * baby
     * @param baby The baby subject that this class observes
     */
    public Mom(Subject baby) {
        this.baby = baby;
        baby.registerObserver(this);
    }

    /**
     * Prints a reaction message based on the cry value passed in, and then calls the 
     * corresponding method in the baby instance.
     * @param cry The value of cry that the passes to the observer, dictating the mom's response
     */
    public void update(Cry cry) {
        switch(cry) {
            case ANGRY: 
                System.out.println("Mom hugs " + ((Baby)baby).getName());
                ((Baby)baby).recieveLove();
                break;
            case HUNGRY: 
                System.out.println("Mom feeds " + ((Baby)baby).getName());
                ((Baby)baby).eat();
                break;
            case WET: 
                System.out.println("Mom changes " + ((Baby)baby).getName());
                ((Baby)baby).getChanged();
                break;
        }
    } 
}
