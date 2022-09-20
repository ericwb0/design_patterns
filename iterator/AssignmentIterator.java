package iterator;

import java.util.Iterator;

/**
 * Assignment iterator class
 * @author Eric Burkholder
 */
public class AssignmentIterator implements Iterator<Assignment> {
    private Assignment[] assignments;
    private int position;

    /**
     * 
     * @param assignments an array containing
     */
    public AssignmentIterator(Assignment[] assignments) {
        this.assignments = assignments;
        position = 0;
    }

    /**
     * 
     */
    public boolean hasNext() {
        return position < assignments.length && assignments[position] != null;
    }

    /**
     * 
     */
    public Assignment next() {
        return assignments[position++];
    }
}
