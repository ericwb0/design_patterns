package factory;

import java.util.ArrayList;
import java.util.Random;

public abstract class Cereal {
    protected String name;
    protected double price;
    protected ArrayList<String> toys;

    public Cereal(String name, double price) {
        this.name = name;
        this.price = price;
        this.toys = new ArrayList<String>();
    }

    public String prepare() {
        return "Preparing the "+name+"\n";
    }

    public String boxCereal() {
        Random r = new Random();
        return "Boxing the "+name+"\n\t- Drawing fun pictures of "+name+" on the box\n"+
            "\t- Pouring the "+name+" into the box\n\t- Adding the surprise "+
            toys.get(r.nextInt(toys.size()));
    }

    public String priceCereal() {
        return "Putting the price of $"+price+" on the "+name+" box.";
    }
}
