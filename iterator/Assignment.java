package iterator;

/**
 * Assignment class, container for assignment info
 * @author Eric Burkholder
 */
public class Assignment {
    private String title;
    private String description;
    private Topic topic;

    /**
     * Constructor sets instance variables to given params
     * @param title Title of the assignment as a string ie. "Iterator Design Pattern"
     * @param description Description of assignment
     * @param topic Topic enum. Like a "tag"
     */
    public Assignment(String title, String description, Topic topic) {
        this.title = title;
        this.description = description;
        this.topic = topic;
    }

    /**
     * Checks if an assignment has the given topic
     * @param topic The topic enum to check for
     * @return true if the topic instance variable is the same as the given parameter
     */
    public boolean hasTopic(Topic topic) {
        return this.topic == topic;
    }

    /**
     * Returns a string representation of the assignment
     * @return a string with the title and description combined
     */
    @Override
    public String toString() {
        return title + ": " + description;
    }
}
