package decorator;

/**
 * Star class. Adds a star to the tree in the constructor.
 * @author Eric Burkholder
 */
public class Star extends TreeDecorator {
    private Tree tree;
    
    /**
     * Copies the tree's current lines to this instance and adds a star to it.
     * @param tree the tree instance to add upon.
     */
    public Star(Tree tree) {
        super(tree.lines);
        this.tree = tree;
        super.integrateDecor(FileReader.getLines("decorator/txt/star.txt"));
    }
}
