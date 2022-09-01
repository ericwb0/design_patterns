package observer;

import java.util.ArrayList;
import java.util.Random;

/**
 * Baby class
 * @author Eric Burkholder
 */
public class Baby implements Subject {
    private String name;
    private ArrayList<Observer> observers;
    private Random rand;

    /**
     * Constructs a new Baby instance with the given name, with an empty arrayList of observers
     * @param name A string representing the baby's name
     */
    public Baby(String name) {
        this.name = name;
        this.observers = new ArrayList<Observer>();
        this.rand = new Random();
    }

    /**
     * Accessor method for the baby's name
     * @return a String representation of the baby's name
     */
    public String getName() {
        return this.name;
    }

    /**
     * Observers call this method. It chooses between two options based on RNG output, either a 0 
     * or 1
     */
    public void recieveLove() {
        if(rand.nextInt(2) == 0) { //Either 0 or 1
            System.out.println(name + " feels appreciated and loved.");
        } else {
            System.out.println(name + " pushes everyone away and continues to cry.");
        }
    }

    /**
     * Observers call this method to "feed" the baby. It chooses between two options based on RNG 
     * output, either a 0 or 1
     */
    public void eat() {
        if(rand.nextInt(2) == 0) {
            System.out.println(name + " has a happy full tummy.");
        } else {
            System.out.println(name + " throws all his food on the floor.");
        }
    }

    /**
     * Observers call this method to "change" the baby. Simply prints a message
     */
    public void getChanged() {
        System.out.println(name + " is having a diaper change.");
    }

    /**
     * Called by when Observer objects are instantiated. Adds the observer to the baby's ArrayList
     * @param observer The Observer instance to add
     */
    public void registerObserver(Observer observer) {
        this.observers.add(observer);
    }

    /**
     * Removes the given Observer instance from the observers arrayList.
     * @param observer The Observer instance to remove
     */
    public void removeObserver(Observer observer) {
        this.observers.remove(observer);
    }

    /**
     * Calls the update method for each oberver in the list, providing them with the given Cry
     * @param cry The type of cry (dictates observer actions)
     */
    public void notifyObservers(Cry cry) {
        for(Observer observer : observers) {
            observer.update(cry);
        }
    }

    /**
     * Calls notifyObservers with the angry Cry value and prints an "angry" message
     */
    public void angryCry() {
        System.out.println("Waaaaaaaaaa! " + name + " is feeling abandoned and angry.");
        notifyObservers(Cry.ANGRY);
    }

    /**
     * Calls notifyObservers with the hungry Cry value and prints a "hungry" message
     */
    public void hungryCry() {
        System.out.println("Neh Neh Neh! " + name + " is starving!!!!");
        notifyObservers(Cry.HUNGRY);
    }

    /**
     * Calls notifyObservers with the wet Cry value and prints a "wet" message
     */
    public void wetCry() {
        System.out.println("Aaaaaaaa! " + name + " is WET!");
        notifyObservers(Cry.WET);
    }
}
