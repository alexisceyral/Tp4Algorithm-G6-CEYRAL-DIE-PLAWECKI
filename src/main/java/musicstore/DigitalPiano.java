package musicstore;

// ---------- DigitalPiano ----------
public class DigitalPiano extends Piano {
    private boolean weightedKeys;
    private int samplingQuality;

    public DigitalPiano(String name, double purchasePrice, double sellingPrice,
                        double length, double width,
                        boolean weightedKeys, int samplingQuality) {
        super(name, purchasePrice, sellingPrice, length, width);
        this.weightedKeys = weightedKeys;
        this.samplingQuality = samplingQuality;
    }

    @Override
    public String technicalDocument() {
        return super.technicalDocument()
                + "\nType: Digital"
                + "\nWeighted keys: " + (weightedKeys ? "yes" : "no")
                + "\nSampling quality: " + samplingQuality + "/3";
    }
}
