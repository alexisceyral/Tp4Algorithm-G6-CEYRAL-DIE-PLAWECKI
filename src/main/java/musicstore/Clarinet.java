package musicstore;

import java.util.EnumSet;

// ---------- Clarinet ----------
public class Clarinet extends WindInstrument {
    public enum Setting { SYMPHONIC, CHAMBER, HARMONIC }

    private EnumSet<Setting> suitableSettings;

    public Clarinet(String name, double purchasePrice, double sellingPrice,
                    EnumSet<Setting> suitableSettings) {
        super(name, purchasePrice, sellingPrice, Embouchure.SINGLE_REED);
        this.suitableSettings = suitableSettings;
    }

    @Override
    public String technicalDocument() {
        return super.technicalDocument()
                + "\nType: Clarinet"
                + "\nSuitable settings: " + suitableSettings;
    }
}
