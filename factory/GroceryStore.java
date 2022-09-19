package factory;

/**
 * Grocery Store class
 * @author Eric Burkholder
 */
public class GroceryStore {

    /**
     * Returns a cereal object based on a string representation input
     * @param type The type of cereal as a string ie. "Lucky Charms"
     * @return An initialized Cereal object of the requested type. Null if there is not object to
     * match the string
     */
    public Cereal createCereal(String type) {
        switch(type.toLowerCase()) {
            case "frosted flakes": return new FrostedFlakes();
            case "fruit loops": return new FruitLoops();
            case "lucky charms": return new LuckyCharms();
            default: return null;
        }
    }
}
