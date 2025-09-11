package generic.Q;

public class StarMain {
    public static void main(String[] args) {
        Marin m1 = new Marin("마린1", 40);
        Marin m2 = new Marin("마린2", 50);
        Marin resultMarine = UnitUtil.maxHp(m1, m2);
        System.out.println("resultMarine = " + resultMarine);

        Zealot z1 = new Zealot("질럿1", 100);
        Zealot z2 = new Zealot("질럿2", 150);
        Zealot resultZealot = UnitUtil.maxHp(z1, z2);
        System.out.println("resultZealot = " + resultZealot);

    }
}
