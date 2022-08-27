//CSCE 247 - Eric Burkholder
package strategy;

import java.util.ArrayList;

public abstract class Robot {
    protected String name;
    protected ArrayList<String> character;
    protected MoveBehavior moveBehavior;

    public Robot(String name) {
        this.character = new ArrayList<String>();
        this.name = name;
    }

    public void setMoveBehavior(MoveBehavior moveBehavior) {
        this.moveBehavior = moveBehavior;
    }

    public void move() {
        moveBehavior.move(character);
    }

    public abstract String toString();

    public String getName() {
        return name;
    }
}
