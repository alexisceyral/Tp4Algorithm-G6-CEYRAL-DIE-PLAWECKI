package musicstore;

public class TestSell {
    public static void main(String[] args) {
        Store store = new Store(1500.0, 10000);

        Instrument flute = new Flute("Yamaha 677H", 2000, 2800, true, 4);
        store.deliver(flute, 3);   // treasury: 10000 - 6000 = 4000, 3 in stock

        boolean sold = store.sell(flute);
        System.out.println("Sale successful: " + sold);                 // true
        System.out.println("Treasury after sale: " + store.getTreasury()); // 4000 + 2800 = 6800
        System.out.println("Inventory size: " + store.getInventory().size()); // 2

        Instrument oboe = new Oboe("Yamaha YOB-241", 1500, 2200, true, 4);
        boolean soldMissing = store.sell(oboe);   // never delivered
        System.out.println("Sale of unstocked instrument: " + soldMissing); // false
        System.out.println("Treasury unchanged: " + store.getTreasury());   // still 6800
    }
}