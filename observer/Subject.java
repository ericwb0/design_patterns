package observer;

/**
 * Subject interface
 * @author Eric Burkholder
 */
public interface Subject {
    public void registerObserver(Observer observer);
    public void removeObserver(Observer observer);
    public void notifyObservers(Cry cry);
}