package decorator;

import java.util.ArrayList;

/**
 * Tree decorator class
 * @author Eric Burkholder
 */
public abstract class TreeDecorator extends Tree {
    public TreeDecorator(ArrayList<String> lines) {
        super(lines);
    }

    protected void integrateDecor(ArrayList<String> decor) {
        StringBuilder newString;
        String decorCurr;
        String treeCurr;

        for(int i=0; i<decor.size(); i++) {
            decorCurr = decor.get(i);
            treeCurr = lines.get(i);
            newString = new StringBuilder(decorCurr.length());

            for(int j=0; j<decorCurr.length(); j++) {
                if(decorCurr.charAt(j) != ' ') {
                    // Here it finds a part of a decoration to add
                    newString.append(decorCurr.charAt(j));
                } else {
                    // Here the decor string has whitespace
                    newString.append(treeCurr.charAt(j));
                }
            }
            this.lines.set(i, newString.toString());
        }
    }
}
