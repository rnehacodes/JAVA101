class test {
    public static void main(String[] args) {
        System.out.println("Original Linked List");
        LL lList = new LL();

        //Adding elements to Linked List
        lList.addNode(4);
        lList.addNode(3);
        lList.addNode(6);
        lList.addNode(0);
        lList.addNode(9);
        lList.addNode(7);
        lList.displayNodes();
        
        //Adding element at the beginning of the linked list
        System.out.println("\n\nLinked List after adding new element at the beginning");
        lList.addFirstNode(99);
        lList.displayNodes();

        //Deleting a linked list element
        System.out.println("\n\nLinked List after deleting an element");
        lList.deleteNode(69);
    }
}