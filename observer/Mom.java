package observer;

/**
 * Mom class
 * @author Eric Burkholder
 */
public class Mom implements Observer {
    private Subject baby;

    public Mom(Subject baby) {
        this.baby = baby;
        baby.registerObserver(this);
    }

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
