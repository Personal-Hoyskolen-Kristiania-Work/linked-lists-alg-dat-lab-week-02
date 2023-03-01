package src.javaHomemadeSinglyLinkedLists;

public class SinglyLinkedListIndex {
    private static LinkedList linkedList = new LinkedList(); //this bad boy can store so many integer values
    private static Insertions insertion = new Insertions();
    private static PrintLinkedList print = new PrintLinkedList();

    public static void main(String args[]){
        // add to head position in linked list
        linkedList = HeadInsertion(linkedList,1);
        linkedList = HeadInsertion(linkedList,4);
        print.pLL(linkedList);
        // add to position after specified node
        linkedList = afterNodeInsertion(linkedList,4, 3);
        linkedList = afterNodeInsertion(linkedList,3, 2);
        print.pLL(linkedList);

    }
    // these functions could have returned the Node class instance,
    // but it's less to write when changing the entire LinkedList class instance instead

    // insert an element at head position
    private static LinkedList HeadInsertion(LinkedList list, int intVal) {
        list.head = insertion.insertAtHead(list.head, intVal);
        return list;
    }

    private static LinkedList afterNodeInsertion(LinkedList list, int key, int intVal) {
        list.head = insertion.insertAfterNodeValue(list.head, key, intVal);
        return list;
    }
}
