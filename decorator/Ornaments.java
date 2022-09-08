package decorator;

/**
 * Ornaments class
 * @author Eric Burkholder
 */
public class Ornaments extends TreeDecorator{
    private Tree tree;
    private FileReader reader;

    public Ornaments(Tree tree) {
        super(tree.lines);
        this.tree = tree;
        super.integrateDecor(FileReader.getLines("decorator/txt/ornaments.txt"));
    }


}
