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
     * Constructor instantiates ClothingItem with an empty seasons ArrayList
     * @param name name of the clothing
     * @param part what part the outfit is ie. TOP, BOTTOM, or WHOLE
     * @param color color as a String
     */
    public ClothingItem(String name, ClothingPart part, String color) {
        // Trim is to get rid of any unwanted whitespace
        this.name = name.trim();
        this.part = part;
        this.color = color.trim();
        seasons = new ArrayList<Season>();
    }

    /**
     * Checks if the given season is in the seasons ArrayList
     * @param season season enum to search for
     * @return true if the season is in the ClothingItem's seasons ArrayList, false if not
     */
    public boolean hasSeason(Season season) {
        for(Season s : seasons)
            if (s == season) return true;
        return false;
    }

    /**
     * Adds the given season to the seasons ArrayList
     * @param season season enum to add
     */
    public void addSeason(Season season) {
        // No duplicate seasons
        if(this.hasSeason(season))
            return;
        seasons.add(season);
    }

    /**
     * Returns a String representation of the item
     */
    @Override
    public String toString() {
        return color + " " + name;
    }
}
