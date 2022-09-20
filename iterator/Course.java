package iterator;

/**
 * 
 */
public class Course {
    private Assignment[] assignments;
    private int count;
    private String name;
    private String title;

    /**
     * 
     * @param name
     * @param title
     */
    public Course(String name, String title) {
        this.name = name;
        this.title = title;
        count = 0;
        assignments = new Assignment[0];
    }

    /**
     * 
     * @param title
     * @param description
     * @param topic
     */
    public void addAssignment(String title, String description, Topic topic) {
        if(count+1 > assignments.length)
            assignments = growArrray(assignments);
        assignments[count++] = new Assignment(title, description, topic);
    }

    /**
     * 
     * @return
     */
    public AssignmentIterator createIterator() {
        return new AssignmentIterator(assignments);
    }

    /**
     * 
     */
    public String toString() {
        return name + ": " + title;
    }

    /**
     * 
     * @param assignments
     * @return
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
