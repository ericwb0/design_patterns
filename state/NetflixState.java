package state;
/**
 * NetflixState class
 * 
 * @author Eric Burkholder
 */
public class NetflixState implements State {
    private TV tv;
    private String[] movies = {"The Land Before Time", "Frozen", "The Little Mermaid", "Ice Age"};
    private String[] tvShows = {"Peppa Pig", "My Little Pony", "Garfield", "Teenage Mutant Ninja Turtles"};

    /**
     * Constructor
     * @param tv the TV to attach the state to. If null, the state will create a new TV.
     */
    public NetflixState(TV tv) {
        if(tv == null)
            tv = new TV();
        this.tv = tv;
    }

    public String pressHomeButton() {
        tv.setState(tv.getHomeState());
        return "Loading the Home screen...\n";
    }

    public String pressNetflixButton() {
        return "You are already on Netflix!\n";
    }

    public String pressHuluButton() {
        tv.setState(tv.getHuluState());
        return "Loading Hulu...\n";
    }

    public String pressMovieButton() {
        StringBuilder sb = new StringBuilder();
        sb.append("Netflix Movies:\n");
        for(String movie : movies) {
            sb.append("- ");
            sb.append(movie);
            sb.append("\n");
        }
        return sb.toString();
    }

    public String pressTVButton() {
        StringBuilder sb = new StringBuilder();
        sb.append("Netflix TV Shows:\n");
        for(String show : tvShows) {
            sb.append("- ");
            sb.append(show);
            sb.append("\n");
        }
        return sb.toString();
    }
}
