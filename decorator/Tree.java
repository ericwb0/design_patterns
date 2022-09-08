package decorator;

import java.util.ArrayList;

/**
 * Tree class
 * @author Eric Burkholder
 */
public abstract class Tree {
    protected ArrayList<String> lines;

    public Tree(ArrayList<String> lines) {
        this.lines = lines;
    }

    @Override
    public String toString() {
        String ret = "";
        for(String str : lines) {
            ret = ret + str + "\n";
        }
        return ret;
    }
}
