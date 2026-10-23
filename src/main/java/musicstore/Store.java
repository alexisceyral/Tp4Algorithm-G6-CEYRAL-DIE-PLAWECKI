package musicstore;

import java.util.ArrayList;

public class Store {

    private ArrayList<Instrument> inventory;
    private double rent;      // monthly rent
    private int treasury;     // the store's current cash balance

    public Store(double rent, int treasury) {
        this.inventory = new ArrayList<Instrument>();
        this.rent = rent;
        this.treasury = treasury;
    }

    // Getters / setters
    public ArrayList<Instrument> getInventory() {
        return inventory;
    }

    public double getRent() {
        return rent;
    }

    public void setRent(double rent) {
        this.rent = rent;
    }

    public int getTreasury() {
        return treasury;
    }

    public void setTreasury(int treasury) {
        this.treasury = treasury;
    }

    public void addInstrument(Instrument instrument) {
        inventory.add(instrument);
    }

    public boolean deliver(Instrument instrument, int quantity) {
        if (instrument == null || quantity <= 0) {
            return false;   // nothing valid to deliver
        }

        double totalCost = instrument.getPurchasePrice() * quantity;

        if (totalCost > treasury) {
            return false;   // store can't afford it
        }

        treasury -= (int) totalCost;   // treasury is int, so cast the cost

        for (int i = 0; i < quantity; i++) {
            inventory.add(instrument);
        }

        return true;
    }
    public boolean sell(Instrument instrument) {
        if (instrument == null) {
            return false;
        }

        boolean removed = inventory.remove(instrument);   // removes one occurrence

        if (!removed) {
            return false;   // instrument not in stock, nothing sold
        }

        treasury += (int) instrument.getSellingPrice();
        return true;
    }



}
