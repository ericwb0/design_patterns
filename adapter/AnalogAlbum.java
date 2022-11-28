package adapter;

/**
 * AnalogAlbum interface
 * @author Eric Burkholder
 */
public interface AnalogAlbum {

    /**
     * Plays the song at the current index. Requires a rewind at the end of the album.
     * @return A message with the result
     */
    public String play();
    
    /**
     * Rewinds the album by 1 song. Cannot rewind if at the beginning
     * @return A message with the result
     */
    public String rewind();
    
    /**
     * Fast-forwards by 1 song. Cannot fast-forward at the end of the album.
     * @return A message with the result
     */
    public String ffwd();
    
    /**
     * Pauses the current song.
     * @return A message with the result
     */
    public String pause();

    /**
     * Stops and ejects the analog album
     * @return A message with the result
     */
    public String stopEject();
}
