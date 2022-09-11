package decorator;

/**
 * Ornaments class. Adds ornaments to the tree in the constructor.
 * @author Eric Burkholder
 */
public class Ornaments extends TreeDecorator {
    private Tree tree;

    /**
     * Copies the tree's current lines to this instance and adds ornaments to it.
     * @param tree the tree instance to add upon.
     */
    public Ornaments(Tree tree) {
        super(tree.lines);
        this.tree = tree;
        super.integrateDecor(FileReader.getLines("decorator/txt/ornaments.txt"));
    }
}
