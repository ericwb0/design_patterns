package factory;

public class FruitLoops extends Cereal {
    public FruitLoops() {
        super("Fruit Loops", 1.89);
        toys.add("Paw Patrol Stickers");
        toys.add("Bat Man ring");
        toys.add("Silly Putty");
        toys.add("Tiny Car");
    }

    public String prepare() {
        return super.prepare()+"\t- Gather the grain\n\t- Shape into circles\n"+
            "\t- Randomly color circles\n\t- Let circles dry";
    }
}
