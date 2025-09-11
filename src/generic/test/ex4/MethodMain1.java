package generic.test.ex4;

import static generic.test.ex4.GenericMethod.genericMethod;
import static generic.test.ex4.GenericMethod.objMethod;

public class MethodMain1 {
    public static void main(String[] args) {
        Integer integer = 1;
        objMethod(integer);
        Integer result = GenericMethod.genericMethod(integer);
        String str = GenericMethod.genericMethod("hello");

    }
}
