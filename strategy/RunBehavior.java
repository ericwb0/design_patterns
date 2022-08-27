//CSCE 247 - Eric Burkholder
package strategy;

import java.util.ArrayList;

/**
 * Run movement behavior
 * @author Eric Burkholder
 */
public class RunBehavior extends MoveBehavior {

    /**
     * Calls the moveBehavior parent move() method with the running speed
     */
    public void move(ArrayList<String> character) {
        super.move(character, 1200);
    }
}
