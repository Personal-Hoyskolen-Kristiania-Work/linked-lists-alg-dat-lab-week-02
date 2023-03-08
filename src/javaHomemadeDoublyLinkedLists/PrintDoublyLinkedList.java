package src.javaHomemadeDoublyLinkedLists;

public class PrintDoublyLinkedList {
    public void traversePrintingDLL(DoublyLinkedList LL) {
        DoublyNode temp = LL.head;
        while (temp != null) {
            // non ln print, to print out the data in linked lists
            System.out.print(temp.getData() + " -> "); //print out node data, and an arrow for next line
            temp = temp.getNext(); //set current node to next node
        }
        System.out.println("NULL");
    }

    public void reverseTraversePrintingDLL(DoublyLinkedList LL) {
        DoublyNode temp = LL.head;
        while (temp.getNext() != null){
            temp = temp.getNext();
        }
        while (temp != null){
            System.out.print(temp.getData() + " -> ");
            temp = temp.getPrevious();
        }
        System.out.println("NULL");
    }

    public void printN(DoublyLinkedList N) {
        // print out current node
        System.out.println(N.head.getData());
    }
}
