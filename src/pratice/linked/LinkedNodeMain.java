package pratice.linked;

public class LinkedNodeMain {
    public static void main(String[] args) {
        LinkedNode list = new LinkedNode("A");


        MyLinkedList lst = new MyLinkedList(list);
        lst.printAll();
        lst.add("D");
        lst.add("B");
        lst.add("C");
        lst.add("F");

        System.out.println();
        lst.printAll();
        System.out.println();
        lst.lastRemoveNode();
        lst.printAll();
        System.out.println();
        lst.remove("D");
        lst.add("Z","B");
        lst.printAll();
    }
}
