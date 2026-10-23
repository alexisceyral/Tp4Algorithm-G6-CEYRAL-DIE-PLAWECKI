package musicstore;

// ---------- Piano ----------
public abstract class Piano extends StringInstrument {
    public static final int NUMBER_OF_KEYS = 88;

    public Piano(String name, double purchasePrice, double sellingPrice,
                 double length, double width) {
        super(name, purchasePrice, sellingPrice, length, width);
    }

    @Override
    public String technicalDocument() {
        return super.technicalDocument()
                + "\nNumber of keys: " + NUMBER_OF_KEYS;
    }
}
