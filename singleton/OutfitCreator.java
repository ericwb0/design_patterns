package singleton;

import java.util.ArrayList;
import java.util.Random;

/**
 * OutfitCreator singleton class
 */
public class OutfitCreator {
    private ArrayList<ClothingItem> tops;
    private ArrayList<ClothingItem> bottoms;
    private ArrayList<ClothingItem> wholes;
    private Random rand;
    private static OutfitCreator outfitCreator;

    /**
     * Constructor. Reads the tops, bottoms, and wholes files to populate the respective ArrayLists
     * with ClothingItems
     */
    private OutfitCreator() {
        tops = FileReader.getClothing("singleton/txt/tops.txt", ClothingPart.TOP);
        bottoms = FileReader.getClothing("singleton/txt/bottoms.txt", ClothingPart.BOTTOM);
        wholes = FileReader.getClothing("singleton/txt/wholes.txt", ClothingPart.WHOLE);
        rand = new Random();
    }

    /**
     * Returns the single instance of OutfitCreator. On the first call of this method it will
     * instantiate the OutfitCreator
     */
    public static OutfitCreator getInstance() {
        if(outfitCreator == null)
            outfitCreator = new OutfitCreator();
        return outfitCreator;
    }

    /**
     * Creates a randomly generated outfit for the specified season. 50% chance to get a one-piece
     * outfit, 50% to get a top/bottom combination
     * @param season season enum to find outfit for
     * @return a String representing the outfit
     */
    public String getOutfit(Season season) {
        int choice = rand.nextInt(2); // Bound 2 to produce 0 or 1
        // 50% chance to get whole outfit
        if(choice == 0) {
            ClothingItem whole;
            // These loops ensure that when a piece is picked, it fits the season
            while(true) {
                whole = wholes.get(rand.nextInt(wholes.size()));
                // Break when the ClothingItem fits
                if(whole.hasSeason(season))
                    return "A " + whole;
            }
        } else { // Top/bottom combo
            ClothingItem top = null;
            ClothingItem bottom = null;
            while(true) {
                top = tops.get(rand.nextInt(tops.size()));
                if(top.hasSeason(season))
                    break;
            }
            while(true) {
                bottom = bottoms.get(rand.nextInt(bottoms.size()));
                if(bottom.hasSeason(season))
                    break;
            }
            return "A " + top + " and " + bottom;
        }
    }
}