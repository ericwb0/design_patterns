package observer;

import java.util.ArrayList;
import java.util.Random;

import javax.xml.namespace.QName;

/**
 * Baby class
 * @author Eric Burkholder
 */
public class Baby implements Subject{
    private String name;
    private ArrayList observers;
    private Random rand;

    public Baby(String name) {
        this.name = name;
    }

    public String getName() {
        return this.name;
    }

    public void recieveLove() {

    }

    public void eat() {

    }

    public void getChanged() {

    }

    public void registerObserver(Observer observer) {

    }

    public void removeObserver(Observer observer) {

    }

    public void notifyObservers(Cry cry) {

    }

    public void angryCry() {

    }

    public void hungryCry() {
        
    }

    public void wetCry() {
        
    }
}
