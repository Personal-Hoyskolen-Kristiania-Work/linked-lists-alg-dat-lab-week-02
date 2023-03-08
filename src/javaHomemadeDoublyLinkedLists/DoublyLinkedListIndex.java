package src.javaHomemadeDoublyLinkedLists;

public class DoublyLinkedListIndex {
    // linked lists
    private static final DoublyLinkedList linkedListOne = new DoublyLinkedList();
    private static final DoublyLinkedList linkedListTwo = new DoublyLinkedList();
    private static final DoublyLinkedList dummyLinkedList = new DoublyLinkedList();
    // operations
    private static final DoublyInsertions insertion = new DoublyInsertions();
    private static final DoublyDeletions deletion = new DoublyDeletions();
    private static final DoublySearch searching = new DoublySearch();
    private static final PrintDoublyLinkedList print = new PrintDoublyLinkedList();

    public static void main(String[] args){
        linkedListOneOperations(); //simple linked list operations
        linkedListTwoOperations(); //experimental operations, use impossible requests etc
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
        deleteHeadNode(linkedListOne); //delete head node in linked list one
        print.traversePrintingDLL(linkedListOne);
        deleteAtNode(linkedListOne, 0); //delete node with specified data in linked list one
        print.traversePrintingDLL(linkedListOne);
        atSpecifiedPositionDeletion(linkedListOne,1); //delete node at specified position, starting from 0
        print.traversePrintingDLL(linkedListOne);
        searchForNode(dummyLinkedList, linkedListOne, 3); //search for node with specified data in linked list one
        print.printN(dummyLinkedList);
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
        print.traversePrintingDLL(linkedListTwo);
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
        atSpecifiedPositionDeletion(linkedListTwo,4); //position do not exist
        atSpecifiedPositionDeletion(linkedListTwo,3);
        print.traversePrintingDLL(linkedListTwo);
    }

    // these functions could have returned the Node class instance,
    // but it's less to write when changing the entire LinkedList class instance instead

    // insert an element at head position
    private static void headInsertion(DoublyLinkedList list, int intVal) {
        list.head = insertion.insertAtHead(list.head, intVal);
    }

    // insert at position after selected nodes data variable value that equal to "key" value
    private static void afterNodeWithKeyDataInsertion(DoublyLinkedList list, int key, int intVal) {
        list.head = insertion.insertAfterNodeValue(list.head, key, intVal);
    }

    // insert at position after selected nodes data variable value that equal to "key" value
    private static void atSpecifiedPositionInsertion(DoublyLinkedList list, int position, int intVal) {
        list.head = insertion.insertAtPosition(list.head, position, intVal);
    }

    // insert at tail position
    private static void tailInsertion(DoublyLinkedList list, int intVal) {
        list.head = insertion.tailInsertion(list.head, intVal);
    }

    // delete head node
    private static void deleteHeadNode(DoublyLinkedList list) {
        list.head = deletion.deleteAtHead(list.head);
    }

    // delete node at node with int data variable matching key value
    private static void deleteAtNode(DoublyLinkedList list, int key) {
        list.head = deletion.deleteAtSelectedNode(list.head, key);
    }

    // delete node at specified position in list
    private static void atSpecifiedPositionDeletion(DoublyLinkedList list, int position) {
        list.head = deletion.deleteAtPosition(list.head, position);
    }

    // return node with data value matching intVal, then assign it to separate linked list
    private static void searchForNode(DoublyLinkedList setList, DoublyLinkedList getList, int intVal) {
        setList.head = searching.search(getList.head, intVal);
    }
}
