package observer;

import java.util.ArrayList;
import java.util.Random;

/**
 * Baby class
 * @author Eric Burkholder
 */
public class Baby implements Subject{
    private String name;
    private ArrayList<Observer> observers;
    private Random rand;

    public Baby(String name) {
        this.name = name;
        this.observers = new ArrayList<Observer>();
        this.rand = new Random();
    }

    public String getName() {
        return this.name;
    }

    public void recieveLove() {
        if(rand.nextInt(2) == 0) { //Either 0 or 1
            System.out.println(name + " feels appreciated and loved.");
        } else {
            System.out.println(name + " pushes everyone away and continues to cry.");
        }
    }

    public void eat() {
        if(rand.nextInt(2) == 0) {
            System.out.println(name + " has a happy full tummy.");
        } else {
            System.out.println(name + " throws all his food on the floor.");
        }
    }

    public void getChanged() {
        System.out.println(name + " is having a diaper change.");
    }

    public void registerObserver(Observer observer) {
        this.observers.add(observer);
    }

    public void removeObserver(Observer observer) {
        this.observers.remove(observer);
    }

    public void notifyObservers(Cry cry) {
        for(Observer observer : observers) {
            observer.update(cry);
        }
    }

    public void angryCry() {
        System.out.println("Waaaaaaaaaa! " + name + " is feeling abandoned and angry.");
        notifyObservers(Cry.ANGRY);
    }

    public void hungryCry() {
        System.out.println("Neh Neh Neh! " + name + " is starving!!!!");
        notifyObservers(Cry.HUNGRY);
    }

    public void wetCry() {
        System.out.println("Aaaaaaaa! " + name + " is WET!");
        notifyObservers(Cry.WET);
    }
}
