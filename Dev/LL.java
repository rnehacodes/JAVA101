import java.util.HashSet;
class Node {
    int value;
    Node next;

    Node(int val) {
        this.value = val;
        this.next = null;
    }

    Node() {}

    @Override
    public String toString() {
        return "Node{" +
                "data=" + value +
                ", next=" + (next != null ? "Node@" + Integer.toHexString(next.hashCode()) : "null") +
                '}';
    }
}

class LL{
    Node head = new Node();

    public void addNode(int val) {
        Node newNode = new Node(val);
        Node pointer = head;
        while(pointer.next != null) {
            pointer = pointer.next;
        }
        pointer.next = newNode;
    }

    public void addNode(Node node) {
        Node pointer = head;
        while(pointer.next != null) {
            pointer = pointer.next;
        }
        pointer.next = node;
    }

    public void displayNodes() {
        HashSet<Node> set = new HashSet<>();
        Node pointer = head;
        System.out.print("[");
        while(!set.contains(pointer)) {
            System.out.print(pointer);
            if(pointer != null) {
               System.out.print("," + " ");
            }
            pointer = pointer.next;
        }        
        System.out.print("]");
    }

    public void addFirstNode(int val) {
        Node newNode = new Node(val);
        newNode.next = head.next;
        head.next = newNode;
    }

    public void deleteNode(int val) {
        Node p = head;
        Node c = head;
        while(c != null) {
            if(c.value == val) {
                p.next = c.next;
                displayNodes();
                return;
            } else {
                p = c;
                c = c.next;
            }
        }
        displayNodes();
    }
}