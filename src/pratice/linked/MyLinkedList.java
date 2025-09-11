package pratice.linked;


public class MyLinkedList {
    private LinkedNode head;
    private int size =0;


    public MyLinkedList(LinkedNode head) {
        this.head = head;
    }
    public LinkedNode get(Object o) {
        LinkedNode current = head;
        while (current.data != o) {
            current = current.next;
        }
        return current;
    }

    public void add(Object value) {
        LinkedNode newNode = new LinkedNode(value);
        if(head == null) {
            head = newNode;
        } else {
            LinkedNode lastNode = getLastNode();
            lastNode.next = newNode;
        }
        size++;
    }
    public void add(Object value, Object index) {
        LinkedNode newNode = new LinkedNode(value);
        LinkedNode list = get(index);
        System.out.println(list.data);
        newNode.next = list.next;
        list.next = newNode;
    }

    public void remove(Object value) {
        LinkedNode cur = get(value);
        LinkedNode c = head;
        while (c.next != cur) {
            c = cur.next;
        }
        c.next = cur.next;
        cur.next = null;
        cur.data = null;
    }

    public void lastRemoveNode() {
        LinkedNode lastNode = getLastNode();
        LinkedNode first = head;
        while (first.next != lastNode) {
            first = first.next;
        }
        first.next = null;
        lastNode = null;
    }

    public void printAll() {
        LinkedNode cur = head;
        while(cur != null) {
            System.out.print(cur.data);
            if(cur.next != null) {
                System.out.print(" ->");
            }
            cur = cur.next;
        }
    }
    public LinkedNode getLastNode() {
        LinkedNode cur = head;
        while(cur.next != null) {
            cur = cur.next;
        }
        return cur;
    }

    public int indexOf(Object value) {
       int indexOf = 0;
       for (LinkedNode cur = head; cur != null; cur = cur.next) {
           if(value.equals(cur.data)) {
               return indexOf;
           }
           indexOf++;
       }

       return -1;
    }
}
