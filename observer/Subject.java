package observer;

/**
 * Subject interface
 * @author Eric Burkholder
 */
public interface Subject {

    /**
     * Used to relate the Subject with a given Observer
     * @param observer The Observer instance to relate the Subject to
     */
    public void registerObserver(Observer observer);

    /**
     * Used to delete a relation between the Subject and given Observer
     * @param observer The Observer instance to delete the relation
     */
    public void removeObserver(Observer observer);

    /**
     * The method the Subject will use to communicate with its registered Observers
     * @param cry The Cry value to send to observers. The Observer implementations can use this 
     * to produce different results
     */
    public void notifyObservers(Cry cry);
}