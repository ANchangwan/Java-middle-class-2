package collection.set;

import collection.set.member.Member;

public class JavaHashCodeMain {
    public static void main(String[] args) {
        Object o1 = new Object();
        Object o2 = new Object();

        System.out.println("o1.hashCode(): " + o1.hashCode());
        System.out.println("o2.hashCode(): " + o2.hashCode());
        System.out.println(o1);

        Integer i = 10;
        String strA = "A";
        String strB = "B";
        String strAB = "AB";

        System.out.println(i.hashCode());
        System.out.println(strA.hashCode());
        System.out.println(strAB.hashCode());

        Member a = new Member("A");
        Member b = new Member("A");
        System.out.println("member A: " + a.hashCode() );
        System.out.println("member B: " + b.hashCode() );
        System.out.println(a.equals(b));

    }
}
