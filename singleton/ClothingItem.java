package singleton;

import java.util.ArrayList;

/**
 * Clothing item class
 * @author Eric Burkholder
 */
public class ClothingItem {
    private String name;
    private ClothingPart part;
    private String color;
    private ArrayList<Season> seasons;

    /**
     * 
     * @param name
     * @param part
     * @param color
     */
    public ClothingItem(String name, ClothingPart part, String color) {
        this.name = name;
        this.part = part;
        this.color = color;
        seasons = new ArrayList<Season>();
    }

    /**
     * 
     * @param season
     * @return
     */
    public boolean hasSeason(Season season) {
        for(Season s : seasons)
            if (s == season) return true;
        return false;
    }

    /**
     * 
     * @param season
     */
    public void addSeason(Season season) {
        seasons.add(season);
    }

    /**
     * 
     */
    @Override
    public String toString() {
        return color + " " + name;
    }
}
