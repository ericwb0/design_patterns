/**
 * 
 * @author Joshua Dietrich
 * 
 */
public class SaveCommand extends Command {
    
    //May need code added, just removing inheritance errors
    public SaveCommand(Document doc)
    {
        super(doc);
    }

    public String execute()
    {
        return document.save();
    }
}
