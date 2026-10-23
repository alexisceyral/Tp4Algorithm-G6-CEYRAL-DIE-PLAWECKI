package musicstore;

import java.util.ArrayList;
import java.util.EnumSet;

// ---------- Instrument ----------
public abstract class Instrument {
    protected String name;
    protected double purchasePrice;
    protected double sellingPrice;

    public Instrument(String name, double purchasePrice, double sellingPrice) {
        this.name = name;
        this.purchasePrice = purchasePrice;
        this.sellingPrice = sellingPrice;
    }

    public String technicalDocument() {
        return "Name: " + name
                + "\nPurchase price: " + purchasePrice
                + "\nSelling price: " + sellingPrice;
    }
    public double getPurchasePrice(){
        return purchasePrice;
    }
    public double getSellingPrice(){
        return sellingPrice;
    }
}

