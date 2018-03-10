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
        Sight skytte = new Sight("11",
                R.string.skytte_pealkiri, R.string.skytte_tekst, R.drawable.skytte);
        Sight gustav = new Sight("13",
                R.string.gustav_pealkiri, R.string.gustav_tekst, R.drawable.gustav);
        Sight peterson = new Sight("14",
                R.string.peterson_pealkiri, R.string.peterson_tekst, R.drawable.peterson);
        Sight baer = new Sight("15",
                R.string.baer_pealkiri, R.string.baer_tekst, R.drawable.baer);
        Sight morgenstern = new Sight("16",
                R.string.morgenstern_pealkiri, R.string.morgenstern_tekst, R.drawable.morgenstern);
        Sight treffner = new Sight("18",
                R.string.treffner_pealkiri, R.string.treffner_tekst, R.drawable.treffner);
        Sight botaanikaaed = new Sight("20",
                R.string.botaanikaaed_pealkiri, R.string.botaanikaaed_tekst, R.drawable.botaanikaaed);
        Sight malestusmark = new Sight("21",
                R.string.malestusmark_pealkiri, R.string.malestusmark_tekst, R.drawable.malestusmark);
        Sight vanemuine = new Sight("1",
                R.string.vanemuine_pealkiri, R.string.vanemuine_tekst, R.drawable.vanemuine);
        Sight tolly = new Sight("2",
                R.string.tolly_pealkiri, R.string.tolly_tekst, R.drawable.tolly);
        Sight isa = new Sight("3",
                R.string.isa_pealkiri, R.string.isa_tekst, R.drawable.isa);
        Sight raekoja = new Sight("4",
                R.string.raekoja_pealkiri, R.string.raekoja_tekst, R.drawable.raekoja);
        Sight eller = new Sight("5",
                R.string.eller_pealkiri, R.string.eller_tekst, R.drawable.eller);
        Sight tahetorn = new Sight("7",
                R.string.tahetorn_pealkiri, R.string.tahetorn_tekst, R.drawable.tahetorn);
        Sight inglisild = new Sight("6",
                R.string.inglisild_pealkiri, R.string.inglisild_tekst, R.drawable.inglisild);
        Sight anatoomikum = new Sight("8",
                R.string.anatoomikum_pealkiri, R.string.anatoomikum_tekst, R.drawable.anatoomikum);
        Sight kuradisild = new Sight ("9",
                R.string.kuradisild_pealkiri, R.string.kuradisild_tekst, R.drawable.kuradslid);
        Sight riigikohus = new Sight("10",
                R. string.riigikohus_pealkiri, R.string.riigikohus_tekst, R.drawable.riigikohus);
        addItem(vanemuine);
        addItem(tolly);
        addItem(isa);
        addItem(raekoja);
        addItem(eller);
        addItem(inglisild);
        addItem(tahetorn);
        addItem(anatoomikum);
        addItem(kuradisild);
        addItem(riigikohus);
        addItem(skytte);
        addItem(toomkirik);
        addItem(gustav);
        addItem(peterson);
        addItem(baer);
        addItem(morgenstern);
        addItem(peahoone);
        addItem(treffner);
        addItem(jaanikirik);
        addItem(botaanikaaed);
        addItem(malestusmark);
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
