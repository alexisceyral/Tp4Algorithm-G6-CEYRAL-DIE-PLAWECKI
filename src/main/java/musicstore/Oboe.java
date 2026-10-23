package musicstore;

// ---------- Oboe ----------
public class Oboe extends TrillableWindInstrument {
    public Oboe(String name, double purchasePrice, double sellingPrice,
                boolean trillSupport, int soundQuality) {
        super(name, purchasePrice, sellingPrice, Embouchure.DOUBLE_REED,
                trillSupport, soundQuality);
    }

    @Override
    public String technicalDocument() {
        return super.technicalDocument() + "\nType: Oboe";
    }
}
