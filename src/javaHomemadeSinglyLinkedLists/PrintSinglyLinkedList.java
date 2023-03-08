package src.javaHomemadeSinglyLinkedLists;

public class PrintSinglyLinkedList {
    public void traversePrintingLL(SinglyLinkedList LL) {
        SinglyNode temp = LL.head;
        while (temp != null) {
            // non ln print, to print out the data in linked lists
            System.out.print(temp.getData() + " -> "); //print out node data, and an arrow for next line
            temp = temp.getNext(); //set current node to next node
        }
        System.out.println("NULL");
    }
    public void printN(SinglyLinkedList N) {
        // print out current node
        System.out.println(N.head.getData());
    }
}
