package iterator;

/**
 * Course class. Container for all course relevant information
 * @author Eric Burkholder
 */
public class Course {
    private Assignment[] assignments;
    private int count;
    private String name;
    private String title;

    /**
     * Constructor sets the instance variables to corresponding params and instantiates an empty
     * Assignment array
     * @param name Name of the course ie. "CSCE 247"
     * @param title Title of the course ie. "Software Engineering"
     */
    public Course(String name, String title) {
        this.name = name;
        this.title = title;
        count = 0;
        assignments = new Assignment[0];
    }

    /**
     * Adds an assignment with the given parameters to the assignments array. Checks to grow the
     * array if necessary.
     * @param title Title of assignment as a string ie. "Iterator Design Pattern"
     * @param description Description of assignment as a string
     * @param topic Topic enum to classify the assignment
     */
    public void addAssignment(String title, String description, Topic topic) {
        if(count+1 > assignments.length)
            assignments = growArrray(assignments);
        assignments[count++] = new Assignment(title, description, topic);
    }

    /**
     * Creates an assignment iterator for the course's current Assignment array
     * @return an instantiated assignment iterator that iterates on the current Assignment array
     */
    public AssignmentIterator createIterator() {
        return new AssignmentIterator(assignments);
    }

    /**
     * Returns a string representation of the course
     * @return A string containing the name and title of the course
     */
    @Override
    public String toString() {
        return name + ": " + title;
    }

    /**
     * Doubles the size of the given assignment array. If the array is length 0 or null, it will
     * create a new array with one open space. Copies old contents to the new array
     * @param assignments the array to grow
     * @return a new array, doubles in size with all old elements copied
     */
    private Assignment[] growArrray(Assignment[] assignments) {
        if(assignments.length == 0 || assignments == null)
            return new Assignment[1]; 
        Assignment[] newArr = new Assignment[assignments.length*2];
        for(int i=0; i<assignments.length; i++) {
            newArr[i] = assignments[i];
        }
        return newArr;
    }
}
