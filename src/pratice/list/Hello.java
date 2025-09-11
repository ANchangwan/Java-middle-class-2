package pratice.list;

public class Hello {
   private final SayHello say;

    public Hello(SayHello say) {
        this.say = say;
    }

    public void getHello() {
       say.sayHello();
    }
}
