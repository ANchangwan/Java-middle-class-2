package generic.Q;

public class Shuttle <T extends BioUnit> {
    private T t;


    public void in(T t) {
        this.t = t;
    }

    public T out(){
        return t;
    }

    public void showInfo(){
        System.out.println("이름: "+t.getName()+", Hp: "+t.getHp());
    }

}
