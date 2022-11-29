package adapter;

import java.util.ArrayList;

/**
 * CD class
 * @author Eric Burkholder
 */
public class CD implements DigitalAlbum {
    private ArrayList<String> songs;
    private int currentIndex;

    /**
     * Constructor
     * @param songs the songs on the CD
     */
    public CD(ArrayList<String> songs) {
        if(songs == null)
            this.songs = new ArrayList<String>();
        else
            this.songs = songs;
        currentIndex = -1; //nextSong will play from the start
    }

    public String playFromBeginning() {
        if(songs.size() == 0)
            return "No songs on the CD";
        currentIndex = 0;
        return "Playing song 1 "+songs.get(currentIndex);
    }

    public String playSong(int num) {
        if(num < 0 || num >= songs.size())
            return "Not a valid song number";
        return "Playing "+songs.get(num);
    }

    public String prevSong() {
        if(currentIndex < 1) {
            currentIndex = 0;
            return "Playing: " + (currentIndex+1) + ": " + songs.get(currentIndex);
        }
        if(currentIndex > songs.size()) {
            // Current index greater than size- correct this
            currentIndex = songs.size()-1;
        } else {
            currentIndex--;
        }
        return "Skipping back and playing "+songs.get(currentIndex);
    }

    public String nextSong() {
        if(currentIndex < 0 || currentIndex >= songs.size()-1)
            currentIndex = 0;
        else
            currentIndex++;
        return "Playing: " + (currentIndex+1) + ": " + songs.get(currentIndex);
        
    }

    public String stop() {
        return "Stopping";
    }

    public String pause() {
        return "Pausing";
    }
}
