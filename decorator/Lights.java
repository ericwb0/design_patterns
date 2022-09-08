package decorator;

/**
 * Lights class
 * @author Eric Burkholder
 */
public class Lights extends TreeDecorator {
    private Tree tree;

    public Lights(Tree tree) {
        super(tree.lines);
        this.tree = tree;
        super.integrateDecor(FileReader.getLines("decorator/txt/lights.txt"));
    }
}
