/**
 * 
 * @author wyattcarhart
 *
 */

public class ViewCommand extends Command {
   
    /**
     * calls superclass constructor Command(doc)
     * @param doc specifies the Command's Document
     */
    public ViewCommand(Document doc)
    {
        super(doc);
    }

    /**
     * returns the output of document.view()
     */
    public String execute()
    {
        return document.view();
    }
}
