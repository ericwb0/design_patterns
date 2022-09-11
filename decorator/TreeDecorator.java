package decorator;

import java.util.ArrayList;

/**
 * Tree decorator class
 * @author Eric Burkholder
 */
public abstract class TreeDecorator extends Tree {

    /**
     * Constructor. TreeDecorator does not need any parameters other than lines.
     * @param lines An ArrayList containing each line of the string representation of the tree.
     */
    public TreeDecorator(ArrayList<String> lines) {
        super(lines);
    }

    /**
     * Adds the indicated decor represented by the decor ArrayList. Iterates through each line 
     * and inserts each non-whitespace character over the tree's existing lines. It then replaces
     * each string in lines with the newly merged String.
     * @param decor the ArrayList containing the text to "overlay" onto the existing tree
     */
    protected void integrateDecor(ArrayList<String> decor) {
        StringBuilder newString;
        String decorCurr;
        String treeCurr;

        for(int i=0; i<decor.size(); i++) {
            decorCurr = decor.get(i); // The string from decor to overlay at index i
            treeCurr = lines.get(i); // The current string at index i
            newString = new StringBuilder(decorCurr.length());

            for(int j=0; j<decorCurr.length(); j++) {
                if(decorCurr.charAt(j) != ' ') {
                    // Here it finds a part of a decoration to add
                    newString.append(decorCurr.charAt(j));
                } else {
                    /*
                     * Here the decor string has whitespace, so add what exists currently
                     * at that index
                     */
                    newString.append(treeCurr.charAt(j));
                }
            }
            this.lines.set(i, newString.toString()); // Replace current line with new String
        }
    }
}
