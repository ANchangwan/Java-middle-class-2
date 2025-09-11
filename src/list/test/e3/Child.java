package list.test.e3;



public class Child extends Parent {
    public void getChild(){
        System.out.println("Child");
    }

    @Override
    public void get(){
        System.out.println("get override");
    }
}

