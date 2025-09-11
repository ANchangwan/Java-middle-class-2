package pratice.linked;

public class LinkedNode {
    public LinkedNode next;
    public Object data;

    public LinkedNode(Object data) {
        this.data = data;
    }

    @Override
    public String toString() {
        return "LinkedNode{" +
                "next=" + next +
                ", data=" + data +
                '}';
    }
}
