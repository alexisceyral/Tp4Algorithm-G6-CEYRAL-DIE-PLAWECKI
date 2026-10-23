package musicstore;

// ---------- Guitar ----------
public abstract class Guitar extends StringInstrument {
    public Guitar(String name, double purchasePrice, double sellingPrice,
                  double length, double width) {
        super(name, purchasePrice, sellingPrice, length, width);
    }
    // No new attributes here, so no override needed:
    // technicalDocument() is inherited as-is from StringInstrument.
}
