package factory;

public class LuckyCharms extends Cereal {
    public LuckyCharms() {
        super("Lucky Charms", 1.55);
        toys.add("My Little Pony Stickers");
        toys.add("Elsa ring");
        toys.add("Play doe");
        toys.add("Tiny truck");
    }

    public String prepare(){
        return super.prepare()+"\t- Gather the grain\n\t- Shape into Xs and Os\n"+
            "\t- Create marshmallow shapes\n\t- Mix grain and marshmallows";
    }
}
