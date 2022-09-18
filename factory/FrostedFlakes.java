package factory;

public class FrostedFlakes extends Cereal {
    public FrostedFlakes() {
        super("Frosted Flakes", 2.99);
        toys.add("Spider man Tattoo");
        toys.add("Barbie Tattoo");
        toys.add("Snap Bracelet");
        toys.add("Happy Feet Figurine");
    }

    public String prepare() {
        return super.prepare()+"\t- Gather the grain\n\t- Shape into flakes\n"+
            "\t- Sprinkle with frosting";
    }
}
