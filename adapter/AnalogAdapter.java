package adapter;

import java.util.ArrayList;

/**
 * Analog adapter class
 * @author Eric Burkholder
 */
public class AnalogAdapter implements AnalogAlbum {
    private DigitalAlbum album;

    /**
     * Constructor
     * @param album the album to insert into the adapter
     */
    public AnalogAdapter(DigitalAlbum album) {
        if(album == null)
            this.album = new CD(new ArrayList<String>());
        else 
            this.album = album;
    }

    public String play() {
        return album.nextSong();
    }

    public String rewind() {
        return album.prevSong();
    }

    public String ffwd() {
        return play();
    }

    public String pause() {
        return album.pause();
    }

    public String stopEject() {
        return album.stop();
    }
}
