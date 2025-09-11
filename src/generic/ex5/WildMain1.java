package generic.ex5;

import generic.animal.Cat;
import generic.animal.Dog;

public class WildMain1 {
    public static void main(String[] args) {
        Box<Object> objectBox = new Box<>();
        Box<Dog> dogBox = new Box<>();
        Box<Cat> catBox = new Box<>();
        dogBox.set(new Dog("멍멍이", 200));
    }
}
