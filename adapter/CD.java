package adapter;

import java.util.ArrayList;

/**
 * CD class
 * @author Eric Burkholder
 */
public class CD implements DigitalAlbum {
    private ArrayList<String> songs;
    private int currentIndex;

    public CD(ArrayList<String> songs) {
        if(songs == null)
            this.songs = new ArrayList<String>();
        else
            this.songs = songs;
        currentIndex = 0;
    }

    public String playFromBeginning() {

    }

    public String playSong(int num) {

    }

    public String prevSong() {

    }

    public String nextSong() {

    }

    public String stop() {

    }

    public String pause() {

    }
}
