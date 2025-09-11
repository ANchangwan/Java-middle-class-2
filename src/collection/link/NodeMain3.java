//package collection.link;
//
//public class NodeMain3 {
//    public static void main(String[] args) {
//        Node head = new Node("A");
//        head.next = new Node("B");
//        head.next.next = new Node("C");
//
//        System.out.println(head);
//        System.out.println(getNode(head, 2));
//
//        add(head,"D");
//        System.out.println(head);
//
//    }
//
//    private static void add(Node node, String param) {
//        Node lastNode = getLastNode(node);
//        lastNode.next = new Node(param);
//
//    }
//
//    private static void printAll(Node head) {
//        Node cur = head;
//        while (cur != null) {
//            System.out.println(cur.item);
//            cur = cur.next;
//        }
//
//    }
//    private static Node getLastNode(Node head) {
//        Node cur = head;
//        while (cur.next != null) {
//            if(cur.next == null){
//                return cur;
//            }
//            cur = cur.next;
//        }
//        return cur;
//    }
//
//    private static Node getNode(Node head, int index) {
//        Node cur = head;
//        for (int i = 0; i < index; i++) {
//            cur = cur.next;
//        }
//        return cur;
//    }
//
//}
