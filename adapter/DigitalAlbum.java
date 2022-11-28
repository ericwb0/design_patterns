package adapter;

/**
 * Digital album interface
 * @author Eric Burkholder
 */
public interface DigitalAlbum {
    /**
     * Plays the first song on the album
     * @return A message with the result
     */
    public String playFromBeginning();

    /**
     * Plays the song corresponding to the specified song number
     * @param num the song number
     * @return A message with the result
     */
    public String playSong(int num);

    /**
     * Plays the song before the current song. Plays first track if at beginning
     * @return A message with the result
     */
    public String prevSong();

    /**
     * Plays the song after the current song. If at the end it loops back to the beginning
     * @return A message with the result
     */
    public String nextSong();

    /**
     * Stops the album
     * @return A message with the result
     */
    public String stop();

    /**
     * Pauses the song
     * @return A message with the result
     */
    public String pause();
}
