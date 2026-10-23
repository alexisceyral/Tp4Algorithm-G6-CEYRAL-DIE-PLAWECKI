package musicstore;

// ---------- AcousticGuitar ----------
public class AcousticGuitar extends Guitar {
    public enum Handedness { LEFT, RIGHT }

    private Handedness handedness;
    private int gauge;

    public AcousticGuitar(String name, double purchasePrice, double sellingPrice,
                          double length, double width,
                          Handedness handedness, int gauge) {
        super(name, purchasePrice, sellingPrice, length, width);
        this.handedness = handedness;
        this.gauge = gauge;
    }

    @Override
    public String technicalDocument() {
        return super.technicalDocument()
                + "\nType: Acoustic guitar"
                + "\nHandedness: " + handedness
                + "\nGauge: " + gauge + "/3";
    }
}
