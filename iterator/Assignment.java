package iterator;

/**
 * 
 */
public class Assignment {
    private String title;
    private String description;
    private Topic topic;

    /**
     * 
     * @param title
     * @param description
     * @param topic
     */
    public Assignment(String title, String description, Topic topic) {
        this.title = title;
        this.description = description;
        this.topic = topic;
    }

    /**
     * 
     * @param topic
     * @return
     */
    public boolean hasTopic(Topic topic) {
        return this.topic == topic;
    }

    /**
     * 
     * @return
     */
    public String toString() {
        return title + ": " + description;
    }
}
