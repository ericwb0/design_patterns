//CSCE 247 - Eric Burkholder
package strategy;

import java.util.ArrayList;

/**
 * Walk movement behavior
 * @author Eric Burkholder
 */
public class WalkBehavior extends MoveBehavior {

    /**
     * Calls the moveBehavior parent move() method with the walking speed
     */
    public void move(ArrayList<String> character) {
        super.move(character, 600);
    }
}
