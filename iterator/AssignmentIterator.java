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
     * Creates an iterator with the given assignments array
     * @param assignments an array containing the Assignments to iterate upon
     */
    public AssignmentIterator(Assignment[] assignments) {
        this.assignments = assignments;
        position = 0;
    }

    /**
     * Checks if an assignment exists at the current position
     * @return true if the assignments array has a non-null element at the current position
     */
    public boolean hasNext() {
        return position < assignments.length && assignments[position] != null;
    }

    /**
     * Returns the current assignment and increases the iterator by 1
     * @return the Assignment at the current position
     */
    public Assignment next() {
        return assignments[position++];
    }
}
