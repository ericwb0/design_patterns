package observer;

import java.util.Random;

import javax.sound.sampled.UnsupportedAudioFileException;

/**
 * Dad class
 * @author Eric Burkholder
 */
public class Dad implements Observer {
    private Subject baby;
    private Random rand;

    public Dad(Subject baby) {
        this.baby = baby;
        this.rand = new Random();
    }

    public void update(Cry cry) {

    }
}
