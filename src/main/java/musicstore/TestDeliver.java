package musicstore;

public class TestDeliver {
    public static void main(String[] args) {
        Store store = new Store(1500.0, 10000);

        Instrument flute = new Flute("Yamaha 677H", 2000, 2800, true, 4);

        boolean delivered = store.deliver(flute, 3);  // costs 6000
        System.out.println("Delivery 1 successful: " + delivered);
        System.out.println("Treasury after: " + store.getTreasury());  // 4000
        System.out.println("Inventory size: " + store.getInventory().size());  // 3

        boolean delivered2 = store.deliver(flute, 3);  // would cost 6000, only 4000 left
        System.out.println("Delivery 2 successful: " + delivered2);
        System.out.println("Treasury unchanged: " + store.getTreasury());  // still 4000
    }
}

