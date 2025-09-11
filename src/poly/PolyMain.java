package poly;

public class PolyMain {
    public static void main(String[] args) {
        Child child = new Child();
        Parent parent = new Parent();
        Parent parent2 = new Child();


//        Child child2 = (Child) parent2;
//        System.out.println("다운 캐스팅"+child2);
//
//        child.childMethod();
//        parent.parentMethod();
//        parent2.parentMethod();

        parent2.show();
        parent.parentMethod();


    }
}
