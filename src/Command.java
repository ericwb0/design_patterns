/**
 * Abstract Command Class
 * 
 * @author Savannah Noblitt
 */

public abstract class Command {
    protected Document document;

    public Command(Document document)
    {
        this.document = document;
    }

    /**
     * An abstract execute method
     * 
     * @return a String which notifies the user of which command was executed
     */
    public abstract String execute();
    
}
