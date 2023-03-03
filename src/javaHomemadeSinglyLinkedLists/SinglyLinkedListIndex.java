package src.javaHomemadeSinglyLinkedLists;

public class SinglyLinkedListIndex {
    // linked lists
    private static final LinkedList linkedListOne = new LinkedList(); //this bad boy can store so many integer values
    private static final LinkedList linkedListTwo = new LinkedList();
    private static LinkedList dummyLinkedList = new LinkedList();
    // operations
    private static final Insertions insertion = new Insertions();
    private static final Deletions deletion = new Deletions();
    private static final Search searching = new Search();
    private static final PrintLinkedList print = new PrintLinkedList();

    public static void main(String[] args){
        //region linked list one
        System.out.println("Linked list one:");
        // add to head position in linked list one
        headInsertion(linkedListOne, 4);
        tailInsertion(linkedListOne, 1);
        print.pLL(linkedListOne);
        // add to tail
        tailInsertion(linkedListOne, 0);
        print.pLL(linkedListOne);
        // add to position after specified node in first list
        afterNodeInsertion(linkedListOne, 4, 3);
        afterNodeInsertion(linkedListOne, 3, 2);
        print.pLL(linkedListOne);
        deleteHeadNode(linkedListOne);
        print.pLL(linkedListOne);
        deleteAtNode(linkedListOne, 2);
        print.pLL(linkedListOne);
        searchForNode(dummyLinkedList, linkedListOne, 3);
        print.pN(dummyLinkedList);
        searchForNode(dummyLinkedList,linkedListOne, 0);
        print.pN(dummyLinkedList);
        //endregion

        //region linked list two
        System.out.println("\nLinked list two:");
        // add to head position in linked
        headInsertion(linkedListTwo, 7);
        headInsertion(linkedListTwo,4);
        headInsertion(linkedListTwo,4);
        headInsertion(linkedListTwo,3);
        headInsertion(linkedListTwo,4);
        print.pLL(linkedListTwo);
        // add to position after specified node in first list, except this does not exist
        afterNodeInsertion(linkedListTwo,1,4);
        print.pLL(linkedListTwo);
        // add to position after specified node in first list, except it will only pick the first one it sees, and print 3x6 in a row
        afterNodeInsertion(linkedListTwo,4,6);
        afterNodeInsertion(linkedListTwo,4,6);
        afterNodeInsertion(linkedListTwo,4,6);
        print.pLL(linkedListTwo);
        deleteAtNode(linkedListTwo,4);
        deleteAtNode(linkedListTwo,4);
        deleteAtNode(linkedListTwo,7);
        deleteAtNode(linkedListTwo,9);
        print.pLL(linkedListTwo);
        //endregion
    }

    // these functions could have returned the Node class instance,
    // but it's less to write when changing the entire LinkedList class instance instead

    // insert an element at head position
    private static void headInsertion(LinkedList list, int intVal) {
        list.head = insertion.insertAtHead(list.head, intVal);
    }

    // insert at position after selected nodes data variable value that equal to "key" value
    private static void afterNodeInsertion(LinkedList list, int key, int intVal) {
        list.head = insertion.insertAfterNodeValue(list.head, key, intVal);
    }

    //
    private static void tailInsertion(LinkedList list, int intVal) {
        list.head = insertion.tailInsertion(list.head, intVal);
    }

    private static void deleteHeadNode(LinkedList list) {
        list.head = deletion.deleteAtHead(list.head);
    }
    private static void deleteAtNode(LinkedList list, int key) {
        list.head = deletion.deleteAtSelectedNode(list.head, key);
    }

    private static void searchForNode(LinkedList setList,LinkedList getList, int intVal) {
        setList.head = searching.search(getList.head, intVal);
    }
}
