import java.util.Scanner;

/**
 * WriteCommand Class
 * 
 * @author Savannah Noblitt
 */

public class WriteCommand extends Command {
    private Scanner in;
    
    /**
     * WriteCommand constructor which calls its super class's constructor and instantiates the
     * scanner
     * 
     * @param doc the document to write t0
     */
    public WriteCommand(Document doc)
    {
        super(doc);
        in = new Scanner(System.in);
    }

    /**
     * Writes to the document and prints a message to let the user know the action was completed
     * 
     * @return the message for writing to the document
     */
    public String execute()
    {
        System.out.print("Enter text: ");
        String line = document.write(in.nextLine());
        return line;
    }
}
