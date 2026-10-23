package musicstore;

// ---------- UprightPiano ----------
public class UprightPiano extends Piano {
    public enum StringType { STRAIGHT, CROSSED }

    private StringType stringType;
    private boolean hasMute;

    public UprightPiano(String name, double purchasePrice, double sellingPrice,
                        double length, double width,
                        StringType stringType, boolean hasMute) {
        super(name, purchasePrice, sellingPrice, length, width);
        this.stringType = stringType;
        this.hasMute = hasMute;
    }

    @Override
    public String technicalDocument() {
        return super.technicalDocument()
                + "\nType: Upright"
                + "\nString type: " + stringType
                + "\nMute: " + (hasMute ? "yes" : "no");
    }
}
