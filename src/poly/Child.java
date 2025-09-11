package poly;

public class Child extends Parent {
    public void childMethod(){
        System.out.println("Child Method");
    }

    @Override
    public void show(){
        System.out.println("show child");
    }
}
