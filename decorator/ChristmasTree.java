package decorator;

/**
 * Christmas Tree class. A tree instance that has the lines set to the content of the indicated
 * file.
 * @author Eric Burkholder
 */
public class ChristmasTree extends Tree {

    /**
     * Constructor that automatically sets lines to a preset file.
     */
    public ChristmasTree() {
        super(FileReader.getLines("decorator/txt/tree.txt"));
    }

    /**
     * Returns a String with each line in the lines ArrayList with endlines in between.
     * @return the String representation of the tree.
     */
    public String toString() {
        return super.toString();
    }
}
