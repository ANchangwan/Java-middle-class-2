package generic.ex1;

public class ObjectBoxMain {
    public static void main(String[] args) {
        ObjectBox objectBox = new ObjectBox();
        objectBox.setValue(100);
        Object object = objectBox.getValue();
        Integer integet = (Integer) object;
        System.out.println("integet = " + integet);

        ObjectBox objectBox2 = new ObjectBox();
        objectBox2.setValue("hello");
        String string = (String) objectBox2.getValue();
        System.out.println("string = " + string);
    }
    public static Integer hello(ObjectBox objectBox) {
        return (Integer) objectBox.getValue();
    }

}
