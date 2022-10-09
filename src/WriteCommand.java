import java.util.Scanner;

/**
 * WriteCommand Class
 * 
 * @author Savannah Noblitt
 */

public class WriteCommand extends Command {
    private Scanner in;
    
    /**
     * WriteCommand constructor which calls its super class's constructor
     * 
     * @param doc the document to write t0
     */
    public WriteCommand(Document doc)
    {
        super(doc);
    }

    /**
     * Writes to the document and prints a message to let the user know the action was completed
     * 
     * @return the message for writing to the document
     */
    public String execute()
    {
        System.out.println("Enter text: ");
        String line = document.write(in.nextLine());
        System.out.println();
        return line;
    }
}
