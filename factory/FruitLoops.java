package factory;

/**
 * Fruit Loops class, Cereal subclass
 * @author Eric Burkholder
 */
public class FruitLoops extends Cereal {

    /**
     * Calls the Cereal constructor with params specific to Fruit Loops, then adds its toys to 
     * the toys ArrayList
     */
    public FruitLoops() {
        super("Fruit Loops", 1.89);
        toys.add("Paw Patrol Stickers");
        toys.add("Bat Man ring");
        toys.add("Silly Putty");
        toys.add("Tiny Car");
    }

    /**
     * Returns the generic Cereal prepare line as well as instructions specific to the cereal
     * @return a string formatted as a list of instructions to prepare the cereal
     */
    public String prepare() {
        return super.prepare()+"\t- Gather the grain\n\t- Shape into circles\n"+
            "\t- Randomly color circles\n\t- Let circles dry";
    }
}
