package musicstore;

// ---------- StringInstrument ----------
public abstract class StringInstrument extends Instrument {
    protected double length;
    protected double width;

    public StringInstrument(String name, double purchasePrice, double sellingPrice,
                            double length, double width) {
        super(name, purchasePrice, sellingPrice);
        this.length = length;
        this.width = width;
    }

    @Override
    public String technicalDocument() {
        return super.technicalDocument()
                + "\nLength: " + length
                + "\nWidth: " + width;
    }
}
