//CSCE 247 - Eric Burkholder
package strategy;

import java.util.ArrayList;

public class WalkBehavior extends MoveBehavior {
    public void move(ArrayList<String> character) {
        super.move(character, 600);
    }
}
