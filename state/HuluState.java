package state;
/**
 * HuluState class
 * 
 * @author Eric Burkholder
 */
public class HuluState implements State {
    private TV tv;
    private String[] movies = {"Cars", "Cinderella", "Wall-E", "ET"};
    private String[] tvShows = {"Sesame Street", "Care Bears", "Looney Tunes"};
    
    /**
     * Constructor
     * @param tv the TV to attach the state to. If null, the state will create a new TV.
     */
    public HuluState(TV tv) {
        if(tv == null)
            tv = new TV();
        this.tv = tv;
    }

    public String pressHomeButton() {
        tv.setState(tv.getHomeState());
        return "Loading the Home screen...\n";
    }

    public String pressNetflixButton() {
        tv.setState(tv.getNetflixState());
        return "Loading Netflix...\n";
    }

    public String pressHuluButton() {
        return "You are already on Hulu!\n";
    }

    public String pressMovieButton() {
        StringBuilder sb = new StringBuilder();
        sb.append("Hulu Movies:\n");
        for(String movie : movies) {
            sb.append("- ");
            sb.append(movie);
            sb.append("\n");
        }
        return sb.toString();
    }

    public String pressTVButton() {
        StringBuilder sb = new StringBuilder();
        sb.append("Hulu TV Shows:\n");
        for(String show : tvShows) {
            sb.append("- ");
            sb.append(show);
            sb.append("\n");
        }
        return sb.toString();
    }
}
