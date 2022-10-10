import java.util.Scanner;

/**
 * AppendCommand class
 * 
 * @author Eric Burkholder
 */
public class AppendCommand extends Command {
    private Scanner in;

    /**
     * Constructor for AppendCommand. Calls the Commmand superclass constructor and instantiates
     * the scanner
     * 
     * @param doc the Document that the command will append to
     */
    public AppendCommand(Document doc)
    {
        super(doc);
        in = new Scanner(System.in);
    }

    /**
     * Takes user input and calls Document.append() with the input
     * 
     * @return the result message of the document append operation
     */
    public String execute()
    {   
        System.out.print("Enter text: ");
        String ret = document.append(in.nextLine());
        return ret;
    }
}
