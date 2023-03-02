package src.javaHomemadeSinglyLinkedLists;

public class PrintLinkedList {
    public void pLL(LinkedList LL) {
        Node temp = LL.head;
        while (temp != null) {
            // non ln print, to print out the data in linked lists
            System.out.print(temp.getData() + " -> "); //print out node data, and an arrow for next line
            temp = temp.getNext(); //set current node to next node
        }
        System.out.println("NULL");
    }
}
