// Node is defined as:
class Node{
    int val;
    Node next;
    Node(int x){
    	val = x; next = null;
    }
}
class Solution{
    static int solve(Node root){
        if (root == null || root.next == null) {
            return 0; // No peaks or valleys in an empty or single-node list
        }

        int count = 0;
        Node p = root.next;
        Node c = p.next;
        Node n = c.next;

        while (n != null) {
            if ((p.val < c.val && c.val > n.val) || (p.val > c.val && c.val < n.val)) {
                count++;
            }
            p = c;       // Move previous to current
            c = n;       // Move current to next
            n = n.next;  // Move next forward
        }
        
        return count;
    }
}
class CC {
    public static void main(String[] args) {
        LL list = new LL();

        //Adding elements to Linked List
        list.addNode(1);
        list.addNode(2);
        list.addNode(3);
        list.addNode(3);
        list.addNode(2);
        list.addNode(3);
        System.out.println("Linked List");
        list.displayNodes();

        System.out.print("Number of Minima & Maxima: ");
        System.out.print(Solution.solve(list.head));
    }
}