//CSCE 247 - Eric Burkholder
package strategy;

public class iRobot extends Robot {
    public iRobot(String name) {
        super(name);
        character.add("( )");
        character.add("\\|/");
        character.add("/ \\");
        this.moveBehavior = new RunBehavior();
    }

    public String toString() {
        return name + " is an iRobot";
    }
}
