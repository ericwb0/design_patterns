package factory;

import java.util.ArrayList;
import java.util.Random;

/**
 * Abstract cereal class
 * @author Eric Burkholder
 */
public abstract class Cereal {
    protected String name;
    protected double price;
    protected ArrayList<String> toys;

    /**
     * Cereal constructor that sets the name and price, and initializes the toys ArrayList
     * @param name Name of the cereal
     * @param price Price of the cereal
     */
    public Cereal(String name, double price) {
        this.name = name;
        this.price = price;
        this.toys = new ArrayList<String>();
    }

    /**
     * Returns a string announcing the preparation of the cereal. Meant to be used in conjunction
     * with a prepare method specific to a subclass
     * @return A string "Preparing the <cereal name>"
     */
    public String prepare() {
        return "Preparing the "+name+"\n";
    }

    /**
     * Lists steps in boxing the cereal and picks a random toy from the toys ArrayList
     * @return A string listing the boxing steps
     */
    public String boxCereal() {
        Random r = new Random();
        return "Boxing the "+name+"\n\t- Drawing fun pictures of "+name+" on the box\n"+
            "\t- Pouring the "+name+" into the box\n\t- Adding the surprise "+
            toys.get(r.nextInt(toys.size()));
    }

    /**
     * Returns a string describing the step of pricing the cereal
     * @return a string decribing pricing including the cereal's name and price
     */
    public String priceCereal() {
        return "Putting the price of $"+price+" on the "+name+" box.";
    }
}
