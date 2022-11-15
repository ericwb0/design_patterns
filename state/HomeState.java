package state;
/**
 * HomeState class
 * 
 * @author
 */
public class HomeState implements State {
    private TV tv;

    /**
     * Constructor
     * @param tv the TV to attach the state to. If null, the state will create a new TV.
     */
    public HomeState(TV tv) {
        if(tv == null)
            tv = new TV();
        this.tv = tv;
    }

    public String pressHomeButton() {
        return "TV is already on home screen\n";
    }

    public String pressNetflixButton() {
        tv.setState(tv.getNetflixState());
        return "Loading Netflix...\n";
    }

    public String pressHuluButton() {
        tv.setState(tv.getHuluState());
        return "Loading Hulu...\n";
    }

    public String pressMovieButton() {
        return "You must select an app to view movies!\n";
    }

    public String pressTVButton() {
        return "You must select an app to view TV shows!\n";
    }
}
