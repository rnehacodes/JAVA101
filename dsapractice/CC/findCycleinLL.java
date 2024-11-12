// import java.util.HashSet;

// /* Node is defined as
// class Node
// {
//     int data;
//     Node next;
//     Node(int d) {data = d; next = null; }
// }
// */

// @SuppressWarnings("unused")
// class findCycleinLL {
//     public static void main(String[] args) {
//         LL list = new LL();
//         list.addNode(8);
//         list.addNode(5);
//         // list.displayNodes();
//         System.out.println(list.head);
//         System.out.println("Answer: " + Solution.detectCycle(list.head));
        
//     }
// }

// class Solution {
//     public static Node detectCycle(Node head){
//         HashSet<Node> set = new HashSet<>();
//         System.out.println("Head: \n" + head);
//         Node x = head;
//         while(x != null) {
//             if(set.contains(x)) {
//                 return x;
//             }
//             set.add(x);
//             x = x.next;
//         }
//         return x;
//     }
// }