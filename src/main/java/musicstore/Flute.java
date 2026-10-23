package musicstore;

// ---------- Flute ----------
public class Flute extends TrillableWindInstrument {
    public Flute(String name, double purchasePrice, double sellingPrice,
                 boolean trillSupport, int soundQuality) {
        super(name, purchasePrice, sellingPrice, Embouchure.EDGE_BLOWN,
                trillSupport, soundQuality);
    }

    @Override
    public String technicalDocument() {
        return super.technicalDocument() + "\nType: Flute";
    }
}
