package src.javaHomemadeSinglyLinkedLists;

public class SinglyLinkedListIndex {
    // linked lists
    private static LinkedList linkedListOne = new LinkedList(); //this bad boy can store so many integer values
    private static LinkedList linkedListTwo = new LinkedList();
    // operations
    private static final Insertions insertion = new Insertions();
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
        //endregion

        //region linked list two
        System.out.println("\nLinked list two:");
        // add to head position in linked
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
}
