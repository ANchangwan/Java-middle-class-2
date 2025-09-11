package generic.test.ex4;

import generic.animal.Cat;
import generic.animal.Dog;

import static generic.test.ex4.GenericMethod.objMethod;

public class MethodMain2 {
    public static void main(String[] args) {
        Dog dog = new Dog("멍멍이1", 100);
        Cat cat = new Cat("냐옹이1", 300);

        AnimalMethod.checkup(dog);
        AnimalMethod.checkup(cat);

        Dog dog1 = new Dog("큰 멍멍", 299);
        Dog result = AnimalMethod.getBigger(dog,dog1);
        System.out.println("result = " + result);
    }
}
