package example.com.sights.dummy;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import example.com.sights.R;

/**
 * Helper class for providing sample content for user interfaces created by
 * Android template wizards.
 * <p>
 * TODO: Replace all uses of this class before publishing your app.
 */
public class SightContent {

    /**
     * An array of sample (dummy) items.
     */
    public static final List<Sight> ITEMS = new ArrayList<Sight>();

    /**
     * A map of sample (dummy) items, by ID.
     */
    public static final Map<String, Sight> ITEM_MAP = new HashMap<String, Sight>();

    private static final int COUNT = 25;

    static {
        Sight toomkirik = new Sight("12",
                R.string.toomkirik_pealkiri, R.string.toomkirik_tekst, R.drawable.toomkirik);
        Sight jaanikirik = new Sight("19",
                R.string.jaanikirik_pealkiri, R.string.jaanikirik_tekst, R.drawable.jaanikirik);
        Sight peahoone = new Sight("17",
                R.string.peahoone_pealkiri, R.string.peahoone_tekst, R.drawable.peahoone);
        addItem(toomkirik);
        addItem(peahoone);
        addItem(jaanikirik);
    }


    private static void addItem(Sight item) {
        ITEMS.add(item);
        ITEM_MAP.put(item.id, item);
    }


    private static String makeDetails(int position) {
        StringBuilder builder = new StringBuilder();
        builder.append("Details about Item: ").append(position);
        for (int i = 0; i < position; i++) {
            builder.append("\nMore details information here.");
        }
        return builder.toString();
    }

    /**
     * A dummy item representing a piece of content.
     */
    public static class Sight {
        public final String id;
        public final int content;
        public final int details;
        public final int image;

        public Sight(String id, int content, int details, int image) {
            this.id = id;
            this.content = content;
            this.details = details;
            this.image = image;
        }

        public int getImage() {
            return image;
        }

    }
}
