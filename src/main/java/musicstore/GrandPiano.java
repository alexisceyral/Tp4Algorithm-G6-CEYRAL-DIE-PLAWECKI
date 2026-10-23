package musicstore;

// ---------- GrandPiano ----------
public class GrandPiano extends Piano {
    public enum Size { FULL_4_4, HALF_1_2, QUARTER_1_4, BABY }

    private Size size;

    public GrandPiano(String name, double purchasePrice, double sellingPrice,
                      double length, double width, Size size) {
        super(name, purchasePrice, sellingPrice, length, width);
        this.size = size;
    }

    @Override
    public String technicalDocument() {
        return super.technicalDocument()
                + "\nType: Grand"
                + "\nSize: " + size;
    }
}
