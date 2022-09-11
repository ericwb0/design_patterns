package decorator;

import java.util.ArrayList;

/**
 * Tree class. Users cannot instantiate.
 * @author Eric Burkholder
 */
public abstract class Tree {
    protected ArrayList<String> lines;

    /**
     * The general tree constructor. Every subclass must pass lines to the constructor.
     * @param lines An ArrayList containing each line of the string representation of the tree.
     */
    public Tree(ArrayList<String> lines) {
        this.lines = lines;
    }

    @Override
    /**
     * Returns a String with each line in the lines ArrayList with endlines in between.
     * @return the String representation of the tree.
     */
    public String toString() {
        String ret = "";
        for(String str : lines) {
            ret = ret + str + "\n";
        }
        return ret;
    }
}
