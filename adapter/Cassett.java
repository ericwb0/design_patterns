package adapter;

import java.util.ArrayList;

/**
 * Cassett class
 * @author Eric Burkholder
 */
public class Cassett implements AnalogAlbum {
    private ArrayList<String> songs;
    private int currentIndex;

    public Cassett(ArrayList<String> songs) {
        if(songs == null)
            this.songs = new ArrayList<String>();
        else
            this.songs = songs;
        currentIndex = 0;
    }

    public String play() {
        if(currentIndex < songs.size())
            return "Playing song "+currentIndex;
        return "At the end of the cassette you need to rewind";
    }

    public String rewind() {
        if(currentIndex != 0) {
            currentIndex--;
            return "Rewinding to song "+currentIndex;
        }
        return "Fully Re-wound";
    }

    public String ffwd() {
        if(currentIndex >= songs.size())
            return "At the end of the cassette you need to rewind";
        currentIndex++;
        if(currentIndex == songs.size())
            return "Forwarded to the end of the cassette";
        return "Forward to song "+currentIndex;
    }

    public String pause() {
        return "Pausing...";
    }

    public String stopEject() {
        return "Stopping cassette and ejecting";
    }
}
