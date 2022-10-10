import java.util.HashMap;

/**
 * 
 * @author wyattcarhart
 *
 */
public class InputHandler {
	
	/**
	 * The String associated with each command
	 */
	public static final String[] KEYS = {"append","write","view","save"};
    
	private HashMap<String,Command> commands;
	
	/**
	 * Creates a new InputHandler for the specified document; adds Commands to commands
	 * 
	 * @param document the document for the commands to be executed on
	 */
	public InputHandler(Document document) {
		commands = new HashMap<String,Command>();
		initCommands(document);
	}
	
	private void initCommands(Document document) {
		commands.put(KEYS[0], new AppendCommand(document));
		commands.put(KEYS[1], new WriteCommand(document));
		commands.put(KEYS[2], new ViewCommand(document));
		commands.put(KEYS[3], new SaveCommand(document));
	}
	
	/**
	 * Finds the command that corresponds to the input and executes the command on its document.
	 * prints the output of the command's execute() method. if the input does not match a command
	 * or it matches a null command, displays an error message.
	 * 
	 * @param data the input
	 */
	public void inputEntered(String data) {
		Command command = commands.get(data.toLowerCase());
		if(command == null) {
			System.out.println("Sorry, we don't recognize that command.");
			return;
		}
		System.out.println(command.execute());
		System.out.println(); // Extra endline for readability
	}
}
