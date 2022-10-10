/**
 * 
 * @author Joshua Dietrich
 * 
 */
public class SaveCommand extends Command {
    
    /**
     * Constructor for SaveCommand. Calls the Commmand superclass constructor
     * 
     * @param doc the Document that the command will save to
     */
    public SaveCommand(Document doc)
    {
        super(doc);
    }

    public String execute()
    {
        return document.save();
    }
}
