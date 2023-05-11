package src.javaHomemadeCircularSinglyLinkedLists;

public class CircularSinglyLinkedListIndex {
    // linked lists
    private static final CircularSinglyLinkedList linkedListOne = new CircularSinglyLinkedList(); //this bad boy can store so many integer values
    private static final CircularSinglyLinkedList linkedListTwo = new CircularSinglyLinkedList();
    private static final CircularSinglyLinkedList dummyLinkedList = new CircularSinglyLinkedList();
    // operations
    private static final CircularSinglyInsertions insertion = new CircularSinglyInsertions();
    private static final CircularSinglyDeletions deletion = new CircularSinglyDeletions();
    private static final CircularSinglySearch searching = new CircularSinglySearch();
    private static final CircularPrintCircularSinglyLinkedList print = new CircularPrintCircularSinglyLinkedList();

    public static void main(String[] args){
        linkedListOneOperations(); //simple linked list operations
        // linkedListTwoOperations(); //experimental operations, use impossible requests etc
    }

    private static void linkedListOneOperations() {System.out.println("Linked list one:");
        headInsertion(linkedListOne, 4); //add to head position in linked list one
        print.traversePrintingLL(linkedListOne);
        tailInsertion(linkedListOne, 0); //add node to tail in linked list one
        print.traversePrintingLL(linkedListOne);
        afterNodeWithKeyDataInsertion(linkedListOne, 4, 3); //add node to position after node with specified data in linked list one
        print.traversePrintingLL(linkedListOne);
        atSpecifiedPositionInsertion(linkedListOne, 2, 2); //add node to specified position, starting from 0
        print.traversePrintingLL(linkedListOne);
        deleteHeadNode(linkedListOne); //delete head node in linked list one
        print.traversePrintingLL(linkedListOne);
        deleteAtNode(linkedListOne, 0); //delete node with specified data in linked list one
        print.traversePrintingLL(linkedListOne);
        atSpecifiedPositionDeletion(linkedListOne,1); //delete node at specified position, starting from 0
        print.traversePrintingLL(linkedListOne);
        searchForNode(dummyLinkedList, linkedListOne, 3); //search for node with specified data in linked list one
        print.printN(dummyLinkedList);
    }

   private static void linkedListTwoOperations() {
        System.out.println("\nLinked list two:");
        // add to head position in linked
        headInsertion(linkedListTwo, 7);
        headInsertion(linkedListTwo,4);
        headInsertion(linkedListTwo,3);
        print.traversePrintingLL(linkedListTwo);
        // add to head position using position
        atSpecifiedPositionInsertion(linkedListTwo,0,4);
        atSpecifiedPositionInsertion(linkedListTwo,0,4);
        print.traversePrintingLL(linkedListTwo);
        // add specific value after head node
        atSpecifiedPositionInsertion(linkedListTwo,1,9);
        print.traversePrintingLL(linkedListTwo);
        // add to position after specified node in first list, except this does not exist
        afterNodeWithKeyDataInsertion(linkedListTwo,1,4);
        print.traversePrintingLL(linkedListTwo);
        // add to position after specified node in first list, except it will only pick the first one it sees, and print 4x6 in a row
        afterNodeWithKeyDataInsertion(linkedListTwo,4,6);
        afterNodeWithKeyDataInsertion(linkedListTwo,4,6);
        afterNodeWithKeyDataInsertion(linkedListTwo,4,6);
        afterNodeWithKeyDataInsertion(linkedListTwo,4,6);
        print.traversePrintingLL(linkedListTwo);
        // will delete two nodes with data value 4, after head it will delete any element it finds first matching the requirement
        deleteAtNode(linkedListTwo,4);
        print.traversePrintingLL(linkedListTwo);
        deleteAtNode(linkedListTwo,4);
        print.traversePrintingLL(linkedListTwo);
        // delete head node
        deleteHeadNode(linkedListTwo);
        print.traversePrintingLL(linkedListTwo);
        // will try to delete 7 twice, but as 7 does not exist more than once, it will not be found the second time
        deleteAtNode(linkedListTwo,7);
        deleteAtNode(linkedListTwo,7);
        print.traversePrintingLL(linkedListTwo);
        // will delete node at specified position (0 is head)
        atSpecifiedPositionDeletion(linkedListTwo, 0);
        print.traversePrintingLL(linkedListTwo);
        atSpecifiedPositionDeletion(linkedListTwo,4);
        print.traversePrintingLL(linkedListTwo);
        atSpecifiedPositionDeletion(linkedListTwo,4); //position do not exist
        atSpecifiedPositionDeletion(linkedListTwo,3);
        print.traversePrintingLL(linkedListTwo);
    }

    // these functions could have returned the Node class instance,
    // but it's less to write when changing the entire LinkedList class instance instead

    // insert an element at head position
    private static void headInsertion(CircularSinglyLinkedList list, int intVal) {
        list.head = insertion.insertAtHead(list.head, intVal);
    }

    // insert at position after selected nodes data variable value that equal to "key" value
    private static void afterNodeWithKeyDataInsertion(CircularSinglyLinkedList list, int key, int intVal) {
        list.head = insertion.insertAfterNodeValue(list.head, key, intVal);
    }

    // insert at position after selected nodes data variable value that equal to "key" value
    private static void atSpecifiedPositionInsertion(CircularSinglyLinkedList list, int position, int intVal) {
        list.head = insertion.insertAtPosition(list.head, position, intVal);
    }

    // insert at tail position
    private static void tailInsertion(CircularSinglyLinkedList list, int intVal) {
        list.head = insertion.tailInsertion(list.head, intVal);
    }

    // delete head node
    private static void deleteHeadNode(CircularSinglyLinkedList list) {
        list.head = deletion.deleteAtHead(list.head);
    }

    // delete node at node with int data variable matching key value
    private static void deleteAtNode(CircularSinglyLinkedList list, int key) {
        list.head = deletion.deleteAtSelectedNode(list.head, key);
    }

    // delete node at specified position in list
    private static void atSpecifiedPositionDeletion(CircularSinglyLinkedList list, int position) {
        list.head = deletion.deleteAtPosition(list.head, position);
    }

    // return node with data value matching intVal, then assign it to separate linked list
    private static void searchForNode(CircularSinglyLinkedList setList, CircularSinglyLinkedList getList, int intVal) {
        setList.head = searching.search(getList.head, intVal);
    }
}
