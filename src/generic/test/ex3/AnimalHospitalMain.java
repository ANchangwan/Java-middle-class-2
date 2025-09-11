package generic.test.ex3;

import generic.animal.Cat;
import generic.animal.Dog;

public class AnimalHospitalMain {
    public static void main(String[] args) {
        DogHospital dog = new DogHospital();
        CatHospital cat = new CatHospital();

        Dog dog1 = new Dog("멍멍이", 200);
        Cat cat1 = new Cat("냐옹이1", 300);

        dog.setAnimal(dog1);
        cat.setAnimal(cat1);

        dog.bigger(new Dog("멍멍이2", 399));
        dog.checkup();
    }
}
