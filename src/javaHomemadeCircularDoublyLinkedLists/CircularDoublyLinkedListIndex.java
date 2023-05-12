package src.javaHomemadeCircularDoublyLinkedLists;

public class CircularDoublyLinkedListIndex {
    // linked lists
    private static final CircularDoublyLinkedList linkedListOne = new CircularDoublyLinkedList();
    private static final CircularDoublyLinkedList linkedListTwo = new CircularDoublyLinkedList();
    private static final CircularDoublyLinkedList dummyLinkedList = new CircularDoublyLinkedList();
    // operations
    private static final CircularDoublyInsertions insertion = new CircularDoublyInsertions();
    private static final CircularDoublyDeletions deletion = new CircularDoublyDeletions();
    private static final CircularDoublySearch searching = new CircularDoublySearch();
    private static final PrintCircularDoublyLinkedList print = new PrintCircularDoublyLinkedList();

    public static void main(String[] args){
        linkedListOneOperations(); //simple linked list operations
        //linkedListTwoOperations(); //experimental operations, use impossible requests etc
    }

    private static void linkedListOneOperations() {System.out.println("Linked list one:");
        headInsertion(linkedListOne, 4); //add to head position in linked list one
        print.traversePrintingDLL(linkedListOne);
        tailInsertion(linkedListOne, 0); //add node to tail in linked list one
        print.traversePrintingDLL(linkedListOne);
        afterNodeWithKeyDataInsertion(linkedListOne, 4, 3); //add node to position after node with specified data in linked list one
        print.traversePrintingDLL(linkedListOne);
        atSpecifiedPositionInsertion(linkedListOne, 2, 2); //add node to specified position, starting from 0
        print.traversePrintingDLL(linkedListOne);
        print.reverseTraversePrintingDLL(linkedListOne); //reverse traverse linked list
        /*
        deleteHeadNode(linkedListOne); //delete head node in linked list one
        print.traversePrintingDLL(linkedListOne);
        deleteAtNode(linkedListOne, 0); //delete node with specified data in linked list one
        print.traversePrintingDLL(linkedListOne);
        atSpecifiedPositionDeletion(linkedListOne,1); //delete node at specified position, starting from 0
        print.traversePrintingDLL(linkedListOne);
        searchForNode(dummyLinkedList, linkedListOne, 3); //search for node with specified data in linked list one
        print.printN(dummyLinkedList);
         */
    }

    private static void linkedListTwoOperations() {
        System.out.println("\nLinked list two:");
        // add to head position in linked
        headInsertion(linkedListTwo, 7);
        headInsertion(linkedListTwo,4);
        headInsertion(linkedListTwo,3);
        print.traversePrintingDLL(linkedListTwo);
        // add to head position using position
        atSpecifiedPositionInsertion(linkedListTwo,0,4);
        atSpecifiedPositionInsertion(linkedListTwo,0,4);
        print.traversePrintingDLL(linkedListTwo);
        // add specific value after head node
        atSpecifiedPositionInsertion(linkedListTwo,1,9);
        print.traversePrintingDLL(linkedListTwo);
        // add to position after specified node in first list, except this does not exist
        afterNodeWithKeyDataInsertion(linkedListTwo,1,4);
        print.traversePrintingDLL(linkedListTwo);
        // add to position after specified node in first list, except it will only pick the first one it sees, and print 4x6 in a row
        afterNodeWithKeyDataInsertion(linkedListTwo,4,6);
        afterNodeWithKeyDataInsertion(linkedListTwo,4,6);
        afterNodeWithKeyDataInsertion(linkedListTwo,4,6);
        afterNodeWithKeyDataInsertion(linkedListTwo,4,6);
        afterNodeWithKeyDataInsertion(linkedListTwo,4,6);
        // traverse linked list
        print.traversePrintingDLL(linkedListTwo);
        // reverse traverse linked list
        print.reverseTraversePrintingDLL(linkedListTwo);
        // will delete two nodes with data value 4, after head it will delete any element it finds first matching the requirement
        deleteAtNode(linkedListTwo,4);
        print.traversePrintingDLL(linkedListTwo);
        deleteAtNode(linkedListTwo,4);
        print.traversePrintingDLL(linkedListTwo);
        // delete head node
        deleteHeadNode(linkedListTwo);
        print.traversePrintingDLL(linkedListTwo);
        // will try to delete 7 twice, but as 7 does not exist more than once, it will not be found the second time
        deleteAtNode(linkedListTwo,7);
        deleteAtNode(linkedListTwo,7);
        print.traversePrintingDLL(linkedListTwo);
        // will delete node at specified position (0 is head)
        atSpecifiedPositionDeletion(linkedListTwo, 0);
        print.traversePrintingDLL(linkedListTwo);
        atSpecifiedPositionDeletion(linkedListTwo,4);
        print.traversePrintingDLL(linkedListTwo);
        atSpecifiedPositionDeletion(linkedListTwo,4);
        atSpecifiedPositionDeletion(linkedListTwo,4); // position does not exist
        atSpecifiedPositionDeletion(linkedListTwo,3);
        print.traversePrintingDLL(linkedListTwo);
        // reverse traverse linked list
        print.reverseTraversePrintingDLL(linkedListTwo);
    }

    // insert an element at head position
    private static void headInsertion(CircularDoublyLinkedList list, int intVal) {
        list.head = insertion.insertAtHead(list.head, intVal);
    }

    // insert at position after selected nodes data variable value that equal to "key" value
    private static void afterNodeWithKeyDataInsertion(CircularDoublyLinkedList list, int key, int intVal) {
        list.head = insertion.insertAfterNodeValue(list.head, key, intVal);
    }

    // insert at position after selected nodes data variable value that equal to "key" value
    private static void atSpecifiedPositionInsertion(CircularDoublyLinkedList list, int position, int intVal) {
        list.head = insertion.insertAtPosition(list.head, position, intVal);
    }

    // insert at tail position
    private static void tailInsertion(CircularDoublyLinkedList list, int intVal) {
        list.head = insertion.tailInsertion(list.head, intVal);
    }

    // delete head node
    private static void deleteHeadNode(CircularDoublyLinkedList list) {
        list.head = deletion.deleteAtHead(list.head);
    }

    // delete node at node with int data variable matching key value
    private static void deleteAtNode(CircularDoublyLinkedList list, int key) {
        list.head = deletion.deleteAtSelectedNode(list.head, key);
    }

    // delete node at specified position in list
    private static void atSpecifiedPositionDeletion(CircularDoublyLinkedList list, int position) {
        list.head = deletion.deleteAtPosition(list.head, position);
    }

    // return node with data value matching intVal, then assign it to separate linked list
    private static void searchForNode(CircularDoublyLinkedList setList, CircularDoublyLinkedList getList, int intVal) {
        setList.head = searching.search(getList.head, intVal);
    }
}
