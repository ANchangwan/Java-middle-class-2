package generic.ex1;

public class BoxMain3 {
    public static void main(String[] args) {
        GenericBox<String> stringGenericBox = new GenericBox<>();
        stringGenericBox.setValue("Hello");
        String str = stringGenericBox.getValue();
        System.out.println("stringGenericBox.getValue() = " + str);

        GenericBox<Integer> integerGenericBox = new GenericBox<>();
        integerGenericBox.setValue(10);
        integerGenericBox.setValue(20);
        Integer integer = integerGenericBox.getValue();
        System.out.println("integerGenericBox.getValue() = " + integer);


    }
}
