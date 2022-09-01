package observer;

/**
 * Observer interface
 * @author Eric Burkholder
 */
public interface Observer {

    /**
     * This will be the method that the Subject calls to illicit a response from the Observer
     * @param cry The cry value that observers can use to differentiate between actions.
     */
    public void update(Cry cry);
}
