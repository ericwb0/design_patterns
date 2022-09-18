package factory;

public class GroceryStore {
    public Cereal createCereal(String type) {
        switch(type.toLowerCase()) {
            case "frosted flakes": return new FrostedFlakes();
            case "fruit loops": return new FruitLoops();
            case "lucky charms": return new LuckyCharms();
            default: return null;
        }
    }
}
