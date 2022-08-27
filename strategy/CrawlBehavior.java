package strategy;

import java.util.ArrayList;

/**
 * Crawl movement behavior
 * @author Eric Burkholder
 */
public class CrawlBehavior extends MoveBehavior {

    /**
     * Calls the moveBehavior parent move() method with the crawling speed
     */
    public void move (ArrayList<String> character) {
        super.move(character, 300);
    }
}
