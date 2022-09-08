package decorator;

/**
 * Christmas Tree class
 * @author Eric Burkholder
 */
public class ChristmasTree extends Tree {
    public ChristmasTree() {
        super(FileReader.getLines("decorator/txt/tree.txt"));
    }

    public String toString() {
        return super.toString();
    }
}
