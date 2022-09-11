package decorator;

/**
 * Lights class. Adds lights to the tree in the constructor.
 * @author Eric Burkholder
 */
public class Lights extends TreeDecorator {
    private Tree tree;

    /**
     * Copies the tree's current lines to this instance and adds lights to it.
     * @param tree the tree instance to add upon.
     */
    public Lights(Tree tree) {
        super(tree.lines);
        this.tree = tree;
        super.integrateDecor(FileReader.getLines("decorator/txt/lights.txt"));
    }
}
