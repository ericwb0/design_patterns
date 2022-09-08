package decorator;

/**
 * Star class
 * @author Eric Burkholder
 */
public class Star extends TreeDecorator {
    private Tree tree;
    
    public Star(Tree tree) {
        super(tree.lines);
        this.tree = tree;
        super.integrateDecor(FileReader.getLines("decorator/txt/star.txt"));
    }
}
