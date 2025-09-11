package generic.Q;

public class ShuttleTest {
    public static void main(String[] args) {
        Shuttle<Marin> shuttle = new Shuttle<>();
        shuttle.in(new Marin("마린", 40));
        shuttle.showInfo();

        UnitPrinter.printV1(shuttle);
        UnitPrinter.printV2(shuttle);

    }
}
