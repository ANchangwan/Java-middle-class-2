package collection.link;



public class MyLinkedListV2 {
    private Node head;
    private int size;

    public void add(Object o){
        Node newNode = new Node(o);
        if(head == null){
            head = newNode;
        }else {
            Node lastNode = getLastNode();
            lastNode.next = newNode;
        }
        size++;
    }

    public void add(int index, Object value){
        Node newNode = new Node(value);
        if(index == 0){
            newNode.next = head;
            head = newNode;
        }else{
            Node prev = getNode(index - 1);
            newNode.next = prev.next;
            prev.next = newNode;
        }
        size++;
    }

    public Object remove(int index){
       Node removeNode = getNode(index);
       Object removeItem = removeNode.item;
       if(index == 0){
           head = removeNode.next;
       }else{
           Node prev = getNode(index - 1);
           prev.next = removeNode.next;
       }
       removeNode.item = null;
       removeNode.next = null;
       size--;
       return removeItem;
    }

    private Node getLastNode() {
        Node first = head;
        while (first.next != null) {
            first = first.next;
        }
        return first;
    }

    public Object set(int index, Object element) {
        Node node = getNode(index);
        return node.item;

    }

    public Object get(int index){
        Node node = getNode(index);
        return node.item;
    }

    private Node getNode(int index) {
        Node cur = head;
        for(int i = 0; i < index; i++) {
            cur = cur.next;
        }
        return cur;
    }

    public int indexOf(Object o) {
        int index = 0;
        for(Node cur = head; cur != null; cur = cur.next) {
            if(o.equals(cur.item)) {
                return index;
            }
            index++;
        }
        return -1;
    }

    public int size() {
        return size;
    }

    @Override
    public String toString() {
        return "MyLinkedListV1{" +
                "head=" + head +
                ", size=" + size +
                '}';
    }
}
