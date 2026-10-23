package musicstore;

import java.util.ArrayList;

// ---------- ElectricGuitar ----------
public class ElectricGuitar extends Guitar {
    private boolean hasAmp;
    private ArrayList<String> pedals;

    public ElectricGuitar(String name, double purchasePrice, double sellingPrice,
                          double length, double width, boolean hasAmp) {
        super(name, purchasePrice, sellingPrice, length, width);
        this.hasAmp = hasAmp;
        this.pedals = new ArrayList<String>();
    }

    @Override
    public String technicalDocument() {
        return super.technicalDocument()
                + "\nType: Electric guitar"
                + "\nAmp included: " + (hasAmp ? "yes" : "no")
                + "\nPedals: " + pedals;
    }
}
