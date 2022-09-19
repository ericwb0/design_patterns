package factory;

/**
 * Frosted Flakes class, Cereal subclass
 * @author Eric Burkholder
 */
public class FrostedFlakes extends Cereal {

    /**
     * Calls the Cereal constructor with params specific to Frosted Flakes, then adds its toys to 
     * the toys ArrayList
     */
    public FrostedFlakes() {
        super("Frosted Flakes", 2.99);
        toys.add("Spider man Tattoo");
        toys.add("Barbie Tattoo");
        toys.add("Snap Bracelet");
        toys.add("Happy Feet Figurine");
    }

    /**
     * Returns the generic Cereal prepare line as well as instructions specific to the cereal
     * @return a string formatted as a list of instructions to prepare the cereal
     */
    public String prepare() {
        return super.prepare()+"\t- Gather the grain\n\t- Shape into flakes\n"+
            "\t- Sprinkle with frosting";
    }
}
