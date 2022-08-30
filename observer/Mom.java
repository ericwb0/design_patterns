package observer;

/**
 * Mom class
 * @author Eric Burkholder
 */
public class Mom implements Observer {
    private Subject baby;

    public Mom(Subject baby) {
        this.baby = baby;
    }

    public void update(Cry cry) {

    } 
}
