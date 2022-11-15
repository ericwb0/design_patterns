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

    public TV() {

    }

    public String pressHomeButton() {
        return "";
    }

    public String pressNetflixButton() {
        return "";
    }

    public String pressHuluButton() {
        return "";
    }

    public String pressMovieButtonString() {
        return "";
    }

    public String pressTVButton() {
        return "";
    }

    public void setState(State state) {
        this.state = state;
    }

    public State getHomeState() {
        return homeState;
    }

    public State getNetflixState() {
        return netflixState;
    }

    public State getHuluState() {
        return huluState;
    }
}
