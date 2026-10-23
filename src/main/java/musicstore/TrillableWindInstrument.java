package musicstore;

// ---------- TrillableWindInstrument ----------
public abstract class TrillableWindInstrument extends WindInstrument {
    protected boolean trillSupport;
    protected int soundQuality;

    public TrillableWindInstrument(String name, double purchasePrice, double sellingPrice,
                                   Embouchure embouchure,
                                   boolean trillSupport, int soundQuality) {
        super(name, purchasePrice, sellingPrice, embouchure);
        this.trillSupport = trillSupport;
        this.soundQuality = soundQuality;
    }

    @Override
    public String technicalDocument() {
        return super.technicalDocument()
                + "\nTrill support: " + (trillSupport ? "yes" : "no")
                + "\nSound quality: " + soundQuality + "/5";
    }
}
