package generic.Q;

public class UnitPrinter <T> {
    static <T extends BioUnit> void printV1(Shuttle<T> t1) {
        T unit = t1.out();
        System.out.println("이름: "+unit.getName() + ", hp" + unit.getHp());
    }

    static void printV2(Shuttle<? extends BioUnit> t1) {
        BioUnit unit = t1.out();
        System.out.println("이름: "+unit.getName() + ", hp" + unit.getHp());
    }
}
