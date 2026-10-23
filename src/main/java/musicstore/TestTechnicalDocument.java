package musicstore;

public class TestTechnicalDocument {
    public static void main(String[] args) {
        Instrument piano = new GrandPiano("Steinway D", 800000, 1200000, 274, 155,
                GrandPiano.Size.FULL_4_4);
        System.out.println(piano.technicalDocument());
        System.out.println("----------");

        Instrument oboe = new Oboe("Yamaha YOB-241", 1500, 2200, true, 4);
        System.out.println(oboe.technicalDocument());
    }
}
