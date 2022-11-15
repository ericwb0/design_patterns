package state;
/**
 * State interface
 * 
 * @author Eric Burkholder
 */
public interface State {
    /**
     * Displays what happens when pressing the home button and changes tv's state if necessary.
     * @return a String with the result
     */
    public String pressHomeButton();

    /**
     * Displays what happens when pressing the Netflix button and changes tv's state if necessary.
     * @return a String with the result
     */
    public String pressNetflixButton();

    /**
     * Displays what happens when pressing the Hulu button and changes tv's state if necessary.
     * @return a String with the result
     */
    public String pressHuluButton();

    /**
     * Returns a list of all the state's movies. If the state is not an app, no list displays.
     * @return a String with all the app's movies or an error message if not an app
     */
    public String pressMovieButton();

    /**
     * Returns a list of all the state's tv shows. If the state is not an app, no list displays.
     * @return a String with all the app's tv shows or an error message if not an app
     */
    public String pressTVButton();
}
