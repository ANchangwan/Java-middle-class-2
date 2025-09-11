package pratice.list;

public class HelloMain {
    public static void main(String[] args) {

//        SayHi sayHi = new SayHi();
//        SayWorld sayHi1 = new SayWorld();

        Hello say = new Hello(new SayHi());
        say.getHello();
    }
}
