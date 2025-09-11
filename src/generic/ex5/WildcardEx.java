package generic.ex5;

import generic.animal.Animal;

public class WildcardEx {
    public static <T> void printGenericV1(Box<T> box){
        T t = box.get();
        System.out.println(t);
    }

    public static <T extends Animal> void printGenericV2(Box<T> box){
        T t = box.get();
        System.out.println("이름 = " + t.getName());
    };

    public static <T extends Animal> T printGenericV3(Box<T> box){
        T t = box.get();
        System.out.println("이름= "+ t.getName());
        return t;
    }
}
