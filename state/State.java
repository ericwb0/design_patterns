package state;
/**
 * State interface
 * 
 * @author Eric Burkholder
 */
public interface State {
    public String pressHomeButton();
    public String pressNetflixButton();
    public String pressHuluButton();
    public String pressMovieButtonString();
    public String pressTVButton();
}
