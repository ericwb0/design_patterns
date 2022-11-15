package state;
/**
 * TV class
 * 
 * @author Eric Burkholder
 */
public class TV {
    private State homeState;
    private State netflixState;
    private State huluState;
    private State state;

    /**
     * Constructor. Creates state instances and attaches itself to them. Starts on home screen.
     */
    public TV() {
        homeState = new HomeState(this);
        netflixState = new NetflixState(this);
        huluState = new HuluState(this);
        state = homeState;
    }

    /**
     * Presses the home button. Results depend on the state.
     * @return a String with the result
     */
    public String pressHomeButton() {
        return state.pressHomeButton();
    }

    /**
     * Presses the Netflix button. Results depend on the state.
     * @return a String with the result
     */
    public String pressNetflixButton() {
        return state.pressNetflixButton();
    }

    /**
     * Presses the Hulu button. Results depend on the state.
     * @return a String with the result
     */
    public String pressHuluButton() {
        return state.pressHuluButton();
    }

    /**
     * Presses the movies button. Results depend on the state.
     * @return a String with the result
     */
    public String pressMovieButton() {
        return state.pressMovieButton();
    }

    /**
     * Presses the TV shows button. Results depend on the state.
     * @return a String with the result
     */
    public String pressTVButton() {
        return state.pressTVButton();
    }

    /**
     * Sets the tv's state to the specified state
     * @param state
     */
    public void setState(State state) {
        this.state = state;
    }

    /**
     * @return the TV's home state instance
     */
    public State getHomeState() {
        return homeState;
    }

    /**
     * @return the TV's home state instance
     */
    public State getNetflixState() {
        return netflixState;
    }

    /**
     * @return the TV's home state instance
     */
    public State getHuluState() {
        return huluState;
    }
}
