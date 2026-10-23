package musicstore;

// ---------- WindInstrument ----------
public abstract class WindInstrument extends Instrument {
    public enum Embouchure { EDGE_BLOWN, SINGLE_REED, DOUBLE_REED }

    protected Embouchure embouchure;

    public WindInstrument(String name, double purchasePrice, double sellingPrice,
                          Embouchure embouchure) {
        super(name, purchasePrice, sellingPrice);
        this.embouchure = embouchure;
    }

    @Override
    public String technicalDocument() {
        return super.technicalDocument()
                + "\nEmbouchure: " + embouchure;
    }
}
