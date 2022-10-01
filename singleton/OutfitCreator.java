package singleton;

import java.util.ArrayList;
import java.util.Random;

public class OutfitCreator {
    private ArrayList<ClothingItem> tops;
    private ArrayList<ClothingItem> bottoms;
    private ArrayList<ClothingItem> wholes;
    private Random rand;
    private static OutfitCreator outfitCreator;

    /**
     * 
     */
    private OutfitCreator() {
        tops = FileReader.getClothing("singleton/txt/tops.txt", ClothingPart.TOP);
        bottoms = FileReader.getClothing("singleton/txt/bottoms.txt", ClothingPart.BOTTOM);
        wholes = FileReader.getClothing("singleton/txt/wholes.txt", ClothingPart.WHOLE);
        rand = new Random();
    }

    /**
     * 
     * @return
     */
    public static OutfitCreator getInstance() {
        if(outfitCreator == null)
            outfitCreator = new OutfitCreator();
        return outfitCreator;
    }

    /**
     * 
     * @param season
     * @return
     */
    public String getOutfit(Season season) {
        int choice = rand.nextInt(2); // Bound 2 to produce 0 or 1
        boolean picked = false;
        // 50% chance to get whole outfit
        if(choice == 0) {
            ClothingItem whole;
            while(!picked) {
                whole = wholes.get(rand.nextInt(wholes.size()));
                if(whole.hasSeason(season))
                    return "A " + whole;
            }
        } else { // Top/bottom combo
            ClothingItem top = null;
            ClothingItem bottom = null;
            while(!picked) {
                top = tops.get(rand.nextInt(tops.size()));
                if(top.hasSeason(season))
                    picked = true;
            }
            picked = false;
            while(!picked) {
                bottom = bottoms.get(rand.nextInt(bottoms.size()));
                if(bottom.hasSeason(season))
                    picked = true;
            }
            return "A " + top + " and " + bottom;
        }
        return null;
    }
}