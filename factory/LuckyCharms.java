package factory;

/**
 * Lucky Charms class, Cereal subclass
 * @author Eric Burkholder
 */
public class LuckyCharms extends Cereal {

    /**
     * Calls the Cereal constructor with params specific to Lucky Charms, then adds its toys to 
     * the toys ArrayList
     */
    public LuckyCharms() {
        super("Lucky Charms", 1.55);
        toys.add("My Little Pony Stickers");
        toys.add("Elsa ring");
        toys.add("Play doe");
        toys.add("Tiny truck");
    }

    /**
     * Returns the generic Cereal prepare line as well as instructions specific to the cereal
     * @return a string formatted as a list of instructions to prepare the cereal
     */
    public String prepare(){
        return super.prepare()+"\t- Gather the grain\n\t- Shape into Xs and Os\n"+
            "\t- Create marshmallow shapes\n\t- Mix grain and marshmallows";
    }
}
