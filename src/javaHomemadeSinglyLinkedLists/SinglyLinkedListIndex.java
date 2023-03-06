package src.javaHomemadeSinglyLinkedLists;

public class SinglyLinkedListIndex {
    // linked lists
    private static final LinkedList linkedListOne = new LinkedList(); //this bad boy can store so many integer values
    private static final LinkedList linkedListTwo = new LinkedList();
    private static final LinkedList dummyLinkedList = new LinkedList();
    // operations
    private static final Insertions insertion = new Insertions();
    private static final Deletions deletion = new Deletions();
    private static final Search searching = new Search();
    private static final PrintLinkedList print = new PrintLinkedList();

    public static void main(String[] args){
        linkedListOneOperations(); //simple linked list operations
        linkedListTwoOperations(); //experimental operations, use impossible requests etc
    }

    private static void linkedListOneOperations() {System.out.println("Linked list one:");
        headInsertion(linkedListOne, 4); //add to head position in linked list one
        print.pLL(linkedListOne);
        tailInsertion(linkedListOne, 0); //add node to tail in linked list one
        print.pLL(linkedListOne);
        afterNodeWithKeyDataInsertion(linkedListOne, 4, 3); //add node to position after node with specified data in linked list one
        print.pLL(linkedListOne);
        atSpecifiedPositionInsertion(linkedListOne, 2, 2); //add node to specified position, starting from 0
        print.pLL(linkedListOne);
        deleteHeadNode(linkedListOne); //delete head node in linked list one
        print.pLL(linkedListOne);
        deleteAtNode(linkedListOne, 0); //delete node with specified data in linked list one
        print.pLL(linkedListOne);
        atSpecifiedPositionDeletion(linkedListOne,1); //delete node at specified position, starting from 0
        print.pLL(linkedListOne);
        searchForNode(dummyLinkedList, linkedListOne, 3); //search for node with specified data in linked list one
        print.pN(dummyLinkedList);
    }

    private static void linkedListTwoOperations() {
        System.out.println("\nLinked list two:");
        // add to head position in linked
        headInsertion(linkedListTwo, 7);
        headInsertion(linkedListTwo,4);
        headInsertion(linkedListTwo,3);
        print.pLL(linkedListTwo);
        // add to head position using position
        atSpecifiedPositionInsertion(linkedListTwo,0,4);
        atSpecifiedPositionInsertion(linkedListTwo,0,4);
        print.pLL(linkedListTwo);
        // add specific value after head node
        atSpecifiedPositionInsertion(linkedListTwo,1,9);
        print.pLL(linkedListTwo);
        // add to position after specified node in first list, except this does not exist
        afterNodeWithKeyDataInsertion(linkedListTwo,1,4);
        print.pLL(linkedListTwo);
        // add to position after specified node in first list, except it will only pick the first one it sees, and print 4x6 in a row
        afterNodeWithKeyDataInsertion(linkedListTwo,4,6);
        afterNodeWithKeyDataInsertion(linkedListTwo,4,6);
        afterNodeWithKeyDataInsertion(linkedListTwo,4,6);
        afterNodeWithKeyDataInsertion(linkedListTwo,4,6);
        print.pLL(linkedListTwo);
        // will delete two nodes with data value 4, after head it will delete any element it finds first matching the requirement
        deleteAtNode(linkedListTwo,4);
        print.pLL(linkedListTwo);
        deleteAtNode(linkedListTwo,4);
        print.pLL(linkedListTwo);
        // delete head node
        deleteHeadNode(linkedListTwo);
        print.pLL(linkedListTwo);
        // will try to delete 7 twice, but as 7 does not exist more than once, it will not be found the second time
        deleteAtNode(linkedListTwo,7);
        deleteAtNode(linkedListTwo,7);
        print.pLL(linkedListTwo);
        // will delete node at specified position (0 is head)
        atSpecifiedPositionDeletion(linkedListTwo, 0);
        print.pLL(linkedListTwo);
        atSpecifiedPositionDeletion(linkedListTwo,4);
        print.pLL(linkedListTwo);
        atSpecifiedPositionDeletion(linkedListTwo,4); //position do not exist
        atSpecifiedPositionDeletion(linkedListTwo,3);
        print.pLL(linkedListTwo);
    }

    // these functions could have returned the Node class instance,
    // but it's less to write when changing the entire LinkedList class instance instead

    // insert an element at head position
    private static void headInsertion(LinkedList list, int intVal) {
        list.head = insertion.insertAtHead(list.head, intVal);
    }

    // insert at position after selected nodes data variable value that equal to "key" value
    private static void afterNodeWithKeyDataInsertion(LinkedList list, int key, int intVal) {
        list.head = insertion.insertAfterNodeValue(list.head, key, intVal);
    }

    // insert at position after selected nodes data variable value that equal to "key" value
    private static void atSpecifiedPositionInsertion(LinkedList list, int position, int intVal) {
        list.head = insertion.insertAtPosition(list.head, position, intVal);
    }

    // insert at tail position
    private static void tailInsertion(LinkedList list, int intVal) {
        list.head = insertion.tailInsertion(list.head, intVal);
    }

    // delete head node
    private static void deleteHeadNode(LinkedList list) {
        list.head = deletion.deleteAtHead(list.head);
    }

    // delete node at node with int data variable matching key value
    private static void deleteAtNode(LinkedList list, int key) {
        list.head = deletion.deleteAtSelectedNode(list.head, key);
    }

    // delete node at specified position in list
    private static void atSpecifiedPositionDeletion(LinkedList list, int position) {
        list.head = deletion.deleteAtPosition(list.head, position);
    }

    // return node with data value matching intVal, then assign it to separate linked list
    private static void searchForNode(LinkedList setList,LinkedList getList, int intVal) {
        setList.head = searching.search(getList.head, intVal);
    }
}
